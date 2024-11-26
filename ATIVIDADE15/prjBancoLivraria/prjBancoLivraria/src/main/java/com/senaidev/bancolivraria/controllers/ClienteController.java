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

import com.senaidev.bancolivraria.entities.Cliente;
import com.senaidev.bancolivraria.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarClientePorId(@PathVariable Long id) {
    	Cliente cliente = clienteService.buscarClientesPorId(id);
    	
    	if (cliente != null) {
    		return ResponseEntity.ok(cliente);
    	}
    	else {
    		return ResponseEntity.status(404).body("Cliente com Id " + id + " não foi encontrado");
    	}
    }
    
    @GetMapping("/cpf/{cpf}")
    public Cliente buscarClientesPorCpf(@PathVariable String cpf) {
    	return clienteService.buscarClientePorCpf(cpf);
    }
    
    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente) {
        return clienteService.criarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void excluirCliente(@PathVariable Long id) {
        clienteService.excluirCliente(id);
    }
}
