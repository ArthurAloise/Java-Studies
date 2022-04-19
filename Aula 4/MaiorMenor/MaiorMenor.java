import java.util.Scanner;
public class MaiorMenor {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        //1. Dado 2 números, calcular o maior e o menor ou dizer se são iguais



        System.out.print("Digite um número: "  );
        double numero1 = leitor.nextDouble();

        System.out.print("Digite outro número: ");
        double numero2 = leitor.nextDouble();
        
        if (numero1 == numero2) {
            //Se o 1º número for igual ao segundo.
            System.out.println(" O primeiro número é igual ao segundo ");
        }
        else if (numero1 > numero2) {
            //Se o 1º número for maior que o segundo.
            System.out.println(" O primeiro número é maior que o segundo ");
        }
        else {
            //Se o 2º numero for maior que o primeiro
            System.out.println(" O segundo número é maior que o primeiro ");
        }

        leitor.close();

    }
}