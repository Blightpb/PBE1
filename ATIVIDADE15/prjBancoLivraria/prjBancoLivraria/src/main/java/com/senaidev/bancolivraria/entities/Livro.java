package com.senaidev.bancolivraria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_livro")
public class Livro {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "isbn", nullable = false, length = 13, unique = true)
	private String isbn;
	
	@Column(name = "categoria", nullable = false, length = 100, unique = true)
	private String categoria;
	
	@Column(name = "estoque")
	private int estoque;
	
	@ManyToOne
	@JoinColumn(name = "AUTOR_id_autor")
	private Autor autor;
	
	@ManyToOne
	@JoinColumn(name = "EDITORA_id_editora")
	private Editora editora;
	
	// Construtores
	public Livro() {
		
	}
	public Livro (Long id_produto, String nome, String isbn, String categoria, int estoque) {
		this.id_produto = id_produto;
		this.nome = nome;
		this.isbn = isbn;
		this.categoria = categoria;
		this.estoque = estoque;
	}
	
	// Getters e Setters
	
	public Long getId_produto() {
		return id_produto;
	}
	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
}
