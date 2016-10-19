package br.com.transportadora.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="remessas")
@XmlAccessorType(XmlAccessType.FIELD)
public class Remessas {

	@XmlElement(name="remessa")
	private List<Remessa> remessaList;

	public List<Remessa> getRemessaList() {
		return remessaList;
	}

	public void setRemessaList(List<Remessa> remessaList) {
		this.remessaList = remessaList;
	}
	
}
