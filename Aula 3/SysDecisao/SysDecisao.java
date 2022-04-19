import java.util.Scanner;
public class SysDecisao {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        // dado 2 notas, verificar se o aluno está aprovado
        //Para está aprovado, a média deve ser maior ou igual a 7
        //Scanner leitor =



        System.out.print("Nota 1: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = leitor.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.print("Sua média é: " + media);

        if (media >= 7) {
            //Verdadeiro se for maior ou igual a 7
            System.out.println(" Você está aprovado!");
            }

        else if  (media <4) {
            //Se não for maior ou igual a 7
            System.out.println(" Você está reprovado... Agora fudeu de vez!");
             }

        else   {
            // Se for menor que 4, é reprovado direto!
            System.out.println(" Você foi para prova final");
            }
leitor.close();
    }
}