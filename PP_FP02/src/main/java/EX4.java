/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 8260516
 */
public class EX4 {
    public static void main(String[] args) {           
    Scanner scanner = new Scanner(System.in);
    double pi = 3.1416;
        
    System.out.printf("qual o Raio: " ); 
    double raio = scanner.nextDouble(); 
        
        
    System.out.printf("qual o altura: " ); 
    double altura  = scanner.nextDouble();
    
    double V = (pi*(raio*raio)*altura);
        System.out.printf("o volume e: " + V );
        
        scanner.close();
}
        
}