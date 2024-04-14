package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A;
		System.out.printf("Digite um valor para A: %n");
		A = sc.nextInt();
	
		int B;
		System.out.printf("Digite um valor para B: %n");
		B = sc.nextInt();
		
		int C;
		System.out.printf("Digite um valor para C: %n");
		C = sc.nextInt();
		
		int I;
		System.out.printf("Digite um valor para I (1, 2 ou 3): %n");
		I = sc.nextInt();

		if(I == 1) {
			if (A<B && A<C) {
				if(B>C) {
					System.out.println("A ordem crescente é: " + A + "-" + B + "-" + C);	
				} else {
					System.out.println("A ordem crescente é: " + A + "-" + C + "-" + B);
				}		
			} if(B>A && B<C) {
				if(A<C) {
					System.out.println("A ordem crescente é: " + B + "-" + A + "-" + C);	
				} else{
					System.out.println("A ordem crescente é: " + B + "-" + C + "-" + A);	
				}
			} if(C<A && C<B) {
				if(A<B) {
					System.out.println("A ordem crescente é: " + C + "-" + A + "-" + B);	
				} else {
					System.out.println("A ordem crescente é: " + C + "-" + B + "-" + A);	
				}
			} 
		} if(I == 2) {
			if (A>B && A>C) {
				if(B>C) {
					System.out.println("A ordem decrescente é: " + A + "-" + B + "-" + C);	
				} else {
					System.out.println("A ordem decrescente é: " + A + "-" + C + "-" + B);
				}		
			} if(B>A && B>C) {
				if(A>C) {
					System.out.println("A ordem decrescente é: " + B + "-" + A + "-" + C);	
				} else{
					System.out.println("A ordem decrescente é: " + B + "-" + C + "-" + A);	
				}
			} if(C>A && C>B) {
				if(A>B) {
					System.out.println("A ordem decrescente é: " + C + "-" + A + "-" + B);	
				} else {
					System.out.println("A ordem decrescente é: " + C + "-" + B + "-" + A);	
				}
			} 
		} if(A>B && A>C) {
			System.out.println("A ordem desejada é: "+B+"-" +A +"-" +C);
		}
		if(B>A && B>C) {
		System.out.println("A ordem desejada é: "+A+"-" +B +"-" +C);
		}
		if(C>A && C>B) {
		System.out.println("A ordem desejada é: "+A+"-" +C +"-" +B);
		}
		}
}

