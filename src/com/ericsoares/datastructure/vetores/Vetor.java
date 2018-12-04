package com.ericsoares.datastructure.vetores;

import java.util.Arrays;

// O <T> É UM PARAMETRO GENERICO
// NO CASO DE VETORES, A JVM PRECISA NECESSEARIAMENTE SABER O TIPO DE DADO QUE SERA UTILIZADO
public class Vetor<T> {

	// TODA CLASSE POSSUI HERANÇA DA CLASSE OBJECT / DEIXAMOS DE USAR SOMENTE O PARAMETRO GENERICO 'T', POIS, A JVM PRECISA SABER O TIPO DE DADO PARA FAZER A ALOCACAO DA MEMORIA DE FORMA CORRETA
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
	
	// METODO PARA TORNAR UM VETOR EXPANSIVEL
	public void inserir(T elemento) {
		if(this.posicao >= this.elementos.length) {
			this.elementos = Arrays.copyOf(this.elementos, this.elementos.length + 1);
		}
		this.elementos[this.posicao] = elemento;    // USANDO O VALOR DEFAULT DA POSICAO, NO CASO 0
		this.posicao++;
	}
	
	// CHEAT
	public void inserirEm(int posicao, T elemento) { // USANDO UM VALOR QUE SERA FORNECIDO PELO USUARIO PARA A POSICAO
		if (posicao > this.elementos.length) {
			throw new IllegalArgumentException(String.format("A formação é invalida [%d]", posicao));
		}
		if (this.elementos[posicao] != null) {
			// 1, 2, 3 ,4 
			// 1, 5, 2, 3, 4
			Object[] arrayFinal = Arrays.copyOfRange(this.elementos, posicao, this.elementos.length);
			Object[] arrayInicio = new Object[posicao + 1];
			System.arraycopy(this.elementos, 0, arrayInicio, 0, posicao);
			arrayInicio[arrayInicio.length - 1] = elemento;
			// arrayFinal = 2,3,4
			// arrayInicio = 1, 5
			int novoTamanho = arrayFinal.length + arrayInicio.length;
			this.elementos = new Object[novoTamanho];
			System.arraycopy(arrayInicio, 0, this.elementos, 0, arrayInicio.length);
			System.arraycopy(arrayFinal, 0, this.elementos, arrayInicio.length, arrayFinal.length);
		} else {
			this.elementos[posicao] = elemento;
		}
	}
	
	@SuppressWarnings("unchecked")  	// ANNOTATION PARA SUPRIMIR UM WARNING
	public T recuperar(int posicao) {
		return (T)this.elementos[posicao]; // CASTING DA CLASSE OBJECT PARA T(GENERICO)
	}

	@Override
	public String toString() {
		return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
	}	
}
