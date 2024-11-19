package com.senaidev.mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.mercado.entities.Produto;
import com.senaidev.mercado.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
     @Autowired
        private ProdutoService produtoService;
        
        @PostMapping
        public Produto createProduto(Produto produto) {
            return produtoService.saveProduto(produto);
        }
        
        @GetMapping
        public List<Produto> getAllProdutos(){
            return produtoService.getAllProdutos();
        }
        @GetMapping ("/{id_produto}")
        public Produto getProduto(@PathVariable Long id_produto) {
            return produtoService.getProdutoById(id_produto);
        }
        @DeleteMapping("/{id_produto}")
        public void deleteProduto (@PathVariable Long id_produto) {
            produtoService.deleteProduto(id_produto);
        }

}
