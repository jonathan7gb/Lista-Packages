package br.com.applivro.services;
import br.com.applivro.model.*;
import java.util.*;

public class GerenciadorLivro {
	
	private List<Livro> lista_livro;
	
	public GerenciadorLivro() {
		lista_livro = new ArrayList();
	}

    public void adicionar(Livro livroObj){
        lista_livro.add(livroObj);
    }

    public void listar(){
        if(lista_livro.isEmpty()){
            System.out.println("A lista de livros está vazia.");
        }

        for(int i = 0; i < lista_livro.size(); i++){
            Livro livroObj = lista_livro.get(i);
            livroObj.imprimir(i);
        }
    }

    public void remover(int id){
        if(id >= 0 && id < lista_livro.size()){
            lista_livro.remove(id);
            System.out.println("Id removido com Sucesso!");
        }else{
            System.out.println("Id inválido ou não encontrado!");
        }
    }
}
