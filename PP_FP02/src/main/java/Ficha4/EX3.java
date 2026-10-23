/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficha4;

/**
 *
 * @author 8260516
 */
public class EX3 {
    public static void main(String[] args) {
        int [][] a ={
            {1 , 2, 3}, 
            {3 , 1, 5},
            {4 , 3, 3},
            {0 , 1, 5}
        };
        
        int[] conta = new int [6];
        
        for(int i=0; i<a.length; i++){
            int menor = a[i][0];
            int maior = a[i][0];

            for (int j=0; j<a[i].length; j++){
                conta [a[i][j]]++;
                
                
                if(a [i][j] > maior ){
                    maior = a[i][j];
                }
                if(a [i][j] < menor ){
                    menor = a[i][j];
                }
            }
            System.out.println("linha " + i + " o maior é " + maior + ", menor " + menor);
        }
        int repetido = 0;
        for (int k=1; k<conta.length; k++){
            if(conta[k] > conta[repetido] ){
                repetido = k;
            }
            System.out.println("o coiso q mais repete é " + repetido 
                    + " (" +  conta[repetido] + "vezes");
        }
                
    }
}   
