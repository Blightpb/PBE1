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

import com.senaidev.bancolivraria.entities.Pedido;
import com.senaidev.bancolivraria.services.PedidoService;

@RestController
@RequestMapping("/enderecos")
public class PedidoController {

    @Autowired
    private PedidoController pedidoController;

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarPedidoPorId(@PathVariable Long id) {
    	Pedido pedido = PedidoController.buscarPedidosPorId(id);
    	
    	if (pedido != null) {
    		return ResponseEntity.ok(pedido);
    	}
    	else {
    		return ResponseEntity.status(404).body("Pedido com Id " + id + " não foi encontrado");
    	}
    }
    
    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return PedidoService.criarPedido(pedido);
    }

    @DeleteMapping("/{id}")
    public void excluirPedido(@PathVariable Long id) {
        PedidoService.excluirPedido(id);
    }
}
