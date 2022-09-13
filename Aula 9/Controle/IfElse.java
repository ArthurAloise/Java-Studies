package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um número desejado: ");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("É um número par. ");
		}
		else {
			System.out.println("É um número ímpar. ");
		}
	}

}
