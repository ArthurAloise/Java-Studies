package orientadoObjeto.heranca;

public class Jogo {
	
	public static void main(String[] args) {
		
		Heroi heroi = new Heroi(10, 10);
		
		Monstro monstro = new Monstro(10, 10);
		
		System.out.println("Vida: " + monstro.vida);
		System.out.println("Vida: " + heroi.vida);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println("Vida: " + monstro.vida);
		System.out.println("Vida: " + heroi.vida);
		
	}

}
