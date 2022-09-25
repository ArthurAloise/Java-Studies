package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado { //Set#2
	
	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<String>();
		SortedSet<String> lista = new TreeSet<>(); //Odenado
		
		lista.add("Arthur");
		lista.add("Trereré");
		lista.add("Netflix");
		lista.add("Git Hub");
		
		for(String usuarios: lista) {
			System.out.println(usuarios);
		}
		
		Set<Integer> numbs = new HashSet<>();
		numbs.add(1);
		numbs.add(2);
		numbs.add(3);
		numbs.add(4);
		
		//lista.get(0); // Não é possivel acessar pelo índice
		for(Integer numeros: numbs) {
			System.out.println(numeros);
		}


	}

}
