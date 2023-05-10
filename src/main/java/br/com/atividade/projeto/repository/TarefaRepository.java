package br.com.atividade.projeto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.atividade.projeto.domain.Tarefa;

public interface TarefaRepository<Estado> extends JpaRepository<Tarefa, Long> {
	
	List<Tarefa> findByTitulo(String titulo);
	List<Tarefa> findByEstado(Estado estado);
} 


