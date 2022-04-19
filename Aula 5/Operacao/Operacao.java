//8. Faça um programa que dado 2 números, e a operação desejada (+, -, *, /), dê o resultado dessa conta.
import java.util.Scanner;
public class Operacao {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = leitor.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = leitor.nextDouble();

        System.out.print("Qual operador deseja utilizar?(*, /, + ou -) ");
        char operador = leitor.next().charAt(0);
        double resultado;

        switch(operador){
         case '+':
         resultado = valor1 + valor2;
         System.out.println("O resultado de: " + valor1 + " + " + valor2 + " = " + resultado ); break;

         case '-':
         resultado = valor1 - valor2;
         System.out.println("O resultado de: " + valor1 + " - " + valor2 + " = " + resultado); break;

         case '*':
         resultado = valor1 * valor2;
         System.out.println("O resultado de: " + valor1 + " * " + valor2 + " = " + resultado); break;

         case '/':
             if (valor2 == 0){
             System.out.println("QUE DIABO É ISSO HOMI?! Todo número dividido por ZERO, é ZERO rapaz!");
             }
             else{
             resultado = valor1 / valor2;
             System.out.println("O resultado de: " + valor1 + " / " + valor2 + " = " + resultado); break;
             }
         
         default:
         

        }

    }

}