package br.com.appbolsavalores;
import br.com.appbolsavalores.model.*;
import br.com.appbolsavalores.services.*;
import java.util.*;


public class AppBolsaValores {

    public static void main(String[] args){
     
    	Scanner leiaNum = new Scanner(System.in);
    	Scanner leiaStr = new Scanner(System.in);
        GerenciadorBolsaValores gerenciador = new GerenciadorBolsaValores();
        int escolha;

        do { 
          mostrarMenu();
          escolha = leiaNum.nextInt();
          System.out.println("");
          
          switch(escolha){
            case 1:
            	BolsaValores bolsavalores = new BolsaValores();
                bolsavalores.preencher(leiaStr, leiaNum);
                gerenciador.adicionar(bolsavalores);
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
            System.out.println("1 - Adicionar algo na bolsa de valores");
            System.out.println("2 - Listar algo na bolsa de valores");
            System.out.println("3 - Remover algo na bolsa de valores");
            System.out.println("0 - Sair");
            System.out.print("? - Sua escolha: ");
        }
    
}
