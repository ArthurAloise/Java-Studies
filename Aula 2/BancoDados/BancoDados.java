import java.util.Scanner;
import Math;
public class BancoDados {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

//2. Leia o saldo de uma conta
//bancária, a taxa de juros anual e um inteiro representando número de meses, e
//calcule o saldo da conta ao fim desse número de meses, partindo do princípio de
//que não há movimentos na conta. 
        
        System.out.print(" Informe o saldo na conta: ");
        double capital = leitor.nextDouble();

        System.out.print(" Informe o tempo em que o dinheiro ficou parado: ");
        double meses = leitor.nextDouble();

        System.out.print(" Informe os juros aplicados: ");
        double juros = leitor.nextDouble();
        

        // Processamento de dados.
        double porcentagemDeJuros = juros/100;
        
 
        double montanteFinalAoAno =  capital* Math.pow (1 + porcentagemDeJuros, meses);

        System.out.printf(" A ao final de um anos, terá um montante de: R$ %.2f", montanteFinalAoAno);

        leitor.close();


    }
    
}    
     