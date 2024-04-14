package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalOtimo = 0;
        int totalBom = 0;
        int totalRegular = 0;
        int somaIdadesOtimo = 0;
        
        for (int i = 1; i <= 15; i++) {
            System.out.println("Espectador " + i + ":");
            System.out.print("Digite a idade do espectador: ");
            int idade = scanner.nextInt();
            
            System.out.print("Digite a opinião do espectador (ótimo = 3, bom = 2, regular = 1): ");
            int opiniao = scanner.nextInt();
            
            if (opiniao == 3) {
                totalOtimo++;
                somaIdadesOtimo += idade;
            } else if (opiniao == 2) {
                totalBom++;
            } else if (opiniao == 1) {
                totalRegular++;
            } else {
                System.out.println("Opinião inválida. Por favor, digite novamente.");
                i--; 
            }
        }
        
        double mediaIdadeOtimo = (double) somaIdadesOtimo / totalOtimo;
        double percentualBom = (double) totalBom / 15 * 100;
        
        System.out.println("\nResultados da pesquisa:");
        System.out.println("Média de idade dos espectadores que responderam ótimo: " + mediaIdadeOtimo);
        System.out.println("Quantidade de pessoas que responderam regular: " + totalRegular);
        System.out.println("Percentual de pessoas que responderam bom: " + percentualBom + "%");
        
        scanner.close();
	}
		

}
