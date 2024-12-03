package com.senaidev.lojaLojas.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto;
	
	@Column(name = "nome_prod", nullable = false, length = 100)
	private String nome_prod;
	
	@Column(name = "preco", nullable = false)
	private int preco;
	
	@Column(name = "tipo", nullable = false)
	private String tipo;
	
	@Column(name = "dt_venda", nullable = false)
	private Date dt_venda;
	
	@ManyToOne
    @JoinColumn(name = "CLIENTE_id_cliente")
    private Cliente cliente;
	
	//Construtores
	public Produto() {

	}

	public Produto(Long id_produto, String nome_prod, int preco, String tipo, Date dt_venda) {
		this.id_produto = id_produto;
		this.nome_prod = nome_prod;
		this.preco = preco;
		this.tipo = tipo;
		this.dt_venda = dt_venda;
	}
	
	//Getters e Setters

	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome_prod() {
		return nome_prod;
	}

	public void setNome_prod(String nome_prod) {
		this.nome_prod = nome_prod;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getDt_venda() {
		return dt_venda;
	}

	public void setDt_venda(Date dt_venda) {
		this.dt_venda = dt_venda;
	}
	
}
