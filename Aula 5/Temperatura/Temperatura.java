
//2. Fazer um programa que converte temperaturas. Se for informado ºC, mostrar ºF e ºK. Se for informado ºK, mostrar ºC e ºF. Se for informado ºF, mostrar ºC e ºK.
import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        //Converter celcius para Kelvin e Fahrenheit.
        System.out.print("Digite uma temperatura em Celcius: ");
        double c = leitor.nextDouble();
        //Para Kelvin
        double conversionKelvin = c + 273.15;
        //Para Fahrenheit:
        double conversionFahrenheit = (c * 9/5) + 32;

        System.out.println("A temperatura em Kelvin é: " + conversionKelvin + ", e a temperatura em Fahrenheit é: " + conversionFahrenheit);
        
        //Converter Kelvin para Celcius e Fahrenheit.
        System.out.print("Digite uma temperatura em Kelvin: ");
        double k = leitor.nextDouble();
        //Para Celcius:
        double conversionCelcius = k - 273.15;
        //Para Fahrenheit:
        double conversionFahrenheit1 = (k - 273.15) * 9/5 + 32;

        System.out.println("A temperatura em Celcius é: " + conversionCelcius + ", e em Fahrenheit é: " + conversionFahrenheit1);

        //Converter Fahrenheit para Celcius e Kelvin.
        System.out.println("Digite uma temperatura em Fahrenheit: ");
        double f = leitor.nextDouble();
        //Para Celcius:
        double conversionCelcius1 = (f - 32) * 5/9;
        //Para Kelvin:
        double conversionKelvin1 = (f - 32) * 5/9 + 273.15;

        System.out.printf("A temperatura em Celcius é: " + conversionCelcius1 + ", e em Kelvin é: " + conversionKelvin1);




        leitor.close();
    }
}