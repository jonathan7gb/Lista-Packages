package br.com.appbicicleta;
import java.util.*;
import br.com.appbicicleta.model.*;
import br.com.appbicicleta.services.*;


public class AppBicicleta {

    public static void main(String[] args){
     
    	Scanner leiaNum = new Scanner(System.in);
    	Scanner leiaStr = new Scanner(System.in);
        GerenciadorBicicleta gerenciador = new GerenciadorBicicleta();
        int escolha;

        do { 
          mostrarMenu();
          escolha = leiaNum.nextInt();
          System.out.println("");
          
          switch(escolha){
            case 1:
            	Bicicleta casa = new Bicicleta();
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
            System.out.println("1 - Adicionar bicicletas");
            System.out.println("2 - Listar bicicletas");
            System.out.println("3 - Remover bicicletas");
            System.out.println("0 - Sair");
            System.out.print("? - Sua escolha: ");
        }
    
}
