
import java.util.Scanner;

/**
 *
 * @author 8260516
 */
public class EX7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pontos = 0;
        
        
        System.out.print("Telefonou para a vítima?: ");
        String telefonema = scanner.next();
        
        if (telefonema.equals("s")){
            pontos ++;}
        
        System.out.print("Esteve no local do crime?: ");
        String local = scanner.next();
        
        if (local.equals("s")){
            pontos ++;}
        
        System.out.print("Mora perto da vítima?: ");
        String moradia = scanner.next();
        
        if (moradia.equals("s")){
            pontos ++;}
        
        System.out.print("Devia para a vítima?: ");
        String dever = scanner.next();  
        
        if (dever.equals("s")){
            pontos ++;}
        
        System.out.print("Já trabalhou com a vítima?: ");
        String trabalho = scanner.next();  
        
        if (trabalho.equals("s")){
            pontos ++;}
        
        if (pontos == 5){
            System.out.println("ASSASSINO MAU");     
        } else if (pontos == 4 || pontos == 3){
            System.out.println("cumplice ");
        } else if (pontos == 2 ){
            System.out.println("suspeito ");
        } else {
            System.out.print("inocente");
        }
        scanner.close();    
        
    }
}
