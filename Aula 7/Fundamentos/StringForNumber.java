package fundamentos;

import javax.swing.JOptionPane;

public class StringForNumber {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		
		double numero1 = Double.parseDouble(valor1); //Passando o valor1(String) para número.
		double numero2 = Double.parseDouble(valor2); //Passando o valor2(String) para número.
		
		double soma = numero1 + numero2; //Agora só utilizar os números convertidos.
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + soma);
	}

}
