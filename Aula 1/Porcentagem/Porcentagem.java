import java.util.Scanner;
    public class Porcentagem {
    public static void main(String[] args) throws Exception{

        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Valor do produto: ");
        double valorDoProduto = leitor.nextDouble();

        
        System.out.print("Valor da Porcentagem: ");
        double valorDaPorcentagem = leitor.nextDouble();
        // Lucro
        double porcentagemDeLucro = (valorDoProduto * valorDaPorcentagem);
        double acrescimo = porcentagemDeLucro/100;
        double produtoSomadoComPorcentagem = valorDoProduto + acrescimo;
        // Desconto
        double porcentagemDeDesconto = (valorDoProduto * valorDaPorcentagem);
        double desconto = porcentagemDeDesconto/100;
        double valorDescontadoDoProduto = valorDoProduto - desconto;

        leitor.close();
         
        System.out.println("----------"); 
        System.out.println("SOMA TOTAL");
        System.out.println("----------"); 
       

        System.out.println(" O valor total é de: " + produtoSomadoComPorcentagem);

        
        System.out.println("--------"); 
        System.out.println("DESCONTO");
        System.out.println("--------"); 
        

        System.out.println(" O que sobra de " + valorDoProduto + " Reais é " + valorDescontadoDoProduto + " Reais ");

        

    } 
}        