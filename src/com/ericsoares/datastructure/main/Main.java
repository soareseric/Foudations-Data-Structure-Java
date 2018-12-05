package com.ericsoares.datastructure.main;

import java.util.Scanner;

import com.ericsoares.datastructure.domain.Pessoa;
import com.ericsoares.datastructure.listasligadas.ListaLigada;
import com.ericsoares.datastructure.vetores.Vetor;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//OBS: VETORES : VECTOR E ARRAYLIST
		//OBS: LISTAS LIGADAS: LINKEDLIST
		
		System.out.println("Digite a opção desejada");
		System.out.println("1. Gerenciamento de memoria");
		System.out.println("2. Vetores");
		System.out.println("3. Lista Ligada");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1: fazerGerenciamentoMemoria(); break;
		case 2: fazerVetores(); break;
		case 3: fazerListaLigada(); break;
		default: System.out.println("Escolha somente uma das opções acima!"); break;

		}
		sc.close();
	}

	private static void fazerListaLigada() {
		ListaLigada<Pessoa> listaPessoa = new ListaLigada<Pessoa>();
		listaPessoa.inserir(new Pessoa(1, "Pessoa 1"));
		listaPessoa.inserir(new Pessoa(2, "Pessoa 2"));
		listaPessoa.inserir(new Pessoa(3, "Pessoa 3"));
		listaPessoa.inserirEm(1, new Pessoa(4, "Pessoa 4"));
		listaPessoa.inserirPrimeiro(new Pessoa(5, "Pessoa 5"));
		listaPessoa.inserirUltimo(new Pessoa(6, "Pessoa 6"));
		System.out.println(listaPessoa.toString());
		Pessoa p = listaPessoa.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(100, "Pessoa 100");
		System.out.println(listaPessoa.contem(p));
		System.out.println(listaPessoa.contem(pessoaErrada));
		System.out.println(listaPessoa.indice(p));
		System.out.println(listaPessoa.indice(pessoaErrada));
		listaPessoa.remover(0);
		System.out.println(listaPessoa.toString());
		listaPessoa.remover(p);
		System.out.println(listaPessoa.toString());
		System.out.println("Lista de pessoas");
		for(int i = 0; i < listaPessoa.tamanho(); i++) {
			System.out.println(listaPessoa.recuperar(i).toString());
		}
	}

	private static void fazerGerenciamentoMemoria() {
		System.out.println("Será criado em breve...");
	}

	private static void fazerVetores() {	
		// indice sempre começa por 0
		Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>();
		vetorPessoas.inserir(new Pessoa(1, "Pessoa 1"));
		vetorPessoas.inserir(new Pessoa(2, "Pessoa 2"));
		vetorPessoas.inserir(new Pessoa(3, "Pessoa 3"));
		vetorPessoas.inserir(new Pessoa(4, "Pessoa 4"));
		vetorPessoas.inserirEm(1, new Pessoa(5, "Pessoa 5"));;
		System.out.println(vetorPessoas.toString());
		System.out.println("Lista de pessoas: ");
		for (int i = 0; i < vetorPessoas.tamanho(); i++) {
			System.out.println(vetorPessoas.recuperar(i).getName());
		}
		Pessoa p = vetorPessoas.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(100, "Pessoa 100");
		System.out.println(vetorPessoas.contem(p));
		System.out.println(vetorPessoas.contem(pessoaErrada));
		System.out.println(vetorPessoas.indice(p));
		System.out.println(vetorPessoas.indice(pessoaErrada));
		vetorPessoas.remover(2);
		System.out.println(vetorPessoas.toString());
		vetorPessoas.remover(p);
		System.out.println(vetorPessoas.toString());
	}
}
