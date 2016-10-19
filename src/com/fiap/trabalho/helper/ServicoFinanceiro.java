package com.fiap.trabalho.helper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import br.com.fiap.endpoint.Cliente;
import br.com.fiap.endpoint.CobrarMensalidade;
import br.com.fiap.endpoint.EndpointFinanceiro;
import br.com.fiap.endpoint.EndpointFinanceiroService;
import br.com.governo.ws.Exception_Exception;
import br.com.governo.ws.NotaFiscal;

public class ServicoFinanceiro {

	private static final String WS_URL_FINANCEIRO = "http://54.191.197.37:8080/FinanceiroWS/EndpointFinanceiro?wsdl";
	
	public boolean debitarServico() throws br.com.fiap.endpoint.Exception_Exception {
		
		EndpointFinanceiroService financeiro = new EndpointFinanceiroService();
		EndpointFinanceiro financeiroFuncoes = financeiro.getEndpointFinanceiroPort();
		
		Map<String, Object> req_ctx = ((BindingProvider) financeiroFuncoes).getRequestContext();
		req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL_FINANCEIRO);

		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
		Cliente cliente = new Cliente();
		cliente.setIdentificador("teste345");
		cliente.setNome("juancho345");
		cliente.setSaldo(5000.0);
		cliente.setSenha("123");
		cliente.setUsuario("teste57");
		financeiroFuncoes.cadastrarCliente(cliente);
		System.out.println("ENtro aqui 1");

		CobrarMensalidade cobrar = new CobrarMensalidade();
		cobrar.setIndentificador(cliente.getIdentificador());
		return financeiroFuncoes.cobrar("teste345", 300.0);
		
	}
	
}
