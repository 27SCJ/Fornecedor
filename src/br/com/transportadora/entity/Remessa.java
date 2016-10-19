package br.com.transportadora.entity;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Remessa {

	@XmlElement(required=true)
	private String documentoRemetente;
	
	@XmlElement(required=true)
	private String documentoDestinatario;
	
	@XmlElement(required=false)
	private double valorFrete;
	
	@XmlElement(required=true)
	private Frete frete;
	
	public String getDocumentoRemetente() {
		return documentoRemetente;
	}
	public void setDocumentoRemetente(String documentoRemetente) {
		this.documentoRemetente = documentoRemetente;
	}
	public String getDocumentoDestinatario() {
		return documentoDestinatario;
	}
	public void setDocumentoDestinatario(String documentoDestinatario) {
		this.documentoDestinatario = documentoDestinatario;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	public Frete getFrete() {
		return frete;
	}
	public void setFrete(Frete frete) {
		this.frete = frete;
	}
	
}
