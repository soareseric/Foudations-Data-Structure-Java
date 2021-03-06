package com.ericsoares.datastructure.main;

import java.util.Scanner;

import com.ericsoares.datastructure.domain.Pessoa;
import com.ericsoares.datastructure.filas.Fila;
import com.ericsoares.datastructure.listasligadas.ListaDuplamenteLigada;
import com.ericsoares.datastructure.listasligadas.ListaLigada;
import com.ericsoares.datastructure.pilhas.Pilha;
import com.ericsoares.datastructure.vetores.Vetor;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//OBS: VETORES : VECTOR E ARRAYLIST
		//OBS: LISTAS LIGADAS E DUPLAMENTE LIGADAS : LINKEDLIST
		//OBS: PILHAS : STACK ( HERDA OS CONCEITOS DE LISTAS LIGADAS E DUPLAMENTE LIGADAS )
		
		System.out.println("Digite a op��o desejada");
		System.out.println("1. Gerenciamento de memoria");
		System.out.println("2. Vetores");
		System.out.println("3. Lista Ligada");
		System.out.println("4. Lista duplamente ligada");
		System.out.println("5. Pilhas");
		System.out.println("6. Filas");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1: fazerGerenciamentoMemoria(); break;
		case 2: fazerVetores(); break;
		case 3: fazerListaLigada(); break;
		case 4: fazerListasDuplamenteLigadas(); break;
		case 5: fazerPilhas(); break;
		case 6: fazerFilas(); break;
		default: System.out.println("Escolha somente uma das op��es acima!"); break;

		}
		sc.close();
	}

	private static void fazerFilas() {
		Fila<Pessoa> filaPessoas = new Fila<Pessoa>();
		System.out.println(filaPessoas.estaVazia());
		filaPessoas.enfileirar(new Pessoa(1, "Pessoa 1"));
		filaPessoas.enfileirar(new Pessoa(2, "Pessoa 2"));
		System.out.println(filaPessoas.toString());
		Pessoa p = filaPessoas.desemfileirar();
		System.out.println(p.toString());
		System.out.println(filaPessoas.toString());
	}

	private static void fazerPilhas() {
		Pilha<Pessoa> pilhaPessoas = new Pilha<Pessoa>();
		System.out.println(pilhaPessoas.estaVazia());
		pilhaPessoas.empilhar(new Pessoa(1, "Pessoa 1"));
		pilhaPessoas.empilhar(new Pessoa(2, "Pessoa 2"));
		pilhaPessoas.empilhar(new Pessoa(3, "Pessoa 3"));
		Pessoa p1 = pilhaPessoas.desempilhar();
		System.out.println(p1.toString());
	}

	private static void fazerListasDuplamenteLigadas() {
		ListaDuplamenteLigada<Pessoa> listaPessoa = new ListaDuplamenteLigada<Pessoa>();
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
		System.out.println("Ser� criado em breve...");
	}

	private static void fazerVetores() {	
		// indice sempre come�a por 0
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
