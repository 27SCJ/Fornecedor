package com.fiap.trabalho.teste;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.rpc.ServiceException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import br.com.fiap.endpoint.Cliente;
import br.com.fiap.endpoint.CobrarMensalidade;
import br.com.fiap.endpoint.EndpointFinanceiro;
import br.com.fiap.endpoint.EndpointFinanceiroService;
import br.com.governo.ws.Exception_Exception;
import br.com.governo.ws.NotaFiscal;
import br.com.governo.ws.WebServiceNF;
import br.com.governo.ws.WebServiceNFService;

public class TesteGoverno {

	private static final String WS_URL_FINANCEIRO = "http://54.191.197.37:8080/FinanceiroWS/EndpointFinanceiro?wsdl";

	public static void main(String[] args)
			throws ServiceException, Exception_Exception, br.com.fiap.endpoint.Exception_Exception {
		// Consumo Grupo Governo
		/*
		 * WebServiceNFService validate = new WebServiceNFService();
		 * WebServiceNF emitir = validate.getWebServiceNFPort(); /***** Usuario
		 * e Senha
		 **/
		// Map<String, Object> req_ctx = ((BindingProvider)
		// emitir).getRequestContext();
		// req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
		// WS_URL_GOVERNO);
		//
		// Map<String, List<String>> headers = new HashMap<String,
		// List<String>>();
		// headers.put("cpf", Collections.singletonList("12345678901"));
		// headers.put("password", Collections.singletonList("123"));
		// req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		// /**********************************************************************/
		//
		// NotaFiscal nota = emitir.emitirNotaFiscal("29216472812", 400.00);
		//
		// System.out.println("Teste");
		// System.out.println(nota.getValorTotal());
		EndpointFinanceiroService financeiro = new EndpointFinanceiroService();
		EndpointFinanceiro financeiroFuncoes = financeiro.getEndpointFinanceiroPort();

		/***** Usuario e Senha **/
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
		financeiroFuncoes.cobrar("teste345", 300.0);
		/**********************************************************************/
		System.out.println("ENtro aqui");
	}

}
