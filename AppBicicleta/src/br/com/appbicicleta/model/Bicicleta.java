package br.com.appbicicleta.model;

import java.util.Scanner;

public class Bicicleta {
	
	private String marca;
	private String modelo;
	private double tamanhoQuadro;
	private double preco;

	public void preencher(Scanner scannerStr, Scanner scannerNum) {
		System.out.print("Marca: ");
		this.marca = scannerStr.nextLine();

		System.out.print("Modelo: ");
		this.modelo = scannerStr.nextLine();

		System.out.print("Tamanho do quadro: ");
		this.tamanhoQuadro = scannerNum.nextDouble();

		System.out.print("Preço: R$");
		this.preco = scannerNum.nextDouble();
		
	}

	public void imprimir(int id) {
		System.out.println("["+id+"]");
        System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Tamanho do quadro: " + tamanhoQuadro);
		System.out.println("Preço: R$" + preco);
		System.out.println("--------------------------");
	}
}