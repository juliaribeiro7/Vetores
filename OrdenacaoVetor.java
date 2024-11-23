/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenacaovetor;

/**
 *
 * @author Admin
 */
import java.util.Random;

public class OrdenacaoVetor {
    public static void main(String[] args) {
        
        int[] numeros = new int[15];
        Random random = new Random();

        
        for (int i = 0; i < 15; i++) {
            numeros[i] = random.nextInt(100); 
        }

        
        System.out.println("Vetor original:");
        exibirVetor(numeros);

        
        bubbleSort(numeros);

        
        System.out.println("\nVetor ordenado (ordem crescente):");
        exibirVetor(numeros);
    }

     
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca de elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    
    public static void exibirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
