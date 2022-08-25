public class VerificaNumPar {
    public static void main(String[] args) throws Exception {
        int[] vetor = { 3, 8, 1, 5, 20, 35, 18, 41, 22 };

        var ContadorPar = 0;
        var ContadorImpar = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                ContadorPar += 1;
            } 
            else {
                ContadorImpar += 1;
            }
        }

        System.out.print("O vetor possui " + ContadorPar + " pares, e " + ContadorImpar + " Impares.\n");

        System.out.println("Os vetores pares são: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(+vetor[i] + ", ");
            }
        }

        System.out.println("\nOs vetores impares são: ");
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] % 2 == 1) {
                System.out.print(+vetor[j] + ", ");
            }
        }
    }
}
