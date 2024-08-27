package prjZoo;

public class ClasseAnimal {
	//Atributos
	String atributoNome;
	String atributoRaca;
	String atributoSexo;
	double atributoPeso;
	
	//Construtores
	
	public ClasseAnimal () {	
		
	}
	
	public ClasseAnimal (String parametroNome, String parametroRaca, String parametroSexo, double parametroPeso) {
		this.atributoNome = parametroNome;
		this.atributoRaca = parametroRaca;
		this.atributoSexo = parametroSexo;
		this.atributoPeso = parametroPeso;
	}
	
	//metodos
	public void nhamiNhami() {
		if (this.atributoPeso >= 5000) {
			System.out.println(this.atributoNome + " ta gorda, precisa se exercitar");
		}
		else {
			this.atributoPeso -= 10;  
		}
		this.atributoPeso -= 10;
	}
	public void marchaAtletica() {
		if (this.atributoPeso <= 3000) {
			System.out.println(this.atributoNome + " ta muito magra, bora comer");
		}
		else {
		    this.atributoPeso += 10;
		}
		this.atributoPeso += 10;
	}
	public void exibirInfo() {
		System.out.println("nome: " + this.atributoNome);
		System.out.println("Peso: " + this.atributoPeso);
		
	}
}
