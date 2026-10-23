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
public class EX7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int a = sc.nextInt();

        System.out.print("Segundo numero: ");
        int b = sc.nextInt();

        int resto = a;
        int resultado = 0;

        while (resto >= b) {
            resto = resto - b;
            resultado++;
        }

        System.out.println("Resultado: " + resultado);
        System.out.println("Resto: " + resto);
    }
}
