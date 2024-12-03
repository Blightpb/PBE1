package com.senaidev.lojaLojas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.lojaLojas.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}