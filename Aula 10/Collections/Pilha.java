package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha { //Stak
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("Harry Potter");
		livros.push("Orfeu");
		livros.push("O Pequeno Principe");
		livros.push("Game Of Thrones");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		//ver
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		//remover
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.remove());
		
		//livros.size();
		//livros.clean();
		//livros.contains();
		//livros.isEmpty();
		
		
	}
}
