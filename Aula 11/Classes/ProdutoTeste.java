package classes;

public class ProdutoTeste {

	public static void main(String[] args) {
//Setagens:
		Produto p1 = new Produto("notebook Dell 15", 4430.86);
        var p2 = new Produto("Mouse s/ fil Dell Gaming", 257.37);

		System.out.println(p1.nome);
		System.out.println(p1.preco + " (Valor s/ desconto).\n");
		
		System.out.println(p2.nome);
		System.out.println(p2.preco + " (Valor s/ desconto).\n");
//descontos:
		Produto.desconto = 0.50; // Alterando de forma explicita o desconto que era estático.
		double precoFinal1 = p1.precoComDesconto(0);
		double precoFinal2 = p2.precoComDesconto(0);
		
		System.out.printf("O preço com desconto é: R$%.2f\n", precoFinal1);
		System.out.printf("O preço com desconto é: R$%.2f\n", precoFinal2);
	}
}
