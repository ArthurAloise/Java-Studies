import java.util.Random;
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        //Cria um vetor, que armazena 10 elementos. 
        int[] notas = new int[10];
        for(int i = 0; i < notas.length; i++ ){
            System.out.print("Digite um Valor: ");
            var nota = leitor.nextLine();

            notas[i] = Integer.parseInt(nota);
            System.out.println(notas[i]);
        }
        leitor.close();

        int[] notas1 = new int[10];
        for(int i =0; i<notas1.length; i++){
            notas1[i] = i;
        }

        for(int i =0; i<notas.length; i++){
            System.out.println(notas[i]);
        }
        
        //Para números aleatórios.
        System.out.println("Dados ateatórios ");
        Random r = new Random();
        int[] aleatorios = new int[50];

        for(int i =0; i<aleatorios.length; i++){
            
            aleatorios[i] = r.nextInt(0,10);
            System.out.println(aleatorios[i]);
        }
    }
}
        
        
        



