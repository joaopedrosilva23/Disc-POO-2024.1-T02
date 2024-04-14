package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 double a, b, c, delta, x1, x2;
		 System.out.println("Digite o valor do coeficiente A: ");
		 a =input.nextDouble();
		 System.out.println("Digite o valor do coeficiente B: ");
		b =input.nextDouble();
		 System.out.println("Digite o valor do coeficiente C: ");
		 c = input.nextDouble();
		 if(a == 0) {
		 System.out.println("Esse coeficiente não forma uma equação de segundo grau");
		 }else {
		 delta = (b * b)- (4 * a * c);
		 if(delta < 0) {
		 System.out.println("Não existe raiz real");
		 }if(delta == 0) {
		 System.out.println("Existe uma raiz real");
		 x1 = (-b) / (2*a);
		 System.out.println("O valor da raiz é:" + x1);
		 }if(delta > 0) {
		 x1 = (- b + Math.sqrt(delta)) / (2 * a);
		 x2 = (- b- Math.sqrt(delta)) / (2 * a);
		 System.out.println("A primeira raiz é: " + x1);
		 System.out.println("A segunda raiz é: " + x2);
		 
		 		
		 }	
		 }
		input.close();
	}
}