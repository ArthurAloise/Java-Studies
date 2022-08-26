import java.util.Scanner;
public class CriaVertor {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        //Informe o número de vetores
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = leitor.nextInt();
        
        //Criar vetor com tamanho desejado
        int[] vetor = new int[tamanho];

        //preencha com o dobro da posição
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = i * 2;
        }

        //Mostrando os elementos do vetor.
        System.out.print("[");
        for(int i = 0; i < vetor.length-1; i++){
            System.out.print(vetor[i]+", ");
        }
        System.out.print(vetor[vetor.length - 1] + "]");

        //Ver a soma:
        var soma = 0;
        for(int i = 0; i < vetor.length; i++){
            soma = soma + vetor[i];
        }
        System.out.println("\nA soma dos vetores é: " + soma);

        //Calcular a média:
        int media = soma / tamanho;
        System.out.println("A média é: " + media);

        leitor.close();
    }
}