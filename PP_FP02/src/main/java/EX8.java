/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 8260516
 */

public class EX8 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int aux;

        if (a < b) {
            aux = a;
            a = b;
            b = aux;
        }

        if (a < c) {
            aux = a;
            a = c;
            c = aux;
        }

        if (b < c) {
            aux = b;
            b = c;
            c = aux;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

