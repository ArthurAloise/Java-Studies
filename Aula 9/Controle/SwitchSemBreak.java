package controle;

import java.util.Scanner;

public class SwitchSemBreak {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em que feixa você está, pequeno gafanhoto? ");
		String faixas = scan.nextLine();
		
		switch (faixas.toLowerCase()) {
		case "preta":
			System.out.println("Sabe o golpe 7 e ");
		case "marrom":
			System.out.println("Sabe o golpe 6 e ");
		case "roxa":
			System.out.println("Sabe o golpe 5 e ");
		case "verde":
			System.out.println("Sabe o golpe 4 e ");
		case "laranja":
			System.out.println("Sabe o golpe 3 e ");
		case "vermelha":
			System.out.println("Sabe o golpe 2 e ");
		case "amarela":
			System.out.println("Sabe o golpe 1.");
		//default:
		//	System.out.println("Iniciante na luta.");
		}
		scan.close();
		System.out.println("Fim!");
	}
}
