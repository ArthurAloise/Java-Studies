//5. Dado o dia, mês e ano de nascimento,  verifique se a pessoa está apta a votar ou não (maior ou igual a 16 anos). 
//OBS: verifique na internet como retornar o dia, mês e ano atual na sua plataforma de desenvolvimento.
import java.util.Scanner;
public class Votacao {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual dia que você nasceu? ");
        int diaNas = leitor.nextInt();

        System.out.print("Em que mês você nasceu(número)? ");
        int mesNas = leitor.nextInt();

        System.out.print("Em que ano nasceu? ");
        int anoNas = leitor.nextInt();

        int anoAtual = 2022;
        

        int idadeAtual = anoAtual - anoNas; 
        System.out.println("------------------------------------");
        System.out.println("Suas data de nascimento é: " + diaNas + "/" + mesNas + "/" + anoNas);
        System.out.println("------------------------------------");

        if (idadeAtual < 16 ) {
        System.out.print("Você não tem idade para votar.");
        }
        else if (idadeAtual >= 16 && idadeAtual < 18) {
        System.out.print("Seu voto é facultativo.");
        }
        else {
        System.out.print("O seu voto é obrigatório!");    
        }

        leitor.close();
    }

}