package orientadoObjeto.carro;

public class Ferrari extends Carro {

	Ferrari() {
		super(310);
	}

	Ferrari(int velocidadeMax) {
       super(velocidadeMax);
	}

	@Override
	void acelerar() {
		velocidadeAtual += 20;
	}

	@Override
	void frear() {
		if (velocidadeAtual < 20) {
			velocidadeAtual -= 20;
		} else {
			velocidadeAtual = 0;
		}
	}
}
