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
public class EX6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);   
            
        System.out.printf("qual o valor em centimos: ");
        int valor = sc.nextInt();
        
        int euros = valor / 100;
        int centimos = valor % 100;
        
        System.out.println(euros + "euros e " + centimos +  " centimos ");
        
        }
    }
