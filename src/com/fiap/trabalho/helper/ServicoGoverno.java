package com.fiap.trabalho.helper;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import br.com.governo.ws.Exception_Exception;
import br.com.governo.ws.NotaFiscal;
import br.com.governo.ws.WebServiceNF;
import br.com.governo.ws.WebServiceNFService;

public class ServicoGoverno {

	private static final String WS_URL_GOVERNO = "http://fiapgoverno.brazilsouth.cloudapp.azure.com:8080/Governo/WebServiceNF?wsdl";

	public NotaFiscal emitirNotaFiscal(double somaTotal, String cnpjCpf) throws Exception_Exception {

		// Consumo Grupo Governo "12345678901"
		WebServiceNFService validate = new WebServiceNFService();
		WebServiceNF emitir = validate.getWebServiceNFPort();

		Map<String, Object> req_ctx = ((BindingProvider) emitir).getRequestContext();
		req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL_GOVERNO);
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		headers.put("cpf", Collections.singletonList("12345678901"));
		headers.put("password", Collections.singletonList("123"));
		req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		NotaFiscal nota = emitir.emitirNotaFiscal(cnpjCpf, somaTotal);

		return nota;
	}

}
