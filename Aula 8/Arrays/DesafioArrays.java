package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas notas: ");
		int qtdNotas = scan.nextInt();
		
		double notas[] = new double[qtdNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Informe as notas " + (i+1) + ": ");
			notas[i] = scan.nextDouble();
		}
		System.out.println(Arrays.toString(notas));
		
		int total = 0;
		for(double nota:notas) {
			total += nota;
		}
		
		double media = total/notas.length;
		System.out.println("A média do aluno é: " + (media));
		
		scan.close();
		
	}

}
