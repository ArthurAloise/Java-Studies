import java.util.Scanner;
public class Crescente {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        //2. Dado 2 números, mostrá-los em ordem crescente
        
        System.out.print("Digite um número: "  );
        int numero1 = leitor.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = leitor.nextInt();
        
        
       
        if (numero2 > numero1) {
            //
            System.out.println( "Sequencia é " + numero1 + ","  + numero2 );
        }
        else if (numero1 > numero2) {
            //
            System.out.println( "Sequencia é " + numero2 + ","  + numero1 );
        }
        else {
            //
            System.out.println( numero1 + " e " + numero2 + " são iguais.");
        }

        leitor.close();

    }
}