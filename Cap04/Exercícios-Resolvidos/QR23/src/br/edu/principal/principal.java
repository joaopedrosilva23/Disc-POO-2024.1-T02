package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double  sal_min, nht, coeficiente = 0, sal_bruto, imposto = 0, grat = 0, auxilio = 0, sal_liq = 0;
		String turno, categoria;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite aqui o valor do salário mínimo: ");
		sal_min = sc.nextDouble();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite aqui o seu turno de trabalho (M para matutino, V para vespertino e N para noturno.) ");
		turno = sc2.next().toUpperCase();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Digite sua categoria (O para operário, G para gerente)");
		categoria = sc3.next().toUpperCase();
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Digite o número de horas trabalhadas: ");
		nht = sc4.nextDouble();
		switch (turno) {
		case "M":
			coeficiente = sal_min * 0.10;
			break;
		case "V":
			coeficiente = sal_min * 0.15;
			break;
		case "N":
			coeficiente = sal_min * 0.12;
			if (nht > 80) {
				grat = 50;
				System.out.println("Você preencheu todos os requisitos, e recebeu uma gratificação de: " + grat + "R$");
			}else {
				grat = 30;
				System.out.println("Você não preencheu todos os requisitos, e recebeu uma gratificação de: " + grat + "R$");
			}
			break;
		default:
			System.out.println("Turno inválido, tente novamente!");
			
		}
		System.out.println("Seu coeficiente do salário é de: " + coeficiente);
		sal_bruto = nht * coeficiente;
		System.out.println("O seu salário bruto é de: " +  sal_bruto + "R$");
		switch (categoria) {
		case "O":
			if (sal_bruto >= 300) {
				imposto = sal_bruto * 0.05;
			}else {
				imposto = sal_bruto * 0.03;
			}
			break;
		case "G":
			if (sal_bruto >= 400) {
				imposto = sal_bruto * 0.06;
			}else {
				imposto = sal_bruto * 0.04;
			}
			break;
		default:
			System.out.println("Categoria inválida! Tente novamente.");
		}
		System.out.println("O valor do imposto é de: " + imposto);
		if (categoria == "O" || coeficiente <= 25) { 
			auxilio = sal_bruto * 0.333;
		}else {
			auxilio = sal_bruto * 0.5;
		}
		System.out.println("O auxílio será de: " + auxilio + "R$");
		sal_liq = sal_bruto - imposto + grat + auxilio;
		System.out.println("Seu salário líquido é de:" + sal_liq + "R$");
		if (sal_liq < 350) {
			System.out.println("Mal remunerado!");
		}if (sal_liq >= 350 && sal_liq <= 600) {
			System.out.println("Normal");
		}if (sal_liq > 600) {
			System.out.println("Bem remunerado!");
		}

	}

}