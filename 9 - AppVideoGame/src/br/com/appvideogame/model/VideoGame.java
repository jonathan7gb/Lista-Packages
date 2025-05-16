package br.com.appvideogame.model;

import java.util.Scanner;

public class VideoGame {
	
	private String titulo;
	private String plataforma;
	private String classificacao_etaria;
	private double preco;

	public void preencher(Scanner scannerStr, Scanner scannerNum) {
		System.out.print("Título: ");
		this.titulo = scannerStr.nextLine();

		System.out.print("Plataforma: ");
		this.plataforma = scannerStr.nextLine();

		System.out.print("Classificação Etária (ex: 18+): ");
		this.classificacao_etaria = scannerStr.nextLine();

		System.out.print("Preço: R$");
		this.preco = scannerNum.nextDouble();
		
	}

	public void imprimir(int id) {
		System.out.println("["+id+"]");
        System.out.println("Título: " + titulo);
		System.out.println("Plataforma: " + plataforma);
		System.out.println("Classificação Etária: " + classificacao_etaria);
		System.out.println("Preço: R$" + preco);
		System.out.println("--------------------------");
	}
}