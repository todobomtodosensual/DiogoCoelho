/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 8260516
 */
public class EX12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("qual sua idade: ");
        int idade = scanner.nextInt();  
        
        if (idade >= 5 && idade<= 7){
            System.out.println("Infantil_A");
    } else if (idade >= 8 && idade<= 10){
            System.out.println("Infantil_B");
    } else if (idade >= 11 && idade<= 13){
            System.out.println("Juvenil_A");
    } else if (idade >= 14 && idade<= 17){
            System.out.println("Juvenil_B");
    } else if (idade > 18){
            System.out.println("Senior");
        
    }
    /*Infantil_A = 5 7 anos;
    Infantil_B = 8-10 anos;
    Juvenil_A = 11-13 anos;
    Juvenil_B = 14-17 anos;
    Sénior = maiores de 18 anos;*/
    /*int c = scanner.nextInt(); 
        
        if (a > b && c>a){
            System.out.println("1 mensagem");
    }*/
    
    
            scanner.close();
}
}