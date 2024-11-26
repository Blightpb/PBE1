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
import com.senaidev.bancolivraria.entities.Livro;
import com.senaidev.bancolivraria.services.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroController livroController;

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarLivroPorId(@PathVariable Long id) {
    	Livro livro = livroController.buscarLivrosPorId(id);
    	
    	if (livro != null) {
    		return ResponseEntity.ok(livro);
    	}
    	else {
    		return ResponseEntity.status(404).body("Livro com Id " + id + " não foi encontrado");
    	}
    }
    @GetMapping("/isbn/{isbn}")
    public Livro buscarLivroPorIsbn(@PathVariable String isbn) {
    	return LivroService.buscarLivroPorIsbn(isbn);
    }
    
    @PostMapping
    public Livro criarLivro(@RequestBody Livro livro) {
        return LivroService.criarLivro(livro);
    }

    @DeleteMapping("/{id}")
    public void excluirLivro(@PathVariable Long id) {
        LivroService.excluirLivro(id);
    }
}
