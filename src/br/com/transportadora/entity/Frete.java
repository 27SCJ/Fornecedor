package br.com.transportadora.entity;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Frete {

	@XmlElement(required=true)
	private int numeroDeProdutos;
	
	@XmlElement(required=true)
	private double valorTotalDaRemessa;
	
	public int getNumeroDeProdutos() {
		return numeroDeProdutos;
	}
	public void setNumeroDeProdutos(int numeroDeProdutos) {
		this.numeroDeProdutos = numeroDeProdutos;
	}
	public double getValorTotalDaRemessa() {
		return valorTotalDaRemessa;
	}
	public void setValorTotalDaRemessa(double valorTotalDaRemessa) {
		this.valorTotalDaRemessa = valorTotalDaRemessa;
	}
	
	
}
