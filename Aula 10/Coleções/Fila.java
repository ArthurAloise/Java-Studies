package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila { //Queue
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Adcionam na fila.
		//Divergentes quando a fila está CHEIA!
		
		fila.add("Anna"); //Retorna True/False.
		fila.offer("Joaquim"); //Lança Exceção
		fila.offer("Rodolfo");
		fila.offer("Maria");
		fila.offer("Carlos");
		fila.offer("Joaquim");
		fila.offer("Daniel");
		
		//Peek e Element -> Vão obter o próximo elemento da fila(S/ Remover).
		
		//A diferença de comportamento ocorre 
		//quando a fila está VAZIA!
		System.out.println(fila.peek()); //Retorna Null.
		System.out.println(fila.peek());
		System.out.println(fila.element()); //Retorna Exceção.
		System.out.println(fila.element());
		
		
		//Poll e Remove -> Vão obter o próximo elemento da fila
		//(Removendo).
		
		//A diferença de comportamento ocorre 
		//quando a fila está VAZIA!
		System.out.println(fila.poll()); //Retorna null.
		System.out.println(fila.poll()); 
		System.out.println(fila.remove()); //Retorna Exceção. 
		System.out.println(fila.poll());
		
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
	}
}
