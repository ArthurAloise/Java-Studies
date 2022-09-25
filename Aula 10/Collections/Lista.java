package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista { //List

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Arthur");

		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Pedro"));
		lista.add(new Usuario("Marcus"));
		lista.add(new Usuario("Jack"));

		System.out.println(lista.get(0)); //Mostra o que tem no índice.
		
		System.out.println(lista.remove(new Usuario("Marcus"))); //Remove da lista.(melhor modo)
		System.out.println(">>> "+lista.remove(2)); //Remove.
		System.out.println("Contém? "+lista.contains(new Usuario("Jack"))); // Verifica se tem na lista.
		
		for (Usuario user : lista) {
			System.out.println(user.nome);
		}
	}
}

