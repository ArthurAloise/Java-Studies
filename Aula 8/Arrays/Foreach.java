package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		double notas[] = {6.7, 7.8, 8.9, 9.8};
		
		for(double nota: notas) {  //Foreach.
			System.out.print(nota + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < notas.length; i++) { //For normal.
			System.out.print(notas[i]+ " ");
		}
	}

}
