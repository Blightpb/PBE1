package com.senaidev.bancolivraria.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.bancolivraria.entities.Endereco;
import com.senaidev.bancolivraria.services.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoController enderecoController;

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarEnderecoPorId(@PathVariable Long id) {
    	Endereco endereco = EnderecoController.buscarEnderecosPorId(id);
    	
    	if (endereco != null) {
    		return ResponseEntity.ok(endereco);
    	}
    	else {
    		return ResponseEntity.status(404).body("Endereço com Id " + id + " não foi encontrado");
    	}
    }
    
    @PostMapping
    public Endereco criarEndereco(@RequestBody Endereco endereco) {
        return EnderecoService.criarEndereco(endereco);
    }

    @DeleteMapping("/{id}")
    public void excluirEndereco(@PathVariable Long id) {
        EnderecoService.excluirEndereco(id);
    }
}
