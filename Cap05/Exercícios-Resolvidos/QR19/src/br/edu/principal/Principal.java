package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int m, n, soma, i;
		 System.out.println("Digite o primeiro número (m):");
		 m=input.nextInt();
		 System.out.println("Digite o segundo número (n):");
		 n =input.nextInt();
		 while (m < n) {
		 soma = 0;
		 for (i = m; i <= n; i++) {
		 soma += i;
		 }
		 System.out.println("A soma dos números de " + m + " até " + n + " é: " + soma);
		 System.out.println("Digite o próximo conjunto de números (m e n):");
		 m=input.nextInt();
		 n =input.nextInt();
		 }
		 input.close();
	}
}
