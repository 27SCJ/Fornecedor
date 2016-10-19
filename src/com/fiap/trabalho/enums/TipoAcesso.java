package com.fiap.trabalho.enums;

public enum TipoAcesso {

	listarProdutos(1), efetuarPedidos(2);

	private int tipo;

	TipoAcesso(int tipo) {
		this.tipo = tipo;
	}

	public int getTipo() {
		return this.tipo;
	}

}
