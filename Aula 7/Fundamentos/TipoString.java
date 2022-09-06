package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Fala comigo!".charAt(0));
		
		String s = "Boa tarde";
		System.out.println(s.startsWith("Boa")); //Verifica como começa a frase;
		System.out.println(s.toLowerCase().startsWith("boa")); //Com miusculos só funciona se alternar a frase;
		System.out.println(s.endsWith("tarde")); // Verifica como termina a frase;
		System.out.println(s.length()); // Verifica quantos caracteres possui;
		System.out.println(s.equals("Boa tarde")); // verifica se a frase é igual;
		System.out.println(s.equalsIgnoreCase("boa tarde"));// Ignora o se é maiusculo ou minúsculo e compara o que está escrito.
		
		var name = "Arthur";
		var sname = "L. Aloise";
		var age = 22;
		var money = 1_258.877;
		
		System.out.printf("Name %s %s, %s anos, e tem R$%.2f. Reais.", name, sname, age, money); //%s -> String; | %f -> Double; | %d -> Int.
		
		String frase = String.format("Name %s %s, %s anos, e tem R$%.2f. Reais.", name, sname, age, money);
		System.out.println();
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("quer")); // Saber se tem a palavra na frase;
		System.out.println("Frase qualquer".indexOf("qual")); // O nº onde está localizado a frase;
		System.out.println("Frase qualquer".substring(6)); // Começa a ler a partir de qual caractere quiser;
		System.out.println("Frase qualquer".substring(6, 10)); // Ler de um ponto até outro caractere.
		
		
	}

}
