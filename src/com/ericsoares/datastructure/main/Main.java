package com.ericsoares.datastructure.main;

import java.util.Scanner;

import com.ericsoares.datastructure.domain.Pessoa;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a op��o desejada");
		System.out.println("1. Gerenciamento de memoria");
		System.out.println("2. Vetores");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1: fazerGerenciamentoMemoria(); break;
		case 2: fazerVetores(); break;
		default: System.out.println("Escolha somente uma das op��es acima!"); break;

		}
		sc.close();
	}

	private static void fazerGerenciamentoMemoria() {
		System.out.println("Ser� criado em breve...");
	}

	private static void fazerVetores() {
		// indice sempre come�a por 0
		Pessoa[] vetorPessoas = new Pessoa[3];
		vetorPessoas[0] = new Pessoa(1, "Pessoa 1");
		System.out.println(vetorPessoas[0].getName());
		// System.out.println(vetorPessoas[1].getName()); // Ir� dar um Null Point exception, devido a ser um reference type
		int[] vetorInteiro = new int[3];
		System.out.println(vetorInteiro[0]); // J� esse vetor ir� dar certo, devido a ser um valueType
	}
}
