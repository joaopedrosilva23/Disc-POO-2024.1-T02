package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        int[] numeros = new int[10];
	        int somaPares = 0;
	        int somaPrimos = 0;

	        System.out.println("Digite 10 números:");

	       
	        for (int i = 0; i < 10; i++) {
	            numeros[i] = scanner.nextInt();
	        }

	        
	        for (int num : numeros) {
	            if (num % 2 == 0) { 
	                somaPares += num;
	            }
	            if (ehPrimo(num)) {
	                somaPrimos += num;
	            }
	        }

	        System.out.println("A soma dos números pares é: " + somaPares);
	        System.out.println("A soma dos números primos é: " + somaPrimos);

	        scanner.close();
	    }

	   
	    public static boolean ehPrimo(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}


