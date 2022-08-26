public class VerificadorVetor{
    public static void main(String[] args) throws Exception {
        int[] vetor= {2, 3, 1, 5, 10, 8, 8, 10, 5, 7};

        for(int i = 0; i < vetor.length-1; i++){
            
            if(vetor[i] < vetor[i+1]){
                vetor[i] = 0;
            }
            System.out.print(vetor[i] + ",");    
        }
        System.out.print(vetor[vetor.length - 1]);    
        
    }
}