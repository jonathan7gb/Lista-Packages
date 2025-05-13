package br.com.appfilme;
import java.util.*;

import br.com.appfilme.model.*;
import br.com.appfilme.services.*;


public class AppFilme {

    public static void main(String[] args){
     
    	Scanner leiaNum = new Scanner(System.in);
    	Scanner leiaStr = new Scanner(System.in);
        GerenciadorFilme gerenciador = new GerenciadorFilme();
        int escolha;

        do { 
          mostrarMenu();
          escolha = leiaNum.nextInt();
          System.out.println("");
          
          switch(escolha){
            case 1:
            	Filme filme = new Filme();
                filme.preencher(leiaStr, leiaNum);
                gerenciador.adicionar(filme);
                break;

            case 2:
                gerenciador.listar();
                break;

            case 3:
                System.out.println("Insira o id do item que deseja remover: ");
                int id = leiaNum.nextInt();
                gerenciador.remover(id);
                break;

            case 0:
                System.out.println("Encerrando o programa...");
                break;

            default:
                System.out.println("Escolha inválida!");
                break;
          }

        } while (escolha != 0);

        leiaNum.close();
        leiaStr.close();
    }

        public static void mostrarMenu(){
            System.out.println("\nMENU:");
            System.out.println("1 - Adicionar filmes");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Remover filmes");
            System.out.println("0 - Sair");
            System.out.print("? - Sua escolha: ");
        }
    
}
