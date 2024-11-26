package com.senaidev.cadastrocliente.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastrocliente.entities.Endereco;
import com.senaidev.cadastrocliente.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public Endereco saveEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	public List<Endereco> getAllEndereco(){
		return enderecoRepository.findAll();
	}
	
	public Endereco getEnderecoById (Long id) {
		return enderecoRepository.findById(id).orElse(null);
	}
	
	public void deleteEndereco(Long id) {
		enderecoRepository.deleteById(id);
	}

}