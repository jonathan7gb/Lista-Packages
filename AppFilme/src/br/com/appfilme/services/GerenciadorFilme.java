package br.com.appfilme.services;
import java.util.*;
import br.com.appfilme.model.*;

public class GerenciadorFilme{
	
	private List<Filme> lista_filme;
	
	public GerenciadorFilme() {
		lista_filme = new ArrayList();
	}

    public void adicionar(Filme filmeObj){
    	lista_filme.add(filmeObj);
    }

    public void listar(){
        if(lista_filme.isEmpty()){
            System.out.println("A lista de livros está vazia.");
        }

        for(int i = 0; i < lista_filme.size(); i++){
        	Filme filmeObj = lista_filme.get(i);
        	filmeObj.imprimir(i);
        }
    }

    public void remover(int id){
        if(id >= 0 && id < lista_filme.size()){
        	lista_filme.remove(id);
            System.out.println("Id removido com Sucesso!");
        }else{
            System.out.println("Id inválido ou não encontrado!");
        }
    }
}
