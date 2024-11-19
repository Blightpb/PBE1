package com.senaidev.cadastrocliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.cadastrocliente.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}