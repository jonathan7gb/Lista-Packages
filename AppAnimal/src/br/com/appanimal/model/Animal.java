package br.com.appanimal.model;

import java.util.Scanner;

public class Animal {
	
	private String especie;
	private String raca;
	private int idade;
	private double peso;

	public void preencher(Scanner scannerStr, Scanner scannerNum){
        System.out.print("Insira a espécie do animal: ");
        this.especie = scannerStr.nextLine();

        System.out.print("Insira a raça do animal: ");
        this.raca = scannerStr.nextLine();

        System.out.print("Insira a idade do animal: ");
        this.idade = scannerNum.nextInt();

        System.out.print("Insira o peso do animal:");
        this.peso = scannerNum.nextDouble();
    }

    public void imprimir(int id){
        System.out.println("["+id+"]");
        System.out.println("Espécie: " + especie);
		System.out.println("Raça: " + raca);
		System.out.println("Idade: " + idade);
		System.out.println("Peso:" + peso);
		System.out.println("--------------------------");
	
    }

}
