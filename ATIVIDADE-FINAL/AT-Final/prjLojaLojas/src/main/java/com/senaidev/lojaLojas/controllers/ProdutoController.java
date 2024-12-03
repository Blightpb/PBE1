package com.senaidev.lojaLojas.controllers;

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

import com.senaidev.lojaLojas.entities.Produto;
import com.senaidev.lojaLojas.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> buscarProdutos() {
        return produtoService.buscarProdutos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProdutoPorId(@PathVariable Long id_produto) {
        Produto produto = produtoService.buscarProdutoPorId(id_produto);
		
		if (produto != null) {
			return ResponseEntity.ok(produto);
		} else {
			return ResponseEntity.notFound().build();
		}	
    }
    
    @PostMapping
    public Produto criarEndereco(@RequestBody Produto produto) {
        return produtoService.criarProduto(produto);
    }

    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable Long id_produto) {
        produtoService.excluirProdutos(id_produto);
    }
}
