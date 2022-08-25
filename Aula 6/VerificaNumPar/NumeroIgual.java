
public class NumeroIgual{
    public static void main(String[] args) throws Exception {
        int[] vetor= {1, 2, 3, 2, 3, 4, 5, 6, 7, 5, 6, 7};

        for(int i = 0; i < vetor.length -1; i++){
            for(int j= i+1; j<vetor.length; j++){
                if(vetor[i] == vetor[j]){
                vetor[j] = 0;
                }
            
            }
        //System.out.print(vetor[i] + ","); -> (FAZENDO O TESTE PARA VER SE ESTAVA INDO TUDO CERTO).    
        }
        //System.out.print(vetor[vetor.length - 1]); -> (FAZENDO O TESTE PARA VER SE ESTAVA INDO TUDO CERTO).
        
        int vetor2[]= new int[vetor.length];

        System.out.print("[");
        for(int j = 0; j <vetor.length;j++){
            if(vetor[j] !=0){
                vetor2[j] = vetor[j];
                
                System.out.print( vetor2[j] + ", ");

            }
        }
        System.out.print("]");
    }
}