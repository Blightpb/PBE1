package com.senaidev.cadastrocliente.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastrocliente.entities.Cliente;
import com.senaidev.cadastrocliente.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> getAllCliente(){
		return clienteRepository.findAll();
	}
	
	public Cliente getClienteById (Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}

}