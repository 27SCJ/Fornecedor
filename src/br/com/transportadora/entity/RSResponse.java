package br.com.transportadora.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class RSResponse {

	private String message;
	private Object value;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getvalue() {
		return value;
	}

	public void setvalue(Object value) {
		this.value = value;
	}
	
	
}
