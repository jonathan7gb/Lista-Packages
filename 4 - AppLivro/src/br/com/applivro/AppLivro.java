package br.com.applivro;
import br.com.applivro.model.*;
import br.com.applivro.services.*;
import java.util.*;


public class AppLivro {

    public static void main(String[] args){
     
    	Scanner leiaNum = new Scanner(System.in);
    	Scanner leiaStr = new Scanner(System.in);
        GerenciadorLivro gerenciador = new GerenciadorLivro();
        int escolha;

        do { 
          mostrarMenu();
          escolha = leiaNum.nextInt();
          System.out.println("");
          
          switch(escolha){
            case 1:
                Livro livro = new Livro();
                livro.preencher(leiaStr, leiaNum);
                gerenciador.adicionar(livro);
                break;

            case 2:
                gerenciador.listar();
                break;

            case 3:
                System.out.print("Insira o id do item que deseja remover: ");
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
            System.out.println("1 - Adicionar livros");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Remover livros");
            System.out.println("0 - Sair");
            System.out.print("? - Sua escolha: ");
        }
    
}
