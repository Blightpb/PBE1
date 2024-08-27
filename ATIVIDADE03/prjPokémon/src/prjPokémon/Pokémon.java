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
	
	public Pokémon (String pNome, String pTipo, int pNivel, int pHp) {
		this.Nome = pNome;
		this.Tipo = pTipo;
		this.Nivel = pNivel;
		this.Hp = pHp;
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
