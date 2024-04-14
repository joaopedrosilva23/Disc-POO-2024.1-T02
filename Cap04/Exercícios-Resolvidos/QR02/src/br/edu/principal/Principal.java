package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double n1;
		System.out.printf("Digite sua primeira nota: %n");
		n1 = sc.nextDouble();
	
		double n2;
		System.out.printf("Digite sua segunda nota: %n");
		n2 = sc.nextDouble();
		
		double n3;
		System.out.printf("Digite sua terceira nota: %n");
		n3 = sc.nextDouble();
		
		double mP = ( n1 + n2 + n3 ) / 3;
		
		if (mP >= 6 && mP <= 10) {
		    System.out.printf("A sua média foi de: %.2f. Aprovado.%n", mP);
		} else if (mP >= 3 && mP < 6) {
		    System.out.printf("A sua média foi de: %.2f. Exame final.%n", mP);
		} else if (mP >= 0 && mP < 3) {
		    System.out.printf("A sua média foi de: %.2f. Reprovado.%n", mP);
		} else {
		    System.out.printf("Suas notas estão erradas.%n");
		}


	}

}




