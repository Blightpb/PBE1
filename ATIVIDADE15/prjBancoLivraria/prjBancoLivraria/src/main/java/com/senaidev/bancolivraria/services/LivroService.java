package com.senaidev.bancolivraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivraria.entities.Livro;
import com.senaidev.bancolivraria.repositories.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> buscarLivros() {
        return livroRepository.findAll();
   }

    public Livro buscarLivrosPorId(Long id) {
        return livroRepository.findById(id).orElse(null);
    }
    
    public Livro criarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public void excluirLivro(Long id) {
        livroRepository.deleteById(id);
    }
}
