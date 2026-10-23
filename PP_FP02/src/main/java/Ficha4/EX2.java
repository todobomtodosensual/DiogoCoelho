/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficha4;
/**
 *
 * @author 8260516
 */

public class EX2 {
        public static void main(String[] args) {
            
    int a = 1;
    
    for (int i=2; i < Math.sqrt(a);i = i+1){
        if (a % i == 0){
            System.out.print("numero nao e primo");
        } else{
            System.out.print("numero e primo");
            }       
        }            
    }
}
