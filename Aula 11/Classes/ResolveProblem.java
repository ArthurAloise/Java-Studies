package classes;

public class ResolveProblem {
	
	int a = 3; //Mesmo estando na pr�pria classe, s� d� de acessar um membro instanciado com um m�doto.
	static int b = 5; //Ou tornando static.
	
	public static void main(String[] args) {
		
		ResolveProblem x = new ResolveProblem(); //M�todo.
		
		System.out.println(x.a);
		System.out.println(b);
	}

}
