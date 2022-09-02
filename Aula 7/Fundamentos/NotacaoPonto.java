package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) throws Exception {
		
		String s = "Fala comigo, X";
		s = s.replace("X", "Senhora"); //Troca determinada palavra por outra;
		s = s.toUpperCase(); //Altera tudo pra maiúsculo;
		s = s.concat("!!!"); //Adiciona algo na frase já escrita.
		
		System.out.println(s);
		
		String x = "Arthur L. Aloise".toUpperCase();
		System.out.println(x);
		
		String y = "Fala comigo, X".replace("X", "Aloise").toUpperCase().concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
		
	}

}
