package br.com.appbolsavalores.services;
import br.com.appbolsavalores.model.*;
import java.util.*;

public class GerenciadorBolsaValores{
	
	private List<BolsaValores> lista_bolsavalores;
	
	public GerenciadorBolsaValores() {
		lista_bolsavalores = new ArrayList();
	}

    public void adicionar(BolsaValores bolsavaloresObj){
    	lista_bolsavalores.add(bolsavaloresObj);
    }

    public void listar(){
        if(lista_bolsavalores.isEmpty()){
            System.out.println("A lista da bolsa de valores está vazia.");
        }

        for(int i = 0; i < lista_bolsavalores.size(); i++){
        	BolsaValores bolsavaloresObj = lista_bolsavalores.get(i);
        	bolsavaloresObj.imprimir(i);
        }
    }

    public void remover(int id){
        if(id >= 0 && id < lista_bolsavalores.size()){
        	lista_bolsavalores.remove(id);
            System.out.println("Id removido com Sucesso!");
        }else{
            System.out.println("Id inválido ou não encontrado!");
        }
    }
}
