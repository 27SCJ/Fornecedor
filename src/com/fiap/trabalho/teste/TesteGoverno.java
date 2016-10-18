package com.fiap.trabalho.teste;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.rpc.ServiceException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

public class TesteGoverno {

	public static void main(String[] args) throws ServiceException {
		/* 
		 WebServiceNFProxy proxy = new WebServiceNFProxy();		 
		 br.com.governo.ws.WebServiceNF port = new WebServiceNFServiceLocator().getWebServiceNFPort(); 

		BindingProvider bp = (BindingProvider) proxy; 
	   Map<String, Object> req_ctx = ((BindingProvider)port).getRequestContext();
	   Map<String, List<String>> headers = new HashMap<String, List<String>>();
	   headers.put("cpf", Collections.singletonList("12345678901"));
	   headers.put("password", Collections.singletonList("123"));
	   req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);	   
	   
		try {
			proxy.emitirNotaFiscal("29216472812", 400.00);
			System.out.println("executou!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		*/
		
	
	}

}
