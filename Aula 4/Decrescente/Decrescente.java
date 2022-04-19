import java.util.Scanner;
public class Decrescente {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        //4. Dado 3 números, colocá-los em ordem decrescente (ex: 4 8 2 -> 8 4 2)
        
        System.out.print("Digite um número: "  );
        int numero1 = leitor.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = leitor.nextInt();

        System.out.print("Digite mais um número: ");
        int numero3 = leitor.nextInt();
        
        
       if (numero2 > numero1 && numero3 > numero2) {
            //1
            System.out.println( "Sequencia é " + numero3 + ","  + numero2 + "," + numero1 );
        }
        else if (numero1 > numero2 && numero3 > numero1) {
            //2
            System.out.println( "Sequencia é " + numero3 + ","  + numero1 + "," + numero2);
        }
        else if (numero3 > numero2 && numero1 < numero2) {
            //3
            System.out.println( "Sequencia é " + numero3 + "," + numero2 + ","  + numero1 );
        }
        
        else if (numero1 > numero2 && numero3 < numero2) {
            //4
            System.out.println( "Sequencia é " + numero1 + ","  + numero2 + "," + numero3 );
        }
        else if (numero1 < numero2 && numero3 < numero1) {
            //5
            System.out.println( "Sequencia é " + numero2 + ","  + numero1 + "," + numero3 );
        }
        else if (numero1 > numero2 && numero3 > numero2) {
            //6
            System.out.println( "Sequencia é " + numero1 + ","  + numero3 + "," + numero2);
        }
        else if (numero1 < numero3 && numero2 > numero3) {
            //7
            System.out.println( "Sequencia é " + numero2 + ","  + numero3 + "," + numero1);
        }
        else if (numero1 == numero2 && numero2 == numero3) {
            //8
            System.out.println( "Sequencia é " + numero3 + ","  + numero2 + "," + numero1);
        }

        leitor.close();

    }
}