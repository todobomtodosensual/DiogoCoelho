/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.pp.mavenproject1;
import java.util.Scanner;

public class projeto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //serve pra implementar oq importou pra usar aqui
        System.out.printf("valor total da compra: ");
        
        double valor_total = scanner.nextDouble();
        double desconto;
        
        if (valor_total < 50){
            desconto = 0;
        } else if (valor_total <= 100){
                    desconto = 10;
        }else {
                desconto = 20;
        }
                
        double Valordesconto = valor_total * (desconto/100);
        double preco_final = valor_total - Valordesconto;
    
        
        System.out.print("----------");

        System.out.printf("valor e: " + preco_final );
        System.out.printf("valor e: " + desconto );       
        System.out.printf("valor e: " + valor_total );               
        System.out.printf("valor e: " + Valordesconto );      
        scanner.close();
    }
}