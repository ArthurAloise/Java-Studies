package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um n�mero desejado: ");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("� um n�mero par. ");
		}
		else {
			System.out.println("� um n�mero �mpar. ");
		}
	}

}
