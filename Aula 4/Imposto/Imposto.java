import java.util.Scanner;
public class Imposto {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        //5. Dado o salário bruto de uma pessoa, calcular o desconto de IRRF de acordo com a tabela abaixo, e o salário líquido: 
        //. até 1000 reais de salário, vc é isento de imposto;
        //. entre 1000 e 3000 reais de salário, vc paga 15% de imposto;
        //. acima de 3000 reais de salário, vc paga 27,5%. de imposto
        
        System.out.print("Digite um valor: "  );
        double valor = leitor.nextDouble();
        
        
       
        if (valor <= 1000) {
            //Não paga imposto.
            System.out.println( "Você irá receber " + valor + " e não pagará imposto.");
        }
        else if (valor >= 1000 && valor <=3000) {
            //Pagará imposto de 15%
            double valorPorcentagem = valor*0.15;
            double valorImposto = valor - valorPorcentagem ;

            System.out.println( "Você pagará 15% de imposto, e receberá: " + valorImposto);
        }
        else  {
            //Pagará imposto de 27,5%
            double valorPorcentagem2 = valor*0.275;
            double valorImposto2 = valor - valorPorcentagem2 ;

            System.out.println( "Você pagará 27,5% de imposto, e receberá: " + valorImposto2);

        }
        

        leitor.close();

    }
}