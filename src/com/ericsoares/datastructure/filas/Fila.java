package com.ericsoares.datastructure.filas;

import com.ericsoares.datastructure.listasligadas.ListaLigada;

public class Fila<T> {

	private ListaLigada<T> elementos;
	
	public Fila() {
		this.elementos = new ListaLigada<T>();
	}
	
	public void enfileirar(T elemento) {
		this.elementos.inserir(elemento);
	}
	
	public T desemfileirar() {
		if (estaVazia()) {
			return null;
		}
		T resultado = this.elementos.recuperar(0);
		this.elementos.remover(0);
		return resultado;
	}
	
	public boolean estaVazia() {
		return this.elementos.estaVazia();
	}
	
	
}
	