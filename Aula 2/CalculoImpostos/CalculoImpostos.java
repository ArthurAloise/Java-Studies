import java.util.Scanner; 
    public class CalculoImpostos {
        public static void main(String[] args) throws Exception {
            Scanner leitor = new Scanner(System.in);

            //4. Leia o preço de custo do produto,  o valor de impostos para a venda, e a margem de lucro desejada para esse produto. 
            //Dado essas informações, calcule o valor de venda.

            System.out.print( "Qual é o valor do produto? " );
            double produto = leitor.nextDouble();

            System.out.print(" Qual é o valor do imposto? ");
            double imposto = leitor.nextDouble();
            double valorImposto = (imposto/100);

            System.out.print(" Quantos porcento de lucro? ");
            double lucro = leitor.nextDouble();
            double valorDoLucro = lucro/100;

            leitor.close();

            double somaDoProduto = valorImposto * produto;
            double valorFinal = somaDoProduto + produto;

            double porcentagemLucro = produto*valorDoLucro;
            
            double valorDeVenda = porcentagemLucro + valorFinal;
             


            System.out.println("Terá " + "R$" + somaDoProduto + " Reais de imposto dentro dos " + "R$" + valorFinal);
            System.out.println(" O valor final da venda será de: " + "R$" + valorDeVenda + " Reais.");

            

    }
}