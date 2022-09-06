package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Fala comigo!".charAt(0));
		
		String s = "Boa tarde";
		System.out.println(s.startsWith("Boa")); //Verifica como come�a a frase;
		System.out.println(s.toLowerCase().startsWith("boa")); //Com miusculos s� funciona se alternar a frase;
		System.out.println(s.endsWith("tarde")); // Verifica como termina a frase;
		System.out.println(s.length()); // Verifica quantos caracteres possui;
		System.out.println(s.equals("Boa tarde")); // verifica se a frase � igual;
		System.out.println(s.equalsIgnoreCase("boa tarde"));// Ignora o se � maiusculo ou min�sculo e compara o que est� escrito.
		
		var name = "Arthur";
		var sname = "L. Aloise";
		var age = 22;
		var money = 1_258.877;
		
		System.out.printf("Name %s %s, %s anos, e tem R$%.2f. Reais.", name, sname, age, money); //%s -> String; | %f -> Double; | %d -> Int.
		
		String frase = String.format("Name %s %s, %s anos, e tem R$%.2f. Reais.", name, sname, age, money);
		System.out.println();
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("quer")); // Saber se tem a palavra na frase;
		System.out.println("Frase qualquer".indexOf("qual")); // O n� onde est� localizado a frase;
		System.out.println("Frase qualquer".substring(6)); // Come�a a ler a partir de qual caractere quiser;
		System.out.println("Frase qualquer".substring(6, 10)); // Ler de um ponto at� outro caractere.
		
		
	}

}
