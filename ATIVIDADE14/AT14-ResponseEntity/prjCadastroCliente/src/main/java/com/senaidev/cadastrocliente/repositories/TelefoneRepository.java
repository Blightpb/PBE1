package com.senaidev.cadastrocliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.cadastrocliente.entities.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long>{

}