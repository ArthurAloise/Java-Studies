import java.util.Scanner; 
public class VelocidadeMedia {
    public static void main(String[] args) throws Exception {
 
       //1. Leia uma distância percorrida em Km, e o tempo em minutos, e calcule a velocidade média em Km/h e m/s.
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual a distância em quilometros? "); 
        double distanciaEmQuilometros = leitor.nextDouble();

        System.out.print("Qual é o tempo em minutos? "); 
        double tempoEmMinutos = leitor.nextDouble();

        
        double distanciaEmMetros = (distanciaEmQuilometros*1000);

        double tempoEmSegundos = (tempoEmMinutos*60);

        double tempoEmHoras = (tempoEmMinutos/60);

        System.out.println(  "A velocidade média em (Km/h) é de: " + distanciaEmQuilometros / tempoEmHoras );
        System.out.println();
        System.out.println(  "A velocidade média em (m/s) é de: " + distanciaEmMetros / tempoEmSegundos );

        leitor.close();



        

         


        

        

        

        







}
    }