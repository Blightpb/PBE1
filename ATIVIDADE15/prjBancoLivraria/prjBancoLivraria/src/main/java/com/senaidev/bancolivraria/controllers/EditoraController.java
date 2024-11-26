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
import com.senaidev.bancolivraria.entities.Editora;
import com.senaidev.bancolivraria.services.EditoraService;

@RestController
@RequestMapping("/editoras")
public class EditoraController {

    @Autowired
    private EditoraController editoraController;

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarEditoraPorId(@PathVariable Long id) {
    	Editora editora = editoraController.buscarEditorasPorId(id);
    	
    	if (editora != null) {
    		return ResponseEntity.ok(editora);
    	}
    	else {
    		return ResponseEntity.status(404).body("Editora com Id " + id + " não foi encontrado");
    	}
    }
    @GetMapping("/cnpj/{cnpj}")
    public Editora buscarEditoraPorCnpj(@PathVariable String cnpj) {
    	return EditoraService.buscarEditoraPorCnpj(cnpj);
    }
    
    @PostMapping
    public Editora criarEditora(@RequestBody Editora editora) {
        return EditoraService.criarEditora(editora);
    }

    @DeleteMapping("/{id}")
    public void excluirEditora(@PathVariable Long id) {
        EditoraService.excluirEditora(id);
    }
}
