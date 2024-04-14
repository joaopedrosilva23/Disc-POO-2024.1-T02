package br.edu.principal;

import java.util.Arrays;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        int[][] grupos = new int[5][4];

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os valores do grupo " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                grupos[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("Grupos na ordem lida:");
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(grupos[i]));
        }

        
        for (int i = 0; i < 5; i++) {
            Arrays.sort(grupos[i]);
            System.out.println("Grupo " + (i + 1) + " em ordem crescente: " + Arrays.toString(grupos[i]));

            
            int[] grupoDecrescente = new int[4];
            for (int j = 0; j < 4; j++) {
                grupoDecrescente[j] = grupos[i][3 - j];
            }
            System.out.println("Grupo " + (i + 1) + " em ordem decrescente: " + Arrays.toString(grupoDecrescente));
        }

        scanner.close();
	}

}
