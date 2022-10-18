package orientadoObjeto.encapsulamento;

public class Pessoas {
	
	private int idade;

	public Pessoas(int idade) {
		setIdade(idade);
	}
	
	//Getter -> Exibe Atributo
	public int getIdade() {
		return idade;
	}
	
	//Setter -> Altera atributo
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade > 0 && novaIdade < 120) {
			this.idade = novaIdade;
		}
	}
}
