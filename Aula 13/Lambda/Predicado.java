package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> prod.preco * (1 - prod.desconto) >= 700;
	
		Produto produto = new Produto("ARROZ", 6.95, 0.20);
		
		System.out.println(isCaro.test(produto));
		

	}

}
