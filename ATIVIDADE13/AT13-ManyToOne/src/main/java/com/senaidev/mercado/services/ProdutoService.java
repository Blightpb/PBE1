package com.senaidev.mercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.mercado.entities.Produto;
import com.senaidev.mercado.repositories.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
    
    public Produto saveProduto( Produto produto) {
        return produtoRepository.save(produto);
    }
    
    public List<Produto> getAllProdutos(){
        return produtoRepository.findAll();
    }
    
    public Produto getProdutoById(Long id_produto) {
        return produtoRepository.findById(id_produto).orElse(null);
    }
    
    public void deleteProduto(Long id_produto) {
        produtoRepository.deleteById(id_produto);
    }
}
