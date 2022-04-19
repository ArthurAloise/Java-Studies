import java.util.Scanner; 
    public class CaixaEletric {
        public static void main(String[] args) throws Exception {
            Scanner leitor = new Scanner(System.in);

            System.out.print(" Informe o numero desejado: ");
            double valor = leitor.nextDouble();
//entrada
            int nota100 = (int) valor / 100;
            int resto = (int) valor % 100;

            int nota50 = (int) resto / 50;
            resto = (int) valor % 50;

            int nota10 = (int) resto / 10;
            resto = (int) valor % 10;

            int nota5 = (int) resto / 5;
            resto = (int) valor % 5;

            int nota1 = resto;


//saida
            System.out.println("Quantidade de notas de 100: " + nota100);
            System.out.println("Quantidade de notas de 50: " + nota50);
            System.out.println("Quantidade de notas de 10: " + nota10);
            System.out.println("Quantidade de notas de 5: " + nota5);
            System.out.println("Quantidade de notas de 1: " + nota1);
            
            leitor.close();
    }
    
}