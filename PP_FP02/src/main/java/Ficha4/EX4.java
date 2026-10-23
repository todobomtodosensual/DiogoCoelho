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
public class EX4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("mete graus aqui: ");
        double graus = sc.nextDouble();
        
        double radianos = graus * Math.PI / 180;
        
        System.out.println("Radianos: " + radianos);
                
    }   
}
