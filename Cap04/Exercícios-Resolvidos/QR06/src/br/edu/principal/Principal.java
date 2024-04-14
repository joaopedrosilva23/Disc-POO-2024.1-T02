package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.printf("Digite um número: %n");
		n1 = sc.nextInt();

		int r = n1%2;
		
		if (r == 0) {
			System.out.println("O número " + n1 + " é par");
		} else {
			System.out.println("O número " + n1 +" é ímpar");
		}
		
		
	}

}
