package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double pre, valor_adic = 0, imposto, pre_custo, novo_pre, desconto; 
		String tipo, refrig;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o preço do produto: ");
		pre = sc.nextDouble();
		System.out.println("Digite o tipo do alimento (A - alimentação, L - limpeza, V - vestuário )");
		tipo = sc.next().toUpperCase();
		System.out.println("Digite S se o produto precisa de refrigeração, e N se não precisa: ");
		refrig = sc.next().toUpperCase();
		switch (refrig) {
		case "N":
			if (tipo == "A") {
				if(pre < 15) {
					valor_adic = 2;
				}else {
					valor_adic = 5;
				}
			}
		    if (tipo == "L") {
		    	if(pre < 10) {
		    		valor_adic = 1.5;
		    	}else {
		    		valor_adic = 2.5;
		    	}
		    }
		    if (tipo == "V") {
		    	if (pre < 30 ) {
		    		valor_adic = 3;
		    	}else {
		    		valor_adic = 2.5; 
		    	}
		    }
		    break;
		 default:
			 System.out.println("ERRO!");
		}
		switch (tipo) {
		case "A":
			valor_adic = 8;
		case "L":
			valor_adic = 0;
		case "V":
			valor_adic = 0;
		default:
			System.out.println("ERRO!");
			}
		System.out.println("O valor adicional é de: " + valor_adic + "R$");
		if (pre < 25) {
			imposto = pre * 0.05;
		}else {
			imposto = pre * 0.08;
		}
		System.out.println("O imposto é de" + imposto + "R$");
		pre_custo = pre + imposto;
		if (tipo != "A" && refrig != "S") {
			desconto = pre_custo * 0.03;
		}else {
			desconto = 0;
		}
		System.out.println("O desconto é de " + desconto + "R$");
		novo_pre = pre_custo + valor_adic - desconto;
		System.out.println("O novo preço será de:"  + novo_pre + "R$");
		if (novo_pre <= 50) {
			System.out.println("Barato");
		}else if (novo_pre < 100) {
			System.out.println("Normal");
		}else {
			System.out.println("CARO!!");
		}
	}

}