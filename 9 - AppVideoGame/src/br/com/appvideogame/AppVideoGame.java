package br.com.appvideogame;
import br.com.appvideogame.model.*;
import br.com.appvideogame.services.*;
import java.util.*;


public class AppVideoGame {

    public static void main(String[] args){
     
    	Scanner leiaNum = new Scanner(System.in);
    	Scanner leiaStr = new Scanner(System.in);
        GerenciadorVideoGame gerenciador = new GerenciadorVideoGame();
        int escolha;

        do { 
          mostrarMenu();
          escolha = leiaNum.nextInt();
          System.out.println("");
          
          switch(escolha){
            case 1:
            	VideoGame videogame = new VideoGame();
                videogame.preencher(leiaStr, leiaNum);
                gerenciador.adicionar(videogame);
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
            System.out.println("1 - Adicionar jogo");
            System.out.println("2 - Listar jogo");
            System.out.println("3 - Remover jogo");
            System.out.println("0 - Sair");
            System.out.print("? - Sua escolha: ");
        }
    
}
