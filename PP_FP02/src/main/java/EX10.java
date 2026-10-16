
import java.util.Scanner;

/**
 *
 * @author 8260516
 */
public class EX10 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        
        System.out.print("valor1: ");
        int a = scanner.nextInt();      
        
        System.out.print("valor2: ");
        int b = scanner.nextInt();  
       
        System.out.print("valor3: ");
        int c = scanner.nextInt(); 
        
        if (a > b && c>a){
            System.out.println("1 mensagem");
        } else if (a<b || b<c){
            System.out.println("2 mensagem");
        } else if (c == a){
            System.out.println("3 mensagem");            
        } else {
            System.out.println("4 mensagem");                        
        }
        System.out.print("5 mensagem");
        
        scanner.close();
        
    }
    
}
