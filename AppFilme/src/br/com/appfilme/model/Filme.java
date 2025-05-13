package br.com.appfilme.model;

import java.util.Scanner;

public class Filme {
	
	private String titulo;
	private String artista;
	private int duracao;
	private double preco;

	public void preencher(Scanner scannerStr, Scanner scannerNum) {
		System.out.print("Título: ");
		this.titulo = scannerStr.nextLine();

		System.out.print("Artista: ");
		this.artista = scannerStr.nextLine();

		System.out.print("Duração: ");
		this.duracao = scannerNum.nextInt();

		System.out.print("Preço: R$");
		this.preco = scannerNum.nextDouble();
		
	}

	public void imprimir(int id) {
		System.out.println("["+id+"]");
        System.out.println("Título: " + titulo);
		System.out.println("Artista: " + artista);
		System.out.println("Duração: " + duracao);
		System.out.println("Preço: R$" + preco);
		System.out.println("--------------------------");
	}
}