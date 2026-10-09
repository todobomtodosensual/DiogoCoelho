public class EX3 {
    public static void main (String[] args) {
        
        int[] lista = { 12, 5, -21, 10, -345, 22, 50, -125, 80, -1 };
        
        long positivos = 1 ; 
        int negativos = 0;
        int maior = lista[0];
        
            for(int x=0 ; x<lista.length; x++ ){
                if (lista[x] > 0){
                   positivos *= lista[x];
                }
                if (lista[x] < 0){
                   negativos++;
                }   
               if (lista[x] > maior){
                   maior = lista[x];
               }
            }
        System.out.println("multiplicacao dos positivos e: " + positivos);
        System.out.println("os negativoss ao: " + negativos);
        System.out.println("o maior nmr e: " + maior);       
                
    }
}
