package com.senaidev.mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.mercado.entities.Categoria;
import com.senaidev.mercado.services.CategoriaService;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService CategoriaService;
    
    @PostMapping
    public Categoria createCategoria(Categoria Categoria) {
        return CategoriaService.saveCategoria(Categoria);
    }
    
    @GetMapping
    public List<Categoria> getAllCategoria(){
        return CategoriaService.getAllCategoria();
    }
    @GetMapping ("/{id_categoria}")
    public Categoria getCategoria(@PathVariable Long id_categoria) {
        return CategoriaService.getCategoriaById(id_categoria);
    }
    @DeleteMapping("/{id_categoria}")
    public void deleteCategoria(@PathVariable Long id_categoria) {
        CategoriaService.deleteCategoria(id_categoria);
    }

}
