//6. Faça um algoritmo que leia 10 números, e verifique qual o menor, o maior e a média deles.
import java.util.Arrays;
import java.util.Scanner;
public class ler10 {
    public static void main(String[] args) throws Exception {
         Scanner leitor = new Scanner(System.in);

         System.out.print("Digite um número: ");
         int numero1  = leitor.nextInt();
         System.out.print("Digite um número: ");
         int numero2  = leitor.nextInt();
         System.out.print("Digite um número: ");
         int numero3  = leitor.nextInt();
         System.out.print("Digite um número: ");
         int numero4  = leitor.nextInt();
         System.out.print("Digite um número: ");
         int numero5  = leitor.nextInt();
         System.out.print("Digite um número: ");
         int numero6  = leitor.nextInt();
         System.out.print("Digite um número: ");
         int numero7  = leitor.nextInt();
         System.out.print("Digite um número: ");
         int numero8  = leitor.nextInt();
         System.out.print("Digite um número: ");
         int numero9  = leitor.nextInt();
         System.out.print("Digite um número: ");
         int numero10  = leitor.nextInt();

         int vet[]= {numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9, numero10 };
         Arrays.sort(vet);

         for (int numero:vet){

         System.out.print(numero);
        
        }
         int max = vet[0];
         int min = vet[0];
         for (int i =0; i < vet.length; i++){
            if (vet[i] > max) {
              max = vet[i];
            }
            if (vet[i] < min){
                min = vet[i];
            }
        }
         System.out.println("\n");
         System.out.println( "O maior é:" + max);
         System.out.println( "O menor é:" + min);
         System.out.println("\n");

         int media = (max + min)/2;
         System.out.println("A média entre ambos é:" + media);

        


    

    }
}    