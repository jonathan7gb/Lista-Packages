package br.com.appvideogame.services;
import br.com.appvideogame.model.*;
import java.util.*;

public class GerenciadorVideoGame{
	
	private List<VideoGame> lista_videogame;
	
	public GerenciadorVideoGame() {
		lista_videogame = new ArrayList();
	}

    public void adicionar(VideoGame videogameObj){
    	lista_videogame.add(videogameObj);
    }

    public void listar(){
        if(lista_videogame.isEmpty()){
            System.out.println("A lista de jogos está vazia.");
        }

        for(int i = 0; i < lista_videogame.size(); i++){
        	VideoGame videogameObj = lista_videogame.get(i);
        	videogameObj.imprimir(i);
        }
    }

    public void remover(int id){
        if(id >= 0 && id < lista_videogame.size()){
        	lista_videogame.remove(id);
            System.out.println("Id removido com Sucesso!");
        }else{
            System.out.println("Id inválido ou não encontrado!");
        }
    }
}
