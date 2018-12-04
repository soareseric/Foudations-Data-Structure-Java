package com.ericsoares.datastructure.main;

import java.util.Scanner;

import com.ericsoares.datastructure.domain.Pessoa;
import com.ericsoares.datastructure.vetores.Vetor;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a opção desejada");
		System.out.println("1. Gerenciamento de memoria");
		System.out.println("2. Vetores");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1: fazerGerenciamentoMemoria(); break;
		case 2: fazerVetores(); break;
		default: System.out.println("Escolha somente uma das opções acima!"); break;

		}
		sc.close();
	}

	private static void fazerGerenciamentoMemoria() {
		System.out.println("Será criado em breve...");
	}

	private static void fazerVetores() {
		// indice sempre começa por 0
		Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>(3);
		vetorPessoas.inserirEm(0, new Pessoa(1, "Pessoa1"));
		System.out.println(vetorPessoas.recuperar(0).getName());
		Vetor<Integer> vetorInteiro = new Vetor<Integer>(2); // INTERNAMENTE A JVM ESTA FAZENDO ' CASTINGS ' EM CADA DECLARAÇÃO DO TIPO DA CLASSE VETOR. NÃO PODE SER USADO TIPOS PRIMITIVOS, APENAS WRAPPERS
		vetorInteiro.inserirEm(0, 1);
		System.out.println(vetorInteiro.recuperar(0));
	}
}
