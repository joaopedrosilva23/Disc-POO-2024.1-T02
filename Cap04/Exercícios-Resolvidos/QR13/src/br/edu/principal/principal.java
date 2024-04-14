package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int op;
		double sal, imp, aum, novo_sal;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("|       MENU DE OPÇÕES        |");
		System.out.println("|     1-IMPOSTO               |");
		System.out.println("|     2-NOVO SALÁRIO          |");
		System.out.println("|     3-CLASSIFICAÇÃO         |\n");
		System.out.println("DIGITE A OPÇÃO DESEJADA");
		op= sc.nextInt();
		switch(op) {
		default: System.out.println("OPÇÃO INVÁLIDA!!!");
		break;
		case 1:
			System.out.println("Digite o valor do seu salário");
			sal= sc.nextDouble();
			if(sal<500) {
				imp=sal*5/100;
				System.out.println("O valor do imposto é de: "+imp+" reais");
			}
			else if(sal >= 500 && sal <= 850) {
				imp= sal*10/100;
				System.out.println("O valor do imposto é de: "+imp+" reais");
			}
			else imp=sal*15/100; System.out.println("O valor do imposto é de: "+imp+" reais");
			break;
		case 2:
			System.out.println("Digite o valor do seu salário");
			sal= sc.nextDouble();
			if(sal>1500) {
				aum=25;
				novo_sal=aum+sal;
				System.out.println("Seu novo salário é de: "+novo_sal+" reais");
			}
			else if(sal >= 750 && sal <= 1500) {
				aum=50;
				novo_sal=aum+sal;
				System.out.println("Seu novo salário é de: "+novo_sal+" reais");
			}
			else {
				aum=100;
				novo_sal=aum+sal;
				System.out.println("Seu novo salário é de: "+novo_sal+" reais");;
			}
			break;
			
		case 3:
			System.out.println("Digite o valor do seu salário");
			sal= sc.nextDouble();
			if (sal <=750) {
				System.out.println("Você é mal remunerado");
			}
			else System.out.println("Você é bem remunerado");
			break;
		}
	}

}
