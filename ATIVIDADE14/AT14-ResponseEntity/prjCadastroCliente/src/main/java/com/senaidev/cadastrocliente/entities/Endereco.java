package com.senaidev.cadastrocliente.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Endereco {

	//atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_endereco;
	
	@Column(name = "rua")
	private String rua;
	
	@Column(name = "numero_casa")
	private int numero_casa;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "CLIENTE_id_cliente")
	private Cliente cliente;
	
	//construtores
	
	public Endereco() {
		
	}
	
	public Endereco(Long id_endereco, String rua, String bairro, int numero_casa, String cidade, String estado) {
		this.id_endereco = id_endereco;
		this.rua = rua;
		this.bairro = bairro;
		this.numero_casa = numero_casa;
		this.cidade = cidade;
		this.estado = estado;
	}

	//getters e setters
	
	public Long getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero_casa() {
		return numero_casa;
	}

	public void setNumero_casa(int numero_casa) {
		this.numero_casa = numero_casa;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}