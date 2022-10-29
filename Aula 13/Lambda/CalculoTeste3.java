package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> calculo1 = (x, y) -> { return x+y; };
		System.out.println(calculo1.apply(3.0, 8.0));
		
		calculo1 = (x, y) -> x*y;
		System.out.println(calculo1.apply(3.0, 8.0));
		
		BinaryOperator<Integer> calculo2 = (x, y) -> { return x+y; };
		System.out.println(calculo2.apply(3, 8));
		
		calculo2 = (x, y) -> x*y;
		System.out.println(calculo2.apply(3, 8));
	}

}
