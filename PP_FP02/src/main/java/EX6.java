
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 8260516
 */
public class EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("nota1: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("nota2: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("nota3: ");
        double nota3 = scanner.nextDouble();
        
        double soma = nota1 + nota2 + nota3;
                
            double media = soma / 3 ;
            
        if (media >= 9.5){
      System.out.print("passou");
       
    } else if (media<9.5){
        System.out.print("reprovou");
    }
        else {
                System.out.print("bem burro");
                }
        
    }     
    }
    
