/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contagemparimpar;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class ContagemParImpar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        int[] numeros = new int[15];
        
        
        System.out.println("Digite 15 numeros inteiros:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        int contadorPares = 0;
        int contadorImpares = 0;
        
        
        for (int i = 0; i < 15; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        
        System.out.println("\nQuantidade de numeros pares: " + contadorPares);
        System.out.println("Quantidade de numeros i­mpares: " + contadorImpares);
        
        
        scanner.close();
    }
}

