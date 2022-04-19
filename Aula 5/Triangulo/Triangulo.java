
//1. Desenvolva um algoritmo que dado 3 lados de um Polígono, verifique se ele é um triângulo, e qual o tipo de triângulo ele é (isósceles, escaleno ou equilátero).
import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
    
         
        System.out.print("Digite o 1º valor: ");
        double a = leitor.nextDouble(); 

        System.out.print("Digite o 2º valor: ");
        double b = leitor.nextDouble();

        System.out.print("Digite o 3º valor: ");
        double c = leitor.nextDouble();
        
        // Se for triângulo:
        if ((a + b) > c && (b + c) > a && (a + c) > a) {
        System.out.println("É um triângulo.");
        
        //Tipos de triângulos:
            if (a == b && a == c && b == c) {
             System.out.println("É um triângulo EQUILÁTERO.");
        }
            else if (a != b && b != c && a != c) {
             System.out.println("É um triângulo ESCALENO.");    
        }
            else  {
             System.out.println("É um triângulo ISÓCELES.");
            }

        }
        
        //Se não for triângulo:
        else {
        System.out.print("As medidas não formam um triângulo.");    
        }

    }
}