package lambdas;

public class CalaculoTeste2 {
	
	public static void main(String[] args) {
		
		Calculo calculo = (x, y) -> { return x+y; };
		System.out.println(calculo.executar(3, 8));
		
		calculo = (x, y) -> x*y;
		System.out.println(calculo.executar(3, 8));
	}
}
