package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a semana em que está: ");
		String semana = scan.next();
		
		if("Domingo".equalsIgnoreCase(semana)) {
			System.out.println("~1~");
		}
		else if("Segunda".equalsIgnoreCase(semana)) {
			System.out.println("~2~");
		}
		else if("terça".equalsIgnoreCase(semana) || "terca".equalsIgnoreCase(semana)) {
			System.out.println("~3~");
		}
		else if("quarta".equalsIgnoreCase(semana)) {
			System.out.println("~4~");
		}
		else if("quinta".equalsIgnoreCase(semana)) {
			System.out.println("~5~");
		}
		else if("sexta".equalsIgnoreCase(semana)) {
			System.out.println("~6~");
		}
		else if("sábado".equalsIgnoreCase(semana) || "sabado".equalsIgnoreCase(semana)) {
			System.out.println("~7~");
		}else {
			System.out.println("Me diz em que planeta você está! ");
		}
		scan.close();
	}

}
