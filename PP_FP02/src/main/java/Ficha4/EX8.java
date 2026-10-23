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
public class EX8 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor em euros: ");
        double euros = sc.nextDouble();

        int centimos = (int) Math.round(euros * 100);

        int moedas = centimos / 200;
        centimos = centimos % 200;
        if (moedas > 0) {
            System.out.println(moedas + " moedas de 2 euros");
        }

        moedas = centimos / 100;
        centimos = centimos % 100;
        if (moedas > 0) {
            System.out.println(moedas + " moedas de 1 euro");
        }

        moedas = centimos / 50;
        centimos = centimos % 50;
        if (moedas > 0) {
            System.out.println(moedas + " moedas de 50 centimos");
        }

        moedas = centimos / 20;
        centimos = centimos % 20;
        if (moedas > 0) {
            System.out.println(moedas + " moedas de 20 centimos");
        }

        moedas = centimos / 10;
        centimos = centimos % 10;
        if (moedas > 0) {
            System.out.println(moedas + " moedas de 10 centimos");
        }

        moedas = centimos / 5;
        centimos = centimos % 5;
        if (moedas > 0) {
            System.out.println(moedas + " moedas de 5 centimos");
        }

        moedas = centimos / 2;
        centimos = centimos % 2;
        if (moedas > 0) {
            System.out.println(moedas + " moedas de 2 centimos");
        }

        if (centimos > 0) {
            System.out.println(centimos + " moeda de 1 centimo");
        }
    }
}
    

