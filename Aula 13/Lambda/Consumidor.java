package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = product -> System.out.println(product.nome);
		
		Produto product1 = new Produto("Notebook", 4500, 0.15 );
		imprimirNome.accept(product1);
		
		Produto product2 = new Produto("Processador I9 - 12000", 4000, 0.15 );
		Produto product3 = new Produto("Monitor Aoc", 1500, 0.10 );
		Produto product4 = new Produto("Headset Logitech", 550, 0.15 );
		Produto product5 = new Produto("Mouse Logitech", 550, 0.15 );
		
		List<Produto> produtos = Arrays.asList(product1, product2, product3, product4, product5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(product -> System.out.println(product.preco));
		produtos.forEach(System.out::println);
		
	}

}
