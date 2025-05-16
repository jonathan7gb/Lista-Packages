package br.com.appbolsavalores.model;

import java.util.Scanner;

public class BolsaValores {
	
	private String nome_empresa;
	private double preco_acao;
	private double volume_negociacoes;
	private double variacao_diaria;

	public void preencher(Scanner scannerStr, Scanner scannerNum) {
		System.out.print("Nome da empresa: ");
		this.nome_empresa = scannerStr.nextLine();

		System.out.print("Preço da ação: R$");
		this.preco_acao = scannerNum.nextDouble();

		System.out.print("Volume de negociações: ");
		this.volume_negociacoes = scannerNum.nextDouble();

		System.out.print("Variação diária: ");
		this.variacao_diaria = scannerNum.nextDouble();
		
	}

	public void imprimir(int id) {
		System.out.println("["+id+"]");
        System.out.println("Nome da empresa: " + nome_empresa);
		System.out.println("Preço da ação: R$" + preco_acao);
		System.out.println("Volume de negociações: " + volume_negociacoes);
		System.out.println("Variação diária: " + variacao_diaria);
		System.out.println("--------------------------");
	}
}