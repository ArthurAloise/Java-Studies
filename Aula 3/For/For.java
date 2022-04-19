import java.util.Scanner;
public class For {
    public static void main(String[] args)  throws Exception {
        Scanner leitor = new Scanner(System.in);

        // Todos números impar menor que 100
        for (int i = 1; i < 100; i = i + 2)
        {
         System.out.println(i + " é impar.");
        }

        // Todos pares menor que 100
        for (int i = 0; i < 100; i= i + 2)
        {
            System.out.println( i+" é par.");
        }

        //Qual a soma de 1+2+3+4+5+ .... +100
        int soma = 0;
        for (int i = 1; i <=100; i++)
        {
        soma = soma + i;
        }
        System.out.println("A soma é: " + soma);

        //Contar de ordem decrescente de 10 para 1
        for (int i = 10; i >= 1; i--)
        {
        System.out.println(i);
        } 

        // Dado um número menor que 10, calcular seu fatorial
        System.out.println("Digite um número. ");
        int number = leitor.nextInt();   
        
        int fatorial = 1;

        for (int i = 1; i <= number; i++)
        {
        fatorial = fatorial * i;
        }
        System.out.println(" O fatorial do " + number + " é " + fatorial);

        //Mostrar todos os elementos da sequência Fibonacci até o número 100.000
        // Fibonacci: 1 1 2 3 5 8 13... < 100000
        int a = 1;
        int b = 0;
        int aux;
        
        for (int i = 0; i < 25; i++ )
        
        {
        System.out.println(a);
        aux = a;
        a = a + b;
        b= aux;
        }

        //João está a 40km na frente de pedro. -> J
        // O carro do joão anda a 60km/h -> i
        // O carro de Pedro anda a 70km/h
        //Em quantas horas o carro de Pedro alcançará joão?
        //Quantos Km Pedro percorreu?
        //Quantos Km João percorreu?


        //For Avançado
        int horas = 1; 
        for (int i = 0, j = 40; i < j; i+=70, j +=60)
        {
            if (i>0)
            {
            System.out.println("Depois de " + horas + " horas, Pedro vai está no Km " + i + " e João no Km " + j ); 
            horas+=1;   
            }

        }
        System.out.println("Levará " + horas + " hora para passar de João");

leitor.close();
    }
}