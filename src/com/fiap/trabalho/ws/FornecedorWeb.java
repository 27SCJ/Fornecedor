package com.fiap.trabalho.ws;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import com.fiap.trabalho.helper.Autenticar;
import com.fiap.trabalho.helper.GerarProdutos;
import com.fiap.trabalho.helper.ServicoFinanceiro;
import com.fiap.trabalho.helper.ServicoGoverno;
import com.fiap.trabalho.model.Produto;
import br.com.governo.ws.NotaFiscal;
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
	public boolean autenticado(String Tipo) {

		MessageContext mctx = wsctx.getMessageContext();
		Autenticar autenticar = new Autenticar();
		return autenticar.validaAutenticacao(Tipo, mctx);

	}

	@WebMethod
	public List<Produto> listarProdutos() throws Exception {
		if (autenticado("listarProdutos")) {
			return produtos;
		} else {
			throw new Exception("Falha na autenticação");
		}
	}

	@WebMethod
	public boolean efetuarPedido(@WebParam(name = "cnpjCpf", header = false) String cnpjCpf,
			@WebParam(name = "produtos", header = false) List<Produto> produtos) throws Exception {
		if (autenticado("efetuarPedido")) {

			// Servico Governo
			Double somaTotal = produtos.stream().mapToDouble(Produto::getValor).sum();
			ServicoGoverno servicoGoverno = new ServicoGoverno();
			NotaFiscal notaFiscal = servicoGoverno.emitirNotaFiscal(somaTotal, cnpjCpf);

			System.out.println("teste: " + notaFiscal.getValorTotal());

			// Servico Financeira
			boolean financeira = new ServicoFinanceiro().debitarServico();

			return true;
		} else {
			throw new Exception("Falha na autenticacão");
		}
	}

}
