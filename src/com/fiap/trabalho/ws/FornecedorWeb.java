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
		if (autenticado(TipoAcesso.efetuarPedidos)) {

			// Servico Governo
			Double somaTotal = produtos.stream().mapToDouble(Produto::getValor).sum();
			ServicoGoverno servicoGoverno = new ServicoGoverno();
			NotaFiscal notaFiscal = servicoGoverno.emitirNotaFiscal(somaTotal, cnpjCpf);

			System.out.println("teste: " + notaFiscal.getValorTotal());

			// Servico Financeira
			//boolean financeira = new ServicoFinanceiro().debitarServico();

			// Servico Transportadora
			RSResponse response = new ServicoTransportadora().gerarFrete(notaFiscal.getCnpjReceptor(), notaFiscal.getCnpjEmissor());
			
			System.out.println("TESTE");
			System.out.println("MENSAGEM "+response.getMessage());
			
			return true;
		} else {
			throw new Exception("Falha na autenticacão");
		}
	}

}
