package fundamentos;

import javax.swing.JOptionPane;

public class StringForNumber {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro n�mero: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo n�mero: ");
		
		double numero1 = Double.parseDouble(valor1); //Passando o valor1(String) para n�mero.
		double numero2 = Double.parseDouble(valor2); //Passando o valor2(String) para n�mero.
		
		double soma = numero1 + numero2; //Agora s� utilizar os n�meros convertidos.
		System.out.println("A soma �: " + soma);
		System.out.println("A m�dia �: " + soma);
	}

}
