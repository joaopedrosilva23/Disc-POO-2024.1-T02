package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double e = 1, i, j, fat;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro postivo: ");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++) {
			fat = 1;
			for(j = 1; j <= i; j++) {
				fat *= j;
			}
		e += 1.0/fat; 
		}
	System.out.println(e);
	sc.close();
	}

}
