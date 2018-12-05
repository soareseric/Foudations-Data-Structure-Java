package com.ericsoares.datastructure.pilhas;

import com.ericsoares.datastructure.listasligadas.ListaDuplamenteLigada;

public class Pilha<T> {

	private ListaDuplamenteLigada<T> elementos;
	
	public Pilha() {
		this.elementos = new ListaDuplamenteLigada<T>();
	}
	
	public boolean estaVazia() {
		return this.elementos.estaVazia();
	}
	
	public void impilhar(T elemento) {
		this.elementos.inserir(elemento);
	}
}
