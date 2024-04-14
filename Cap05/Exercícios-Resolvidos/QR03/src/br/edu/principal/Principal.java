package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double n, num, i, j, fat;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro postivo: ");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++) {
			System.out.println("Digite o número " + i + "º: ");
			num = sc.nextInt();
			
			fat = 1;
			for(j = 1; j <= num; j++) {
				fat *= j;
			}
			System.out.println("Fat é: " + fat);
		}
	}

}
