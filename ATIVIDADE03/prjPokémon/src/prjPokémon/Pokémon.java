package prjPokémon;

public class Pokémon {
	
	//Atributos 
	String Nome;
	String Tipo;
	int Nivel;
	int Hp;
	
	//Construtores
	
	public Pokémon () {
		
	}
	
	public Pokémon (String Nome, String Tipo, int Nivel, int Hp) {
		this.Nome = Nome;
		this.Tipo = Tipo;
		this.Nivel = Nivel;
		this.Hp = Hp;
	}
	
	//métodos
	public void Atacar () {
		System.out.println(this.Nome + " está atacando.");
	}
	public void Evoluir() {
		System.out.println(this.Nome + " evoluiu.");
	}
	public void exibirInfo() {
	}

}
