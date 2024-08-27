package prjZoo;

public class Aplicacao {
	
	public static void main(String[] args) {
		ClasseAnimal elefante = new ClasseAnimal ();
		elefante.atributoNome = "Deme levete";
		elefante.atributoRaca = "elefanteAfricano";
		elefante.atributoSexo = "não-binário";
		elefante.atributoPeso = 4000;
		
		ClasseAnimal girafa = new ClasseAnimal ("Taylor Swift", "Alemã", "Femêa", 5500);
		
		
		subClasseCarnivora leao = new subClasseCarnivora ();
		
		leao.atributoNome = "Katy Perry";
		leao.atributoRaca = "Ligre";
		leao.atributoSexo = "Femêa";
		leao.atributoPeso = 2700;
		
		elefante.exibirInfo();
		elefante.nhamiNhami();
		elefante.exibirInfo();
		
		girafa.exibirInfo();
		girafa.nhamiNhami();
		girafa.exibirInfo();
	
	}
}
