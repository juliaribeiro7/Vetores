/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscavetor;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class BuscaVetor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        String[] nomes = new String[10];
        
        
        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        
        System.out.print("\nDigite o nome que deseja buscar: ");
        String nomeBuscado = scanner.nextLine();
        
        
        int posicao = -1;
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBuscado)) {
                posicao = i;
                break;
            }
        }

        
        if (posicao != -1) {
            System.out.println("O nome '" + nomeBuscado + "' foi encontrado na posiçao " + posicao + ".");
        } else {
            System.out.println("O nome '" + nomeBuscado + "' nao foi encontrado.");
        }

        
        scanner.close();
    }
}
