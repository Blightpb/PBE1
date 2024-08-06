package prjCaneta;

public class Caneta {
  
	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("modelo: " + this.modelo);
		System.out.println("cor: " + this.cor);
		System.out.println("carga: " + this.carga);
	
	}
	
	void rabiscar () {	
	}
	void tampar () {
		this.tampada = true;
	}
	void destampar () {
		this.tampada = false;
	}





}
