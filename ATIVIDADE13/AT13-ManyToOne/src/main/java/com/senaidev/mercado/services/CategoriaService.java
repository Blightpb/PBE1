package com.senaidev.mercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.mercado.entities.Categoria;
import com.senaidev.mercado.repositories.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository CategoriaRepository;
    
    public Categoria saveCategoria(Categoria Categoria) {
        return CategoriaRepository.save(Categoria);
    }
    
    public List<Categoria> getAllCategoria(){
        return CategoriaRepository.findAll();
    }
    
    public Categoria getCategoriaById(Long id_categoria) {
        return CategoriaRepository.findById(id_categoria).orElse(null);
    }
    
    public void deleteCategoria(Long id_categoria) {
        CategoriaRepository.deleteById(id_categoria);
    }
}
