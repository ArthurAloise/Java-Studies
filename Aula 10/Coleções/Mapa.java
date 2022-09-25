package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuario = new HashMap<>();
		usuario.put(1, "João");
		usuario.put(3, "Arthur");
		usuario.put(4, "Ana");
		usuario.put(5, "Edinho");
		
		System.out.println(usuario.size());
		
		System.out.println(usuario.keySet());
		System.out.println(usuario.values());
		
		System.out.println(usuario.entrySet());
		System.out.println(usuario.containsValue("Arthur"));
		System.out.println(usuario.containsKey(3));
		
		System.out.println(usuario.get(3));
		System.out.println(usuario.remove(5));
		
		for(int chave : usuario.keySet()) { //Percorre os números.
			System.out.println(chave );
		}
		for(String valor : usuario.values()) { //Percorres as Strings.
			System.out.println(valor);
		}
		for(Entry<Integer, String> registro : usuario.entrySet()) { //Percorre todos ao mesmo tempo.
			System.out.print(registro.getKey()+" - ");
			System.out.println(registro.getValue());
		}
		
		
	}
}
