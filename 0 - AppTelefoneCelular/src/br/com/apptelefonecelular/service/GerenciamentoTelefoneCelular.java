package br.com.apptelefonecelular.service;

import java.util.ArrayList;
import java.util.List;
import br.com.apptelefonecelular.model.TelefoneCelular;

public class GerenciamentoTelefoneCelular {
	    private List<TelefoneCelular> lista;

	    public GerenciamentoTelefoneCelular() {
	        lista = new ArrayList<>();
	    }

	    public void adicionar(TelefoneCelular telefone) {
	        lista.add(telefone);
	    }

	    public void listar() {
	        if (lista.isEmpty()) {
	        	
	            System.out.println("Lista vazia.");
	            return;
	        }

	        for (int i = 0; i < lista.size(); i++) {
	            TelefoneCelular tel = lista.get(i);
	            tel.imprimir(i);
	        }
	    }

	    public void remover(int indice) {
	    	
	        if (indice >= 0 && indice < lista.size()) {
	            lista.remove(indice);
	            System.out.println("Item removido com sucesso.");
	        } else {
	            System.out.println("Índice inválido.");
	        }
	    }
	}
