public class VerificaNumPar{
    public static void main(String[] args) throws Exception {
        int[] vetor= {3, 8, 1, 5, 20, 35, 18, 41, 22};
        var ContadorPar=0;
        var ContadorImpar=0;

        for(int i = 0; i< vetor.length; i++){
            if(vetor[i]% 2 == 0){
                ContadorPar+=1;
            } else{
                ContadorImpar+=1;
            }

        }
        System.out.println("O vetor possui "+ ContadorPar + " pares, e " + ContadorImpar + " Impares." );
        
    }

    
}