package br.com.appmusica.services;
import br.com.appmusica.model.*;
import java.util.*;

public class GerenciadorMusica{
	
	private List<Musica> lista_musica;
	
	public GerenciadorMusica() {
		lista_musica = new ArrayList();
	}

    public void adicionar(Musica musicaObj){
    	lista_musica.add(musicaObj);
    }

    public void listar(){
        if(lista_musica.isEmpty()){
            System.out.println("A lista de musicas está vazia.");
        }

        for(int i = 0; i < lista_musica.size(); i++){
        	Musica musicaObj = lista_musica.get(i);
        	musicaObj.imprimir(i);
        }
    }

    public void remover(int id){
        if(id >= 0 && id < lista_musica.size()){
        	lista_musica.remove(id);
            System.out.println("Id removido com Sucesso!");
        }else{
            System.out.println("Id inválido ou não encontrado!");
        }
    }
}
