package arrays;

import java.util.Arrays;

public class ExercicioArrays {
	
	public static void main(String[] args) {
		
		double notasAluno[] = new double[4];
		System.out.println(Arrays.toString(notasAluno));
		
		notasAluno[0] = 7.6;
		notasAluno[1] = 8.5;
		notasAluno[2] = 9.3;
		notasAluno[3] = 9.8;
		
		System.out.println(Arrays.toString(notasAluno));
		System.out.println(notasAluno[notasAluno.length - 1]); //Acessa o ultimo item do Arrays.
		
		double total = 0;
		for(int i = 0; i < notasAluno.length; i++) {
			total += notasAluno[i];
		}
		System.out.println(total / notasAluno.length);
		
		double notasAluno2[] = {9.8, 5.7, 8.2, 6.9, 10};
		
		double total2 = 0;
		for(int i = 0; i < notasAluno2.length; i++) {
			total2 += notasAluno2[i];
		}
		System.out.println(total2 / notasAluno2.length);
	}
}
