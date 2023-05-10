package br.com.atividade.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.atividade.projeto.domain.Estado;
import br.com.atividade.projeto.domain.Tarefa;
import br.com.atividade.projeto.repository.TarefaRepository;

@RestController
public class TarefaController {
	//Auto instância da interface em tempo de execução
		@Autowired
		private TarefaRepository<Estado> tar;
		
		@GetMapping("/tarefa/listar")
		public List<Tarefa> listar() {
			return tar.findAll();
		}
		
		@GetMapping("/tarefa/listar/{titulo}")
		public List<Tarefa> listarT(@PathVariable String titulo) {
			
			return tar.findByTitulo(titulo);
		}
		
		@GetMapping("/tarefa/listar/Aberto")
		public List<Tarefa> findByEstado(Estado estado) {
		    return tar.findByEstado(Estado.Aberto);
		}
		@GetMapping("/tarefa/listar/Finalizado")
		public List<Tarefa> findByestado(Estado estado) {
		    return tar.findByEstado(Estado.Finalizado);
		}
		@PostMapping("/tarefa/cadastrar")
		public String cadastrar(@RequestBody Tarefa ta) {
			String msg = "";
			tar.save(ta);
			msg = "Cadastrado";
			return msg;
		}
		
		@PostMapping("/tarefa/atualizar")
		public String atualizar(@RequestBody Tarefa ta) {
			String msg = "";
			tar.save(ta);
			msg = "Atualizado";
			return msg;
		}
	}



