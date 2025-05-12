package br.com.appanimal.services;
import br.com.appanimal.model.*;
import java.util.*;

public class GerenciadorAnimal {
	
	private List<Animal> lista_animal;
	
	public GerenciadorAnimal() {
		lista_animal = new ArrayList();
	}

    public void adicionar(Animal animalObj){
        lista_animal.add(animalObj);
    }

    public void listar(){
        if(lista_animal.isEmpty()){
            System.out.println("A lista de animais está vazia.");
        }

        for(int i = 0; i < lista_animal.size(); i++){
            Animal animalObj = lista_animal.get(i);
            animalObj.imprimir(i);
        }
    }

    public void remover(int id){
        if(id >= 0 && id < lista_animal.size()){
            lista_animal.remove(id);
            System.out.println("Id removido com Sucesso!");
        }else{
            System.out.println("Id inválido ou não encontrado!");
        }
    }
}
