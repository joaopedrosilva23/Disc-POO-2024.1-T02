package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double sal_base, tempo = 0, imposto = 0, grat, sal_liq;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite aqui seu salário base: ");
		sal_base = sc.nextDouble();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite aqui seu tempo de serviço em anos: ");
		tempo = sc2.nextDouble();
		if (sal_base < 200) { 
			imposto = 0;
		} else if (sal_base <= 450) {
			imposto = 0.03 * sal_base;
		} else if (sal_base < 700) {
			 imposto = sal_base * 0.08;
		} else {
			 imposto = sal_base * 0.12;
		 }
		System.out.println("O valor do imposto é de: " + imposto + "R$");
		if (sal_base > 500) {
			if (tempo <= 3) {
				grat = 20;
			}else {
				grat = 30;
			}
		}else {
			if (tempo <= 3) {
				grat = 23;
			}else if (tempo < 6) {
				grat = 35;
			}else {
				grat = 33;
			}
		}
		System.out.println(grat);
		sal_liq = sal_base - imposto + grat;
		System.out.println("O seu salário líquido é de: " + sal_liq + "R$");
		if (sal_liq <= 350) {
			System.out.println("Classificação A");
		} else if (sal_liq < 600) {
			System.out.println("Classificação B");
		} else {
			System.out.println("Classificação C");
		}

	}

}

