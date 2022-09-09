package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int qtdAlunos = scan.nextInt();
		
		System.out.print("Quantas notas por aluno? ");
		int qtdNotas = scan.nextInt();
		
		double notasDaTurma[][] = new double[qtdAlunos][qtdNotas]; //Matriz
		
		double total = 0;//Somador adcionado.
		for(int i = 0; i< notasDaTurma.length; i++) {
			for(int j = 0; j< notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", j+1, i+1);
				notasDaTurma[i][j] = scan.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		
		double media = total/(qtdAlunos*qtdNotas);
		System.out.println("A média da turma é: " + media);
		
		for(double[] notasDoAluno:notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		scan.close();
	}
}
