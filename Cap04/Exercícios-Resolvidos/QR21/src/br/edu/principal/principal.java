package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double cod_est, cod_carga, peso_toneladas, peso_quilos, pre_carga, imposto, valor_total;
		pre_carga = 0;
		imposto = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite aqui o código do estado de origem da carga: ");
		cod_est = sc.nextDouble();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite aqui o peso da carga em toneladas: ");
		peso_toneladas = sc2.nextDouble();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Digite aqui o código da carga: ");
		cod_carga = sc3.nextDouble();
		peso_quilos = peso_toneladas * 1000;
		System.out.println("O preço em quilos da carga é de " + peso_quilos + "Kg" );
		if (cod_carga >= 10 && cod_carga <= 20) {
			pre_carga = peso_quilos * 100;
		}else if (cod_carga >= 21 && cod_carga <= 30) {
			pre_carga = peso_quilos * 250;
	    }else if (cod_carga >= 31 && cod_carga <= 40) {
	    	pre_carga = 340 * peso_quilos;
	    } else {
	    	System.out.println("O CÓDIGO DA CARGA QUE FOI DIGITADO É INVÁLIDO! Digite um código entre 10 e 40.");
	    }
	    System.out.println("O preço da carga do caminhão é de: " + pre_carga + "R$");
	    if (cod_est == 1) {
	    	imposto = pre_carga * 35/100;
	    } if (cod_est == 2) {
	    	imposto = pre_carga * 25/100;
	    }else if (cod_est == 3) {
	    	imposto = pre_carga * 15/100;
	    }else if (cod_est == 5/100) { 
	    	imposto = pre_carga * 5/100;
	    }else if (cod_est == 5) { 
	    	imposto = 0;
	    } else { 
	    	System.out.println("O CÓDIGO DO ESTADO DE ORIGEM QUE FOI DIGITADO É INVÁLIDO! Digite um código entre 1 e 5.");
	    }
	    System.out.println("O valor do imposto é de: " + imposto + "R$");
	    valor_total = pre_carga + imposto;
	    System.out.println("O valor total que deve ser pago é de:" + valor_total + "R$");

	}

}