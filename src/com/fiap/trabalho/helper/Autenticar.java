package com.fiap.trabalho.helper;

import java.util.List;
import java.util.Map;

import javax.xml.ws.handler.MessageContext;

public class Autenticar {

	
	public boolean validaAutenticacao(String tipo,MessageContext mctx){
		
		@SuppressWarnings("rawtypes")
		Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<String> usuarios = (List) http_headers.get("Username");
		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<String> senhas = (List) http_headers.get("Password");

		String usuario = "";
		String senha = "";

		if (usuarios != null) {
			usuario = usuarios.get(0);
		}

		if (senhas != null) {
			senha = senhas.get(0);
		}

		if (tipo.equals("listarProdutos") && usuario.equals("listar") && senha.equals("123"))
			return true;
		else if (tipo.equals("efetuarPedido") && usuario.equals("efetuar") && senha.equals("456"))
			return true;
		else
			return false;
		
	}
	
}
