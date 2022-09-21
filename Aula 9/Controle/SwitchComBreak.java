package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String conceito = "";
		
		System.out.println("Informe sua nota: ");
		int nota = scan.nextInt();
		
		switch(nota) {
		case 10:
			conceito = "A+";
			break;
		case 9:
			conceito = "A";
			break;
		case 8:
			conceito = "B+";
			break;
		case 7:
			conceito = "B";
			break;
		case 6:
			conceito = "C+";
			break;
		case 5:
			conceito = "C";
			break;
		default:
			System.out.println("Conceito inválido... ");
		
		}
		System.out.println("Você tem o conceito: " + conceito);
		scan.close();
	}

}
