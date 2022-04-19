import java.util.Scanner;
public class LeitorMedia {
     public static void main(String[] args) throws Exception {
         System.out.println("--------------");
         System.out.println("CALCULO MÉDIO");
         System.out.println("--------------");
         System.out.println(); 
         Scanner leitor = new Scanner(System.in);
         System.out.print("Leia a nota 1: ");
         double n1 = leitor.nextDouble();

         System.out.print("Leia a nota 2: ");
         double n2 = leitor.nextDouble();


         System.out.println("----------");
         System.out.println("RESULTADO");
         System.out.println("----------");
         System.out.println();
             //Variáveis

             double soma = (n1 + n2) / 2;
             System.out.println(" A média das notas "  + n1 + " e " + n2 + " é " + soma);
             leitor.close();
             
    
        }
    
        
    }
             
             
    
             
         


     