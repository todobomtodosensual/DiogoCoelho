/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 8260516
 */
public class EX9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("valor1: ");
        double valor1 = scanner.nextDouble();      
        
        System.out.print("valor2: ");
        double valor2 = scanner.nextDouble();     
        
        if (valor1>valor2){
            System.out.print(valor1);
        } else {
            System.out.print(valor2);
        }        
        scanner.close();
    }     
}
