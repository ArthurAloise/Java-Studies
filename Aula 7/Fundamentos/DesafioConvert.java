package fundamentos;

import java.util.Scanner;

public class DesafioConvert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário: ");
		String salario1 = scan.next().replace(",",".");
		
		System.out.println("Digite o segundo salário: ");
		String salario2 = scan.next().replace(",",".");
		
		System.out.println("Digite o terceiro salário: ");
		String salario3 = scan.next().replace(",",".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double soma = (valor1 + valor2 + valor3);
		double media = soma / 3;
		
		System.out.println(soma);
		System.out.println(media);
						
		scan.close();
	}
 
}
