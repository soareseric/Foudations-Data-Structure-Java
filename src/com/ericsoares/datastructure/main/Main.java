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
	}
}
