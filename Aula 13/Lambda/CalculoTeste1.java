package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		Calculo soma = new Somar();
		System.out.println(soma.executar(4, 4));
		
		Calculo multiplicacao = new Multiplicar();
		System.out.println(multiplicacao.executar(4, 4));
	}
}
