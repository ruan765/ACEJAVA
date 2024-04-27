package Apliccation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Entidades.Tarefa;

public class Sistem {
	
	private List<Tarefa> tarefas = new ArrayList<>();
	
	public void printarTafs() {
		for(Tarefa i: tarefas) {
			System.out.println(i);
		}
	}
	
	public void AdicionarTarefa(Integer id, String nome, String descricao, LocalDate prazo, Integer prioridade) {
		tarefas.add(new Tarefa(id , nome, descricao, prazo, prioridade));
	}
	
	public void RemoverTarefa(Integer id) {
		
		tarefas.removeIf(i ->i.getId() == id );
		
	}
	
	public void filtroPrioridade(Integer prioridade) {
		for(Tarefa i: tarefas) {
			if(i.getPrioridade() == prioridade) {
				System.out.println(i);
			}
		}
	}
		
	public void ordenarCrescente() {
		
		Collections.sort(tarefas);
		
		
		for(Tarefa taf:tarefas) {
			System.out.println(taf);
		}
	}
		
	
		
		
	
			
		

}
