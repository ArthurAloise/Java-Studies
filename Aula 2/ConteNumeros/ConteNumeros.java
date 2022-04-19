import java.util.Scanner; 
    public class ConteNumeros {
        public static void main(String[] args) throws Exception {
            Scanner leitor = new Scanner(System.in);

            System.out.print(" Informe o numero desejado: ");
            Integer numero = leitor.nextInt();

            String texto = numero.toString();
            int digitos = texto.length();

            
            System.out.println(" Possui " + digitos + " Digitos/caracteres " );

            leitor.close();
    }
    
}