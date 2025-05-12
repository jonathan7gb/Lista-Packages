package br.com.appanimal;
import br.com.appanimal.model.*;
import br.com.appanimal.services.*;
import java.util.*;


public class AppAnimal {

    public static void main(String[] args){
     
    	Scanner leiaNum = new Scanner(System.in);
    	Scanner leiaStr = new Scanner(System.in);
        GerenciadorAnimal gerenciador = new GerenciadorAnimal();
        int escolha;

        do { 
          mostrarMenu();
          escolha = leiaNum.nextInt();
          System.out.println("");
          
          switch(escolha){
            case 1:
                Animal animal = new Animal();
                animal.preencher(leiaStr, leiaNum);
                gerenciador.adicionar(animal);
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
            System.out.println("1 - Adicionar animal");
            System.out.println("2 - Listar animal");
            System.out.println("3 - Remover animal");
            System.out.println("0 - Sair");
            System.out.print("? - Sua escolha: ");
        }
    
}
