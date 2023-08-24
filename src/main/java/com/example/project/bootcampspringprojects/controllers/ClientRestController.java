package com.example.project.bootcampspringprojects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.bootcampspringprojects.model.Cliente;
import com.example.project.bootcampspringprojects.services.ClienteService;

@RestController
@RequestMapping("clientes")
public class ClientRestController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<Iterable<Cliente>> buscartTodos() {
		return ResponseEntity.ok(clienteService.buscarTodos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(clienteService.buscarPorId(id));
	}
	
	
	
}
