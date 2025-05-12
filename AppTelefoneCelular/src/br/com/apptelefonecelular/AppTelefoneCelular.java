package br.com.apptelefonecelular;
import java.util.Scanner;
import br.com.apptelefonecelular.service.GerenciamentoTelefoneCelular;
import br.com.apptelefonecelular.model.TelefoneCelular;

public class AppTelefoneCelular {
	
	    public static void main(String[] args) {
	    	
	        Scanner input = new Scanner(System.in);
	        GerenciamentoTelefoneCelular gerenciador = new GerenciamentoTelefoneCelular();
	        
	        int opcao;

	        do {
	            mostrarMenu();
	            opcao = opcaoMenu(input, "Escolha uma opção: ");

	            switch (opcao) {
	                case 1:
	                    TelefoneCelular novoTelefone = new TelefoneCelular();
	                    novoTelefone.preencher(input);
	                    gerenciador.adicionar(novoTelefone);
	                    break;

	                case 2:
	                    gerenciador.listar();
	                    break;

	                case 3:
	                    int indice = opcaoMenu(input, "Digite o índice do telefone a remover: ");
	                    gerenciador.remover(indice);
	                    break;

	                case 0:
	                    System.out.println("Encerrando o programa.");
	                    break;

	                default:
	                    System.out.println("Opção inválida.");
	            }
	        } while (opcao != 0);

	        input.close();
	    }

	    private static void mostrarMenu() {
	        System.out.println("\nMENU:");
	        System.out.println("1 - Adicionar telefone");
	        System.out.println("2 - Listar telefones");
	        System.out.println("3 - Remover telefone");
	        System.out.println("0 - Sair");
	    }

	    private static int opcaoMenu(Scanner input, String mensagem) {
	        System.out.print(mensagem);
	        int valor = input.nextInt();
	        input.nextLine();
	        return valor;
	    }
	}