/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somaemedia;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        int[] numeros = new int[10];
        
        
        int soma = 0;
        
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "� n�mero: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i]; 
        }
        
        
        double media = (double) soma / 10;
        
        
        System.out.println("Soma dos n�meros: " + soma);
        System.out.println("M�dia dos n�meros: " + String.format("%.2f", media));
        
        
        scanner.close();
    }
}

