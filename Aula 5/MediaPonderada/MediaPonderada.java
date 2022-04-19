//4. Dado 3 notas e o peso de cada uma, faça um programa que calcule a média ponderada dessas notas.
import java.util.Scanner;
public class MediaPonderada {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        //Primeira nota:
        System.out.print("Digite a 1ª nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite o 1º peso: ");
        double peso1 = leitor.nextDouble();

        //Segunda nota:
        System.out.print("Digite 2ª nota: ");
        double nota2 = leitor.nextDouble();

        System.out.print("Digite o 2º peso: ");
        double peso2 = leitor.nextDouble();

        //Terceira nota:
        System.out.print("Digite a 3ª nota: ");
        double nota3 = leitor.nextDouble();

        System.out.print("Digite o 3º peso: ");
        double peso3 = leitor.nextDouble();

        double peso = peso1 + peso2 + peso3;
        double media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3))/peso;

        System.out.println("A média ponderada é " + media);
      


    }

}