package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado { //Set#1
	
	@SuppressWarnings({ "rawtypes", "unchecked" }) // Tira marcação de erros.
	public static void main(String[] args) {
		//HashSet não aceita tipos primitivos,
		//então ele converte;
		//Não aceita valores repetidos.
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(0.96); // double --> Double
		conjunto.add("João");
		conjunto.add("Pedro");
		conjunto.add("Arthur");
		conjunto.add("Gnomeu");
		conjunto.add("meia nove = " + 69);
		conjunto.add(1);
		
		System.out.print(conjunto);
		System.out.println("\n"+conjunto.size() + 
				" Itens no Set."); //Quantidade.
		
		System.out.println(conjunto.remove(0.96)); //Remove.
		System.out.println("\n"+conjunto.size() + 
				" Itens no Set.");
		
		System.out.println(conjunto.contains("Arthur")); //Verifica.
		
		Set numeros = new HashSet(); //Forma semelhante.
		numeros.add(1);
		numeros.add(13);
		numeros.add(777);
		numeros.add(69);
		numeros.add(157);
		
		System.out.println(numeros);
		System.out.println(conjunto);
		
		//conjunto.addAll(numeros); //União entre dois conjuntos.
		conjunto.retainAll(numeros); // mantem valores comuns.
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}
