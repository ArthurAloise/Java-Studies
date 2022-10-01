package classes;

public class ResolveProblem {
	
	int a = 3; //Mesmo estando na própria classe, só dá de acessar um membro instanciado com um médoto.
	static int b = 5; //Ou tornando static.
	
	public static void main(String[] args) {
		
		ResolveProblem x = new ResolveProblem(); //Método.
		
		System.out.println(x.a);
		System.out.println(b);
	}

}
