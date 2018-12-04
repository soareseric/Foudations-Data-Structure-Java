package com.ericsoares.datastructure.vetores;

import com.ericsoares.datastructure.domain.Pessoa;

public class Vetor {

	private Pessoa[] pessoas;
	
	public Vetor(int capacidade) {
		this.pessoas = new Pessoa[capacidade];
	}
	
	public void inserirEm(int posicao, Pessoa pessoa) {
		this.pessoas[posicao] = pessoa;	
	}
	
	public Pessoa recuperar(int posicao) {
		return this.pessoas[posicao];
	}
}
