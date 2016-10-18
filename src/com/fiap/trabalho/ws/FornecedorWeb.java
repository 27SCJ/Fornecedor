package com.fiap.trabalho.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService
public class FornecedorWeb {

	static private List<Produto> produtos;

	@Resource
	WebServiceContext wsctx;

	static {
		produtos = new ArrayList<Produto>();

		Produto a = new Produto();
		a.setCodigo(1);
		a.setDescricao("Camisa Cavalera Amarela");
		a.setValor(30.3);
		produtos.add(a);

		Produto b = new Produto();
		b.setCodigo(2);
		b.setDescricao("Camisa Infatil Vermelha");
		b.setValor(40.5);
		produtos.add(b);

		Produto c = new Produto();
		c.setCodigo(3);
		c.setDescricao("Bermuda Tommy Hilfiger Lisa Azul P");
		c.setValor(30.5);
		produtos.add(c);

		Produto d = new Produto();
		d.setCodigo(4);
		d.setDescricao("Bermuda Generica Vermelha G");
		d.setValor(20.5);
		produtos.add(d);

	}

	@SuppressWarnings("unchecked")
	@WebMethod(exclude = true)
	public boolean autenticado(String Tipo) {
		MessageContext mctx = wsctx.getMessageContext();

		@SuppressWarnings("rawtypes")
		Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
		@SuppressWarnings({ "rawtypes" })
		List<String> usuarios = (List) http_headers.get("Username");
		@SuppressWarnings("rawtypes")
		List<String> senhas = (List) http_headers.get("Password");

		String usuario = "";
		String senha = "";

		if (usuarios != null) {
			usuario = usuarios.get(0);
		}

		if (senhas != null) {
			senha = senhas.get(0);

		}
		

		if (Tipo.equals("listarProdutos")   && usuario.equals("listar") && senha.equals("123")) {
			return true;
		} else if (Tipo.equals("efetuarPedido")  && usuario.equals("efetuar") && senha.equals("456")) {
			return true;
		}
		else {
			return false;
		}
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
	public boolean efetuarPedido(@WebParam(name="cnpjCpf", header=false) String cnpjCpf, 
			@WebParam(name="produtos", header=false) List<Produto> produtos) throws Exception {
		if (autenticado("efetuarPedido")) {
			// Consumo Grupo Governo

			// Consumo Grupo Financeira

			// Consumo Grupo Transportadora

			// Se o resultado das três chamadas acima forem verdadeiras,
			// retornaremos true

			return true;
		} else {
			throw new Exception("Falha na autenticação");
		}
	}

}
