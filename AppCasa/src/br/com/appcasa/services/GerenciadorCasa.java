package br.com.appcasa.services;
import br.com.appcasa.model.*;
import java.util.*;

public class GerenciadorCasa {
	
	private List<Casa> lista_casas;
	
	public GerenciadorCasa() {
		lista_casas = new ArrayList();
	}

    public void adicionar(Casa casaObj){
        lista_casas.add(casaObj);
    }

    public void listar(){
        if(lista_casas.isEmpty()){
            System.out.println("A lista de Casas está vazia.");
        }

        for(int i = 0; i < lista_casas.size(); i++){
            Casa casaObj = lista_casas.get(i);
            casaObj.imprimir(i);
        }
    }

    public void remover(int id){
        if(id >= 0 && id < lista_casas.size()){
            lista_casas.remove(id);
            System.out.println("Id removido com Sucesso!");
        }else{
            System.out.println("Id inválido ou não encontrado!");
        }
    }
}
