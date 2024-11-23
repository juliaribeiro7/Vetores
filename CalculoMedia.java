/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculomedia;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        double[] notas = new double[5];
        
        
        System.out.println("Digite as 5 notas dos alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }
        double media = soma / 5;

        
        int acimaMedia = 0, abaixoMedia = 0, naMedia = 0;
        
        for (int i = 0; i < 5; i++) {
            if (notas[i] > media) {
                acimaMedia++;
            } else if (notas[i] < media) {
                abaixoMedia++;
            } else {
                naMedia++;
            }
        }

        
        System.out.println("\nMedia das notas: " + media);
        System.out.println("Numero de alunos acima da media: " + acimaMedia);
        System.out.println("Numero de alunos abaixo da media: " + abaixoMedia);
        System.out.println("Numero de alunos na media: " + naMedia);
        
        
        scanner.close();
    }
}
