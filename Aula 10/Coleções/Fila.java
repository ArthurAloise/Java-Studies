package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila { //Queue
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Adcionam na fila.
		//Divergentes quando a fila est� CHEIA!
		
		fila.add("Anna"); //Retorna True/False.
		fila.offer("Joaquim"); //Lan�a Exce��o
		fila.offer("Rodolfo");
		fila.offer("Maria");
		fila.offer("Carlos");
		fila.offer("Joaquim");
		fila.offer("Daniel");
		
		//Peek e Element -> V�o obter o pr�ximo elemento da fila(S/ Remover).
		
		//A diferen�a de comportamento ocorre 
		//quando a fila est� VAZIA!
		System.out.println(fila.peek()); //Retorna Null.
		System.out.println(fila.peek());
		System.out.println(fila.element()); //Retorna Exce��o.
		System.out.println(fila.element());
		
		
		//Poll e Remove -> V�o obter o pr�ximo elemento da fila
		//(Removendo).
		
		//A diferen�a de comportamento ocorre 
		//quando a fila est� VAZIA!
		System.out.println(fila.poll()); //Retorna null.
		System.out.println(fila.poll()); 
		System.out.println(fila.remove()); //Retorna Exce��o. 
		System.out.println(fila.poll());
		
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
	}
}
