package com.ericsoares.datastructure.vetores;

// O <T> É UM PARAMETRO GENERICO
public class Vetor<T> {

	// TODO CLASSE POSSUI HERANÇA DA CLASSE OBJECT 
	private Object[] elementos; 
	private int posicao;
	
	public Vetor(int capacidade) {
		this.elementos = new Object[capacidade];  // FORNECENDO UM VALOR PARAMETRIZADO DA CAPACIDADE DO VETOR
		this.posicao = 0;
	}
	
	public Vetor() {
		this.elementos = new Object[3]; // DEIXANDO UM VALOR DEFAULT DA CAPACIDADE
		this.posicao = 0;
	}
	
	public void inserir(T elemento) {
		this.elementos[this.posicao] = elemento;    // USANDO O VALOR DEFAULT DA POSICAO, NO CASO 0
		this.posicao++;
	}
	
	public void inserirEm(int posicao, T elemento) { 		// USANDO UM VALOR QUE SERA FORNECIDO PELO USUARIO PARA A POSICAO
		if(posicao < this.elementos.length) {
			throw new IllegalArgumentException(String.format("A formação é invalida [%d]", posicao));
		}
		this.elementos[posicao] = elemento;	
	}
	
	@SuppressWarnings("unchecked")  	// ANNOTATION PARA SUPRIMIR UM WARNING
	public T recuperar(int posicao) {
		return (T)this.elementos[posicao]; // CASTING DA CLASSE OBJECT PARA T(GENERICO)
	}
}
