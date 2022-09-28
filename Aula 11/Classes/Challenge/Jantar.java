package classes.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comidas janta = new Comidas("Shushi", 0.500);
		Comidas janta1 = new Comidas("Açai", 0.700);
		
		Pessoas serumanu = new Pessoas("Godofredo", 99.6);
		
		System.out.println(serumanu.apresentar() + " (Antes de comer)");
		serumanu.comer(janta);
		serumanu.comer(janta1);
		
		System.out.println(serumanu.apresentar() );
		serumanu.comer(janta);
		serumanu.comer(janta1);
		
		System.out.println(serumanu.apresentar() + " (Depois de comer)");
	}

}
