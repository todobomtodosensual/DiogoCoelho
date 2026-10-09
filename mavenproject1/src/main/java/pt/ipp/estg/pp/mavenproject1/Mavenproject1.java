/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.pp.mavenproject1;
import java.util.Scanner;

public class Mavenproject1 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //serve pra implementar oq importou pra usar aqui
        
        System.out.print("=== CALCULADORA DE DESCONTO ===");        
        System.out.printf("qual o valor original: "); //isto serve perguntar ao utilizador o printf serve pra guardar variaveis
        double preco_original = scanner.nextDouble(); // scanner.nextdouble e pra ler o numero decimal do input
        
        System.out.printf("qual a percentagem presente: ");
        double percentagem = scanner.nextDouble();
        double valor_do_desconto = preco_original*(percentagem/100);
        double preco_final = preco_original - valor_do_desconto;
        
        System.out.println(); //quebra de linha
        
        System.out.print("----------");
       // System.out.printf("preco final: " + preco_final );    este e mais simples
        System.out.printf("preco final:  %.2f", preco_final );  // este deixate por casas decimais com o %.2f , .
        
               
    }
}
