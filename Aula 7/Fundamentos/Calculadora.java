package fundamentos.operadores;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite o operador(+, -, *, /): ");
		String op = scan.next();
		
		//A desgraceira:
		double resultado = "+".equals(op)? num1 + num2 : 0;
		resultado = "-".equals(op)? num1 - num2 : resultado;
		resultado = "*".equals(op)? num1 * num2 : resultado;
		resultado = "/".equals(op)? num1 / num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		scan.close();
	}

}
