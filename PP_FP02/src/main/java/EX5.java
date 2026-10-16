/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner; // Importar a classe Scanner
/**
 *
 * @author 8260516
 */
public class EX5 {
    public static void main(String[] args) {
        // Criar uma instância da classe Scanner (permite a entrada do teclado).
        Scanner scanner = new Scanner(System.in);
        // Os métodos mais comuns da classe Scanner para ler dados do teclado são:
        // "nextInt()" para ler um inteiro, "nextDouble()" para ler um número decimal e
        // "nextLine()" para ler uma linha de texto.
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.println("O seu nome e " + nome + " e tem " + idade + " anos.");
        // Após terminar de usar o Scanner, é uma boa prática fechá-lo para libertar
        // recursos do sistema.
        System.out.print("escreva um nmr: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0)
            System.out.println("o numero é par");
        else 
            System.out.println("o nmr e impar");
            
                
        scanner.close();
    }
    
}
