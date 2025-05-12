package br.com.appcasa;
import java.util.*;
import br.com.appcasa.model.*;
import br.com.appcasa.services.*;


public class AppCasa {

    public static void main(String[] args){
     
    	Scanner leiaNum = new Scanner(System.in);
    	Scanner leiaStr = new Scanner(System.in);
        GerenciadorCasa gerenciador = new GerenciadorCasa();
        int escolha;

        do { 
          mostrarMenu();
          escolha = leiaNum.nextInt();
          System.out.println("");
          
          switch(escolha){
            case 1:
                Casa casa = new Casa();
                casa.preencher(leiaStr, leiaNum);
                gerenciador.adicionar(casa);
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
            System.out.println("1 - Adicionar Casas");
            System.out.println("2 - Listar Casas");
            System.out.println("3 - Remover Casas");
            System.out.println("0 - Sair");
            System.out.print("? - Sua escolha: ");
        }
    
}
