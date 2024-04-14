package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 double salI, salN, boni, aux;
		 System.out.println("Digite seu salário ");
		 salI = input.nextDouble();
		 if (salI <= 500) {boni = salI*5/100;}
		 else if (salI > 1200) { boni = 0;}
		 else { boni = salI * 12/100;}
		 if (salI <= 600) {aux = 150;}
		 else {aux = 100;}
		 salN = salI + boni + aux;
		 System.out.println("Seu novo salário é " + salN);
		 input.close();
	}

}
