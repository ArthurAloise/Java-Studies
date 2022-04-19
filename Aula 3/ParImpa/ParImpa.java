import java.util.Scanner;
public class ParImpa {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        // Verificar se é par ou Impar.
        



        System.out.print("Informe um número: ");
        int numero = leitor.nextInt();

        if (numero % 2 == 0) {
            //Par
            System.out.println(" O número é par.");
        }

        if (numero % 2 == 1) {
            //Impar
            System.out.println(" O número é Impar.");
        }

        if (numero % 5 == 0 && numero % 3 == 0) {
            //Divisisvel por 5
            System.out.println(" O número também é divisivel por 5 e por 3.");
        }

        leitor.close();

    }

}        
