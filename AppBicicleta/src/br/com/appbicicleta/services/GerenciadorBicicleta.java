package br.com.appbicicleta.services;
import br.com.appbicicleta.model.*;
import java.util.*;

public class GerenciadorBicicleta{
	
	private List<Bicicleta> lista_bicicleta;
	
	public GerenciadorBicicleta() {
		lista_bicicleta = new ArrayList();
	}

    public void adicionar(Bicicleta bicicletaObj){
    	lista_bicicleta.add(bicicletaObj);
    }

    public void listar(){
        if(lista_bicicleta.isEmpty()){
            System.out.println("A lista de livros está vazia.");
        }

        for(int i = 0; i < lista_bicicleta.size(); i++){
        	Bicicleta bicicletaObj = lista_bicicleta.get(i);
        	bicicletaObj.imprimir(i);
        }
    }

    public void remover(int id){
        if(id >= 0 && id < lista_bicicleta.size()){
        	lista_bicicleta.remove(id);
            System.out.println("Id removido com Sucesso!");
        }else{
            System.out.println("Id inválido ou não encontrado!");
        }
    }
}
