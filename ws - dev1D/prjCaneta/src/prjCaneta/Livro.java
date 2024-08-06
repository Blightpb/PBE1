package prjCaneta;

public class Livro {
	
	String nomeLivro;
	String nomeAutor;
	boolean alugado;
	
	public Livro (String nomeLivro, String nomeAutor) {
	  this.nomeLivro = nomeLivro;
	  this.nomeAutor = nomeAutor;
	  this.alugado = false;
	}
	
	void status() {
		
		System.out.println("Título do livro: " + this.nomeLivro);
		System.out.println("Autor: " + this.nomeAutor);
		
	

}
	void disponivel () {
		this.alugado = true;
	}
	void indisponivel () {
		this.alugado = false;
	}
}
