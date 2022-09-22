package colecoes;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Pitoco"));
		usuarios.add(new Usuario("Julia"));
		usuarios.add(new Usuario("Robson"));
		usuarios.add(new Usuario("Antônio"));
		
		System.out.println(usuarios.contains(new Usuario("Pitoco")));
	}

}
