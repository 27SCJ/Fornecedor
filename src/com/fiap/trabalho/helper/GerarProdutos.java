package com.fiap.trabalho.helper;

import java.util.ArrayList;
import java.util.List;

import com.fiap.trabalho.model.Produto;

public class GerarProdutos {

	private List<Produto> produtos = new ArrayList<>();

	public GerarProdutos() {
		gerarDados();
		// TODO Auto-generated constructor stub
	}

	public List<Produto> getListaGerada() {
		return produtos;
	}

	private void gerarDados() {

		Produto a = new Produto();
		a.setCodigo(1);
		a.setDescricao("Camisa Cavalera Amarela");
		a.setValor(30.3);
		produtos.add(a);

		Produto b = new Produto();
		b.setCodigo(2);
		b.setDescricao("Camisa Infatil Vermelha");
		b.setValor(40.5);
		produtos.add(b);

		Produto c = new Produto();
		c.setCodigo(3);
		c.setDescricao("Bermuda Tommy Hilfiger Lisa Azul P");
		c.setValor(30.5);
		produtos.add(c);

		Produto d = new Produto();
		d.setCodigo(4);
		d.setDescricao("Bermuda Generica Vermelha G");
		d.setValor(20.5);
		produtos.add(d);

	}
}
