//3.  Construa um programa que, dado as coordenadas x e y de dois pontos quaisquer de um plano cartesiano, P1 e P2, calcule e imprima a distância entre eles.
import java.util.Scanner;
public class Cartesiano {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        //Primeira reta:
        System.out.print("Digite o 1º valor de X: ");
        double x1 = leitor.nextDouble();
        System.out.print("Digite o 1º valor de Y: ");
        double y1 = leitor.nextDouble();

        //Segunda reta:
        System.out.print("Digite o 2º valor de X: ");
        double x2 = leitor.nextDouble();
        System.out.print("Digite o 2º valor de Y: ");
        double y2 = leitor.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));

        System.out.println("A distância entre os dois pontos é: " + distancia  );




    }
}