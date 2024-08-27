package prjPokémon;

public class Aplicacao {
	
	public static void main(String[] args) {
		Pokémon bulbasaur = new Pokémon ();
		bulbasaur.Nome = "Bulbasaur";
		bulbasaur.Tipo = "Planta";
		bulbasaur.Nivel = 1 ;
		bulbasaur.Hp = 100 ;
		
		Pokémon charmander = new Pokémon ("Charmander", "Fogo", 2, 200);
		
		Pokémon squirtle = new Pokémon ("Squirtle", "Água", 3, 300);
		
		Pokémon pikachu = new Pokémon ("Pikachu", "Elétrico", 4, 400);
		
		Pokémon eevee = new Pokémon ("Eevee", "Normal", 5, 500);
		
		bulbasaur.exibirInfo();
		bulbasaur.Atacar();
		bulbasaur.Evoluir();
		bulbasaur.exibirInfo();
		
		charmander.exibirInfo();
		charmander.Atacar();
		charmander.Evoluir();
		charmander.exibirInfo();
		
		squirtle.exibirInfo();
		squirtle.Atacar();
		squirtle.Evoluir();
		squirtle.exibirInfo();
		
		pikachu.exibirInfo();
		pikachu.Atacar();
		pikachu.Evoluir();
		pikachu.exibirInfo();
		
		eevee.exibirInfo();
		eevee.Atacar();
		eevee.Evoluir();
		eevee.exibirInfo();
		
	}	
}
