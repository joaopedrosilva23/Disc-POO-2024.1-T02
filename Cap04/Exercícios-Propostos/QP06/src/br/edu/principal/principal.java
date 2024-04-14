package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double num1, num2;
		int opt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextDouble();
		System.out.println("Digite a opção que você deseja: \n [1] - primeiro número elevado ao segundo número \n [2] - raiz quadrada de cada um dos números \n [3] - raiz cúbica de cada um dos números \n");
		opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println(Math.pow(num1,  num2));
			break;
		case 2:
			System.out.println("Raiz quadrada de " + num1 + " é igual a " + Math.pow(num1, 0.5));
			System.out.println("Raiz quadrada de " + num2 + " é igual a " + Math.pow(num2, 0.5));
			break;
		case 3:
			System.out.println("Raiz cubica de "+ num1 + " é igual a " + Math.pow(num1, (1F / 3F)));
			System.out.println("Raiz cubica de "+ num2 + " é igual a " + Math.pow(num2, (1F / 3F)));
			break;
		default:
			System.out.println("Opção inválida! Fim do programa.");
		}

	}

}
