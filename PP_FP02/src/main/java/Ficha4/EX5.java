/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficha4;
import java.util.Scanner;
/**
 *
 * @author 8260516
 */
public class EX5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);   
            
        System.out.printf("qual o valor: ");
        double valor = sc.nextDouble();
        
        System.out.printf("qual a taxa de conversao: ");
        double taxa = sc.nextDouble();
        
        double resultado = valor * taxa;
        
        System.out.println(resultado);
    }      
}
