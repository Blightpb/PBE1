package com.senaidev.cadastrocliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.cadastrocliente.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}