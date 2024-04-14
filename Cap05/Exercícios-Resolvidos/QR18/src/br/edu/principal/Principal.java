	package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 double num, quad, cubo, raiz;
		 System.out.println("Digite um número:");
		 num =input.nextDouble();
		 while (num > 0) {
		 quad = num * num;
		 cubo = num * num * num;
		raiz = Math.sqrt(num);
		 System.out.println("Quadrado: " + quad + ", Cubo: " + cubo + ", Raiz quadrada: " + raiz);
		 System.out.println("Digite outro número (ou zero para sair):");
		 num =input.nextDouble();
		 }
		 input.close();
	}

}
