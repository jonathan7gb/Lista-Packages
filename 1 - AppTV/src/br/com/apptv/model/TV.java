package br.com.apptv.model;
import java.util.Scanner;

public class TV {

	private String marca;
	private String resolucao;
	private double tamanho;
	private double preco;
    
    public void preencher(Scanner scannerStr, Scanner scannerNum){
        System.out.print("Insira a marca da TV: ");
        this.marca = scannerStr.nextLine();

        System.out.print("Insira a resolução da TV: ");
        this.resolucao = scannerStr.nextLine();

        System.out.print("Insira o tamanho da TV: ");
        this.tamanho = scannerNum.nextDouble();

        System.out.print("Insira o preço da TV: R$");
        this.preco = scannerNum.nextDouble();
    }

    public void imprimir(int id){
        System.out.println("["+id+"]");
        System.out.println("Marca: " + marca);
		System.out.println("Resolução: " + resolucao);
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Preço: R$" + preco);
		System.out.println("--------------------------");
	
    }
    
}
