
public class ex2 {
    
    public static void main(String[] args) {
        int[] temperaturas = { 12, 5, -2, 10, 8, 22, 3, 18, 8, -1 };
                
        int  soma = 0;
        int  maior = temperaturas[0];
        int menor = temperaturas[0];
        
        for (int i = 0; i<temperaturas.length ; i++){
            soma += temperaturas[i];
            if (temperaturas[i] < menor){
                menor = temperaturas[i]; 
            }
            if (temperaturas[i] > maior){
                maior = temperaturas [i];
            }
        }
        
        double media = (double) soma / temperaturas.length;
        System.out.println("a media e: " + media);
        System.out.println("o menor nmr e: " + menor);
        System.out.println("o maior nmr e: " + maior);       
                
                
               
    }
}
