package com.fiap.trabalho.teste;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.rpc.ServiceException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import br.com.governo.ws.Exception_Exception;
import br.com.governo.ws.NotaFiscal;
import br.com.governo.ws.WebServiceNF;
import br.com.governo.ws.WebServiceNFService;

public class TesteGoverno {

	private static final String WS_URL_GOVERNO = "http://fiapgoverno.brazilsouth.cloudapp.azure.com:8080/Governo/WebServiceNF?wsdl";
	
	
	public static void main(String[] args) throws ServiceException, Exception_Exception {
		// Consumo Grupo Governo
		WebServiceNFService validate = new WebServiceNFService();
		WebServiceNF emitir = validate.getWebServiceNFPort();
		/***** Usuario e Senha **/
		Map<String, Object> req_ctx = ((BindingProvider) emitir).getRequestContext();
		req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL_GOVERNO);

		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		headers.put("cpf", Collections.singletonList("12345678901"));
		headers.put("password", Collections.singletonList("123"));
		req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		/**********************************************************************/
		
		NotaFiscal nota = emitir.emitirNotaFiscal("29216472812", 400.00);
		
		System.out.println("Teste");
		System.out.println(nota.getValorTotal());
	}

}
