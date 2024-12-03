package com.senaidev.lojaLojas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.lojaLojas.entities.Cliente;
import com.senaidev.lojaLojas.repositories.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Listar todos os clientes
    public List<Cliente> buscarClientes() {
        return clienteRepository.findAll();
   }

    // Buscar cliente por ID
    public Cliente buscarClientesPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
    //busca cliente por cpf
    public Cliente buscarClientePorCpf(String cpf) {
    	return clienteRepository.findByCpf(cpf);
    }

    // Salvar cliente
    public Cliente criarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Deletar cliente
    public void excluirCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
