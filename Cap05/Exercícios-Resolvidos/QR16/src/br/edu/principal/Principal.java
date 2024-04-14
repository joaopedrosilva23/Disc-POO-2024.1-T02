package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 double base, altura, area;
		 do {
		System.out.println("Digite a base do triângulo (um valor maior que zero):");
		 base = input.nextDouble();
		 } while (base <= 0);
		 do {
		 System.out.println("Digite a altura do triângulo (um valor maior que zero):");
		 altura = input.nextDouble();
		 } while (altura <= 0);
		 area = base * altura / 2;
		 System.out.println("A área do triângulo é: " + area);
		 input.close();
	}

}
