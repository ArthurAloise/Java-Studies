package controle;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String frase = "";
		while(!frase.equalsIgnoreCase("sair")) {
			System.out.println("Speak: (Digite" + " 'Sair' " + "para sair).");
			frase = scan.nextLine();
		}
		scan.close();
	}

}
