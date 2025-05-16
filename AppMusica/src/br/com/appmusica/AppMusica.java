package br.com.appmusica;
import br.com.appmusica.model.*;
import br.com.appmusica.services.*;
import java.util.*;


public class AppMusica {

    public static void main(String[] args){
     
    	Scanner leiaNum = new Scanner(System.in);
    	Scanner leiaStr = new Scanner(System.in);
        GerenciadorMusica gerenciador = new GerenciadorMusica();
        int escolha;

        do { 
          mostrarMenu();
          escolha = leiaNum.nextInt();
          System.out.println("");
          
          switch(escolha){
            case 1:
            	Musica musica = new Musica();
                musica.preencher(leiaStr, leiaNum);
                gerenciador.adicionar(musica);
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
            System.out.println("1 - Adicionar músicas");
            System.out.println("2 - Listar músicas");
            System.out.println("3 - Remover músicas");
            System.out.println("0 - Sair");
            System.out.print("? - Sua escolha: ");
        }
    
}
