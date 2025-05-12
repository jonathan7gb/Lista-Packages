package br.com.appaluno.services;
import br.com.appaluno.model.*;
import java.util.*;

public class GerenciadorAluno {
	
	private List<Aluno> lista_alunos;
	
	public GerenciadorAluno() {
		lista_alunos = new ArrayList();
	}

    public void adicionar(Aluno alunoObj){
        lista_alunos.add(alunoObj);
    }

    public void listar(){
        if(lista_alunos.isEmpty()){
            System.out.println("A lista de alunos está vazia.");
        }

        for(int i = 0; i < lista_alunos.size(); i++){
            Aluno alunoObj = lista_alunos.get(i);
            alunoObj.imprimir(i);
        }
    }

    public void remover(int id){
        if(id >= 0 && id < lista_alunos.size()){
            lista_alunos.remove(id);
            System.out.println("Id removido com Sucesso!");
        }else{
            System.out.println("Id inválido ou não encontrado!");
        }
    }
}
