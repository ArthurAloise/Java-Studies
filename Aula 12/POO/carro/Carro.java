package orientadoObjeto.carro;

public class Carro {

	int velocidadeAtual;
	final int VELOCIDADE_MAXIMA;
	
	Carro(int velocidadeMax){
		VELOCIDADE_MAXIMA = velocidadeMax;
	}

	void acelerar() {
		if(velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += 5;
		}
	}
			
	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "A velocidade atual é: " + velocidadeAtual + "Km/h.";
	}
}
