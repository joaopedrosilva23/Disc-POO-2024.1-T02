package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
        
        int maior = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE; 
        
        System.out.println("Digite um conjunto de valores inteiros e positivos (digite 0 para encerrar):");
        
        while (true) {
            System.out.print("Digite um valor: ");
            int valor = scanner.nextInt();
            
            if (valor == 0) {
                break; 
            } else if (valor < 0) {
                System.out.println("Valor negativo. Por favor, digite apenas valores inteiros e positivos.");
            } else {
                
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        }
        
        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum valor válido foi digitado.");
        } else {
            System.out.println("Maior valor do conjunto: " + maior);
            System.out.println("Menor valor do conjunto: " + menor);
        }
        
        scanner.close();

	}

}
