package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a média do aluno: ");
		String media = scan.next();
		double media1 = Double.parseDouble(media);
		
		if(media1 <=10 && media1 >= 7.0) {
			System.out.println("Parabens, você foi aprovado!");
		}
		else if(media1 <=7 && media1 >=0) {
			System.out.println("VOcê foi reprovado, vai estudar vagabundo!");
		}
	scan.close();
	}
     
}
