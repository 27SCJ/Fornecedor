package com.fiap.trabalho.helper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.governo.ws.Exception_Exception;
import br.com.governo.ws.NotaFiscal;
import br.com.transportadora.entity.Frete;
import br.com.transportadora.entity.RSResponse;
import br.com.transportadora.entity.Remessa;

public class ServicoTransportadora {

	private static final String WS_REST_TRANSPORTADORA = "http://35.160.30.34:8080/Transportadora";
	private static final String WS_FRETE = "frete";
	private static final String WS_GERAR = "gerar";

	public RSResponse gerarFrete(String destinatario, String remetente,int numeroProdutos, double valorTotal) {
		
		Remessa remessa = new Remessa();
		remessa.setDocumentoDestinatario(destinatario);
		remessa.setDocumentoRemetente(remetente);
		Frete frete = new Frete();
		frete.setNumeroDeProdutos(numeroProdutos);
		frete.setValorTotalDaRemessa(valorTotal);
		remessa.setFrete(frete);

		Client client = ClientBuilder.newClient();
		client.register(new HttpBasicAuthFilter("cliente", "2468"));
		WebTarget webTarget = client.target(WS_REST_TRANSPORTADORA).path(WS_FRETE).path(WS_GERAR);
		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
		Response response = invocationBuilder.post(Entity.entity(remessa, MediaType.APPLICATION_XML));
		RSResponse resp = response.readEntity(RSResponse.class);
		return resp;
		
	}
	
	
}
