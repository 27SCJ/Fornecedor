package com.fiap.trabalho.ws;

import java.util.List;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import com.fiap.trabalho.enums.TipoAcesso;
import com.fiap.trabalho.helper.Autenticar;
import com.fiap.trabalho.helper.GerarProdutos;
import com.fiap.trabalho.helper.ServicoFinanceiro;
import com.fiap.trabalho.helper.ServicoGoverno;
import com.fiap.trabalho.helper.ServicoTransportadora;
import com.fiap.trabalho.model.Produto;

import br.com.governo.ws.Exception_Exception;
import br.com.governo.ws.NotaFiscal;
import br.com.transportadora.entity.RSResponse;
@WebService
public class FornecedorWeb {

	static private List<Produto> produtos = null;

	public FornecedorWeb() {
		GerarProdutos gerarProdutos = new GerarProdutos();
		produtos = gerarProdutos.getListaGerada();
		// TODO Auto-generated constructor stub
	}

	@Resource
	WebServiceContext wsctx;

	@WebMethod(exclude = true)
	public boolean autenticado(TipoAcesso Tipo) {

		MessageContext mctx = wsctx.getMessageContext();
		Autenticar autenticar = new Autenticar();
		return autenticar.validaAutenticacao(Tipo, mctx);

	}

	@WebMethod
	public List<Produto> listarProdutos() throws Exception {
		if (autenticado(TipoAcesso.listarProdutos)) {
			return produtos;
		} else {
			throw new Exception("Falha na autenticação");
		}
	}

	@WebMethod
	public boolean efetuarPedido(@WebParam(name = "cnpjCpf", header = false) String cnpjCpf,
			@WebParam(name = "produtos", header = false) List<Produto> produtos) throws Exception {
		boolean retorno=false;
		if (autenticado(TipoAcesso.efetuarPedidos)) {

			try {
				
				// Servico Governo
				/*
				 * O metodo esta apresentando um erro de WFLYEJB0168: 
				 * Could not find EJB with id UnknownSessionID 
				 * [6852555557567055505749695250575466575467526569485357675457566748] 
				 * antes ele não apresentaba esse erro mas agora esta aparecendo pelo dando 
				 * erro vai retornar sempre false porque entra para o Exception_Exception
				 * */
				Double somaTotal = produtos.stream().mapToDouble(Produto::getValor).sum();
				ServicoGoverno servicoGoverno = new ServicoGoverno();
				NotaFiscal notaFiscal = servicoGoverno.emitirNotaFiscal(somaTotal, cnpjCpf);
				retorno =true;
				
				// Servico Financeira
				/*
				 * O servico financeira tem uma coisa que é meio estranha porque ele primeiro pede para cadastrar um cliente
				 * para logo receber um cnpjcpf, ele nao esta autogerando um usuario e senha pelo que no nosso teste temos que enviar dados diferentes
				 * cada vez que queramos testar mas isso vai ser via codigo(hardcode)
				 * */
				retorno = new ServicoFinanceiro().debitarServico(cnpjCpf,somaTotal);
				
				RSResponse response = null;
				
				// Servico Transportadora
				/*
				 * No servico transportadora ele tem que receber a nota fiscal mas ai tem dois metodos tipo get Cpf e Cnpj isso faz que por enquanto 
				 * a gente só passe o CPf ou Cnpj( a gente pensaba que o metodo ia a ser getCpfCnpjReceptor() ou seja que poderia receber tanto cpf como cnpj)
				 * */
				if(retorno)
					response = new ServicoTransportadora().gerarFrete(notaFiscal.getCpfReceptor(), notaFiscal.getCpfEmissor(),produtos.size(),somaTotal);
				
				retorno = response == null ? false : true;
				
			} catch (Exception_Exception e ) {
				e.printStackTrace();
				return false;
			} catch (br.com.fiap.endpoint.Exception_Exception e) {
				e.printStackTrace();
				return false;
			}
			
			return retorno;
		} else {
			throw new Exception("Falha na autenticacão");
		}
	}

}
