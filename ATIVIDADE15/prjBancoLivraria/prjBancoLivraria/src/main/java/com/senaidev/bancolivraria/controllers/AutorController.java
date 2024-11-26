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

import com.senaidev.bancolivraria.entities.Autor;
import com.senaidev.bancolivraria.services.AutorService;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorController autorController;

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarAutorPorId(@PathVariable Long id) {
    	Autor autor = AutorController.buscarAutoresPorId(id);
    	
    	if (autor != null) {
    		return ResponseEntity.ok(autor);
    	}
    	else {
    		return ResponseEntity.status(404).body("Autor com Id " + id + " não foi encontrado");
    	}
    }
    
    @PostMapping
    public Autor criarAutor(@RequestBody Autor autor) {
        return AutorService.criarAutor(autor);
    }

    @DeleteMapping("/{id}")
    public void excluirAutor(@PathVariable Long id) {
        AutorService.excluirAutor(id);
    }
}
