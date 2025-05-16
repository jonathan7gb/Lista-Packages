package br.com.appcasa.model;

import java.util.Scanner;

public class Casa {
	
	private String endereco;
	private double area;
	private double preco;
	private int numQuartos;

	public void preencher(Scanner scannerStr, Scanner scannerNum){
        System.out.print("Insira o endereço da casa: ");
        this.endereco = scannerStr.nextLine();

        System.out.print("Insira a área da casa: ");
        this.area = scannerNum.nextDouble();

        System.out.print("Insira o preço da casa: R$");
        this.preco = scannerNum.nextDouble();

        System.out.print("Insira o total de quartos da casa: ");
        this.numQuartos = scannerNum.nextInt();
    }

    public void imprimir(int id){
        System.out.println("["+id+"]");
        System.out.println("Endereço: " + endereco);
		System.out.println("Área: " + area);
		System.out.println("Preço: R$" + preco);
		System.out.println("Total de quartos: " + numQuartos);
		System.out.println("--------------------------");
	
    }

}
