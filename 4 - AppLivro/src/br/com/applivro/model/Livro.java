package br.com.applivro.model;

import java.util.Scanner;

public class Livro {
	
	private String titulo;
	private String autor;
	private int numPag;
	private double preco;

	public void preencher(Scanner scannerStr, Scanner scannerNum){
        System.out.print("Insira o titulo do livro: ");
        this.titulo = scannerStr.nextLine();

        System.out.print("Insira o autor do livro: ");
        this.autor = scannerStr.nextLine();

        System.out.print("Insira o total de páginas do livro: ");
        this.numPag = scannerNum.nextInt();

        System.out.print("Insira o preço do livro: R$");
        this.preco = scannerNum.nextDouble();
    }

    public void imprimir(int id){
        System.out.println("["+id+"]");
        System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Número de páginas: " + numPag);
		System.out.println("Preço: R$" + preco);
		System.out.println("--------------------------");
	
    }

}
