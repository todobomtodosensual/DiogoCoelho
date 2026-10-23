/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ficha4;

/**
 *
 * @author 8260516
 */
public class Ex1 {

    public static void main(String[] args) {
        int [][] a ={
            {1 , 2,},
            {3,4}
        };
        int n = a.length; //guarda vriavel
        
        int [][] b = new int [n][n]; // cria uma nova matriz com n de linhas e coluna
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
               b[i][j] = a[j][i];
                               
            }
        }
    System.out.println("Matriz transposta:");

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.print(b[i][j] + " ");
    }
    System.out.println();
}
    }
 }
