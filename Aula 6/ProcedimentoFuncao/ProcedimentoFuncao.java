import java.util.Random;

public class ProcedimentoFuncao {
    public static void main(String[] args) throws Exception {
        System.out.println("Subprogramas - Funções");
        var a = 10;
        var b = 5;
        Soma1(a, b);

        var soma = Soma2(a, b);
        System.out.println("A soma de " + a + " e " + b + " é " + soma);

        int[] vetor = { 3, 8, 1, 5 };
        var s = SomaVetor(vetor);
        System.out.println(s);

        var menor = MenorVetor(vetor);
        System.out.println(menor);

        var maior = MaiorVetor(vetor);
        System.out.println(maior);

        CriarAleatorio(10);
    }

    // Procedimento: É um programa que não retorna valor(Void).
    public static void Soma1(int a, int b) {
        System.out.println("A soma de " + a + " e " + b + " é " + (a + b));
    }

    // Funções: É um subprograma que retorna valor(!= Void).
    public static int Soma2(int a, int b) {
        return a + b;
    }

    // Somando o Vetor.
    public static int SomaVetor(int[] vetor) {
        var soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        return soma;
    }

    // Menor Vetor
    public static int MenorVetor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (menor > vetor[i]) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    // Maior vetor
    public static int MaiorVetor(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int[] CriarAleatorio(int tamanho) {
        var vetor = new int[tamanho];
        Random r = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt(0, 100);
        }
        return vetor;
    }
}
