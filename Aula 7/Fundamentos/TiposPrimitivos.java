package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es do funcion�rio.
		
		//Tipos num�ricos inteiros.
		byte anosDeEmpresa = 23;//-128 at� 127
		short numeroDeVoos = 542; //-32.768 at� 32.767
		int id = 56789; 
		long pontosAcumulados = 3_140_845_223L; //Passou do tipo primitivo(n�) m�ximo, coloca-se um "L" no final.
		
		//Tipos Num�micos reais
		float salario = 11_445.44F; //S� d� pra usar "Double" em float se colocar um "F" no final do n�mero.
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //True
		
		//Tipo caractere
		char status = 'A'; //Ativo
		
		//Dias de empresa
		System.out.println("O funcion�rio tem " + anosDeEmpresa * 365 + " dias trabalhados na empresa.");
		
		//N�mero de viagens
		System.out.println("fez " + numeroDeVoos / 2+ " Viagens.");
		
		//Pontos por real 
		System.out.println("Ganhou " + pontosAcumulados / vendasAcumuladas + " de Dots por pontos acumulados.");
		
		System.out.println("O " + id + " ganha -> " + salario + " Por m�s.");
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}

}
