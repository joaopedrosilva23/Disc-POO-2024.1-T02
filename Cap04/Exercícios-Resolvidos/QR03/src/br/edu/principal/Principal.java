package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double n1;
		System.out.printf("Informe o primeiro número: %n");
		n1 = sc.nextDouble();
	
		double n2;
		System.out.printf("Informe o segundo número: %n");
		n2 = sc.nextDouble();
		
		if(n1 > n2) {
		System.out.println(n1);
		} else {
			System.out.println(n2);
		}
	}

}

