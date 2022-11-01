package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Bia", "Liz", "Jão", "Ana");
		
		System.out.println("Forma tradicional: ");
		for(String selecionados: aprovados) {
			System.out.println(selecionados);
		}
		
		System.out.println("\nLambda #01: ");
		aprovados.forEach(selecionados -> System.out.println(selecionados + "."));
		
		System.out.println("\nMethod Reference:");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02: ");
		aprovados.forEach(selecionados -> imprimir(selecionados));
		
		System.out.println("\nMethod Reference #02: ");
		aprovados.forEach(Foreach::imprimir);
		
		}
	static void imprimir(String aprovados) {
		System.out.println("Oi! meu nome é " + aprovados);
	}

}
