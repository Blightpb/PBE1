package com.senaidev.lojaLojas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.lojaLojas.entities.Produto;
import com.senaidev.lojaLojas.repositories.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Listar todos os produtos
    public List<Produto> buscarProdutos() {
        return produtoRepository.findAll();
   }

    // Buscar produtos por ID
    public Produto buscarProdutoPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    // Salvar produto
    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    // Deletar produto
    public void excluirProdutos(Long id) {
        produtoRepository.deleteById(id);
    }
}
