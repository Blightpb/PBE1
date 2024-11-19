package com.senaidev.cadastrocliente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cadastrocliente.entities.Endereco;
import com.senaidev.cadastrocliente.services.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {


	@Autowired
	private EnderecoService enderecoService;

	@PostMapping
	public Endereco createEndereco(@RequestBody Endereco endereco) {
		return enderecoService.saveEndereco(endereco);
	}

	@GetMapping
	public List<Endereco> getAllEndereco() {
		return enderecoService.getAllEndereco();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Endereco> getEndereco(@PathVariable Long id) {
	Endereco endereco = enderecoService.getEnderecoById(id);
	if (endereco != null) {
	return ResponseEntity.ok(endereco);
	} else {
	return ResponseEntity.notFound().build();
	}
	}

	@DeleteMapping("/{id}")
	public void deleteEndereco(@PathVariable Long id) {
		enderecoService.deleteEndereco(id);
	}
}