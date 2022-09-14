package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner (System.in);
		
		int qtdNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota do aluno: " + "('N' para sair). ");
			nota = scan.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
			qtdNotas++;
			}
		}
		//calculo:
		double media = total/ qtdNotas;
		System.out.printf("A média da turma é: ", media);
		System.out.println(total);
		
		scan.close();
	}

}
