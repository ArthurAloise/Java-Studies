public class DezenharMenu {
    // A anatomia de um sub programa
    // Procedimento(apenas executa uma ação)
    public static void main(String[] args) {
        DesenhaMenu(30, "DESAFIO DE PROGRAMAÇÃO");
        DizAlo();
    }

    // Programa do titulo
    public static void DesenhaMenu(int tamanho, String titulo) {
        if (titulo.length() % 2 == 1) {
            titulo += " ";
        }
        System.out.print("+");
        escreverCaractere("-", tamanho - 2);
        System.out.println("+");

        System.out.print("|");
        var lado = (tamanho - 2 - titulo.length()) / 2;
        escreverCaractere(" ", lado);
        System.out.print(titulo);
        escreverCaractere(" ", lado);
        System.out.println("|");

        System.out.print("+");
        escreverCaractere("-", tamanho - 2);
        System.out.println("+");

    }

    public static void escreverCaractere(String caracter, int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.print(caracter);
        }
    }
    
    public static void DizAlo() {
        System.out.println("\"Fala comigo!\"");
        System.out.println("Qual a boa de hoje?!");
    }
}


