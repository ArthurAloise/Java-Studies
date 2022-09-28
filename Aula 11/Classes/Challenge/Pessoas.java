package classes.desafio;

public class Pessoas {
	
	String nome;
	double peso;
	
	Pessoas(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comidas comida){
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		return "Oi, meu nome é " + nome + " e tenho " + peso +" Kg.";
	}
}

