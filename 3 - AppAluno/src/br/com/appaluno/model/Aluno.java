package br.com.appaluno.model;

import java.util.Scanner;

public class Aluno {
	
	private String nome;
	private int idade;
	private String matricula;
	private int anoIngresso;

	public void preencher(Scanner scannerStr, Scanner scannerNum){
        System.out.print("Insira o nome do aluno: ");
        this.nome = scannerStr.nextLine();

        System.out.print("Insira a idade do aluno: ");
        this.idade = scannerNum.nextInt();

        System.out.print("Insira a matricula do aluno: ");
        this.matricula = scannerStr.nextLine();

        System.out.print("Insira o ano de ingresso do aluno: ");
        this.anoIngresso = scannerNum.nextInt();
    }

    public void imprimir(int id){
        System.out.println("["+id+"]");
        System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Ano de ingresso: " + anoIngresso);
		System.out.println("--------------------------");
	
    }

}
