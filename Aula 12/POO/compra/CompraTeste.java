package orientadoObjeto.compra;

public class CompraTeste {
	public static void main(String[] args) {

		Cliente cliente = new Cliente("José Ferreira Silva");
		Compra compra1 = new Compra();
		
		compra1.addItem("Caneta", 7.45, 20);
		compra1.addItem("TNT", 3.89, 12);
		compra1.addItem("Papel Crepom", 18.79, 3);
		
		Compra compra2 = new Compra();
		compra2.addItem(new Produto("Notebook Dell", 4440.20),2);
		compra2.addItem("Mouse-Pad", 50.63, 1);
		compra2.addItem("Mouse Dell", 226.98, 1);
		
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		

		System.out.println(compra1.itens.size());
		System.out.println("Valor da 1ª compra: R$" + compra1.getValorTotal());
		System.out.println("Valor da 2ª compra: R$" + compra2.getValorTotal());

		System.out.println("Valor total da compra: R$" + cliente.getValorTotal());
	}
}
