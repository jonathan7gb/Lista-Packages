package br.com.apptv.services;
import br.com.apptv.model.TV;
import java.util.*;

public class GerenciadorTV {

    private List<TV> lista_tv;

    public GerenciadorTV(){
        lista_tv = new ArrayList<>();
    }

    public void adicionar(TV tvObj){
        lista_tv.add(tvObj);
    }

    public void listar(){
        if(lista_tv.isEmpty()){
            System.out.println("A lista de TV's está vazia.");
        }

        for(int i = 0; i < lista_tv.size(); i++){
            TV tvObj = lista_tv.get(i);
            tvObj.imprimir(i);
        }
    }

    public void remover(int id){
        if(id >= 0 && id < lista_tv.size()){
            lista_tv.remove(id);
            System.out.println("ID removido com sucesso da lista!");
        }else{
            System.out.println("Id inválido ou não encontrado!");
        }
    }
}
