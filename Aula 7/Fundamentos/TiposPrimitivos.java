package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário.
		
		//Tipos numéricos inteiros.
		byte anosDeEmpresa = 23;//-128 até 127
		short numeroDeVoos = 542; //-32.768 até 32.767
		int id = 56789; 
		long pontosAcumulados = 3_140_845_223L; //Passou do tipo primitivo(nº) máximo, coloca-se um "L" no final.
		
		//Tipos Numémicos reais
		float salario = 11_445.44F; //Só dá pra usar "Double" em float se colocar um "F" no final do número.
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //True
		
		//Tipo caractere
		char status = 'A'; //Ativo
		
		//Dias de empresa
		System.out.println("O funcionário tem " + anosDeEmpresa * 365 + " dias trabalhados na empresa.");
		
		//Número de viagens
		System.out.println("fez " + numeroDeVoos / 2+ " Viagens.");
		
		//Pontos por real 
		System.out.println("Ganhou " + pontosAcumulados / vendasAcumuladas + " de Dots por pontos acumulados.");
		
		System.out.println("O " + id + " ganha -> " + salario + " Por mês.");
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}

}
