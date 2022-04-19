import java.util.Scanner;
public class TresCrescente {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        //3. Dado 3 números, verificar qual o maior e o menor deles
        
        System.out.print("Digite um número: "  );
        int numero1 = leitor.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = leitor.nextInt();

        System.out.print("Digite mais um número: ");
        int numero3 = leitor.nextInt();
        
        
        if (numero2 > numero1 && numero3 > numero2) {
            //1
            System.out.println( "Sequencia é " + numero1 + " é menor que "  + numero2 + " e menor que " + numero3 );
            System.out.println( "O menor é " + numero1 + ", e o maior é "  + numero3 );
        }
        else if (numero1 > numero2 && numero3 > numero1) {
            //2
            System.out.println( "Sequencia é " + numero2 + " é menor que "  + numero1 + " e menor que " + numero3);
            System.out.println( "O menor é " + numero2 + ", e o maior é "  + numero3 );
        }
        else if (numero3 > numero2 && numero1 < numero2) {
            //3
            System.out.println( "Sequencia é " + numero1 + " é menor que " + numero2 + " e menor que "  + numero3 );
            System.out.println( "O menor é " + numero1 + ", e o maior é "  + numero3 );
        }
        
        else if (numero1 > numero2 && numero3 < numero2) {
            //4
            System.out.println( "Sequencia é " + numero3 + " é menor que "  + numero2 + " e menor que " + numero1 );
            System.out.println( "O menor é " + numero3 + ", e o maior é "  + numero1 );
        }
        else if (numero1 < numero2 && numero3 < numero1) {
            //5
            System.out.println( "Sequencia é " + numero3 + " é menor que "  + numero1 + " e menor que " + numero2 );
            System.out.println( "O menor é " + numero3 + ", e o maior é "  + numero2 );
        }
        else if (numero1 > numero2 && numero3 > numero2) {
            //6
            System.out.println( "Sequencia é " + numero2 + " é menor que "  + numero3 + " e menor que" + numero1);
            System.out.println( "O menor é " + numero2 + ", e o maior é "  + numero1 );
        }
        else if (numero1 < numero3 && numero2 > numero3) {
            //7
            System.out.println( "Sequencia é " + numero1 + " é menor que "  + numero3 + " e maior que " + numero2);
            System.out.println( "O menor é " + numero1 + ", e o maior é "  + numero2 );
        }
        else if (numero1 == numero2 && numero2 == numero3) {
            //8
            System.out.println( "Os números " + numero1 + ", "  + numero2 + ", " + numero3 + " são iguais.");
        }

        leitor.close();

    }
}