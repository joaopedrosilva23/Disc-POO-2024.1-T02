package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double cod_prod, peso_kg, peso_g, pre_total, imposto = 0, valor_total, pre_g = 0;
		int cod_pais = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do produto comprado: ");
		cod_prod = sc.nextDouble();
		System.out.println("Digite o preço do produto em quilos: ");
		peso_kg = sc.nextDouble();
		System.out.println("Digite o código do país de origem:(De 1 a 3) ");
		peso_g = peso_kg * 1000;
		System.out.println("O preço do produto em gramas é de: "+ peso_g);
		if (cod_prod >= 1 && cod_prod <= 4) {
			pre_g = 10;
		}else if (cod_prod >= 5 && cod_prod <= 7) {
			pre_g = 25;
		}else if (cod_prod >= 8 && cod_prod <= 10) {
			pre_g = 35;
		}
		pre_total = pre_g * peso_g; 
		System.out.println("O preço total do produto comprado é de: " + pre_total + "R$");
		switch (cod_pais) {
		case 1:
			imposto = 0;
			break;
		case 2:
			imposto = pre_total * 0.15;
			break;
		case 3:
			imposto = pre_total * 0.25;
			break;
		default:
			System.out.println("Código inválido!");
			
		}
		System.out.println("O imposto é de: " + imposto + "R$");
		valor_total = pre_total + imposto;
		System.out.println("O valor total a ser pago é de; " + valor_total + "R$");
		

	}

}
