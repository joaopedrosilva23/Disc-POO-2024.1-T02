package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double angulo = 0, voltas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do ângulo:");
		angulo = sc.nextDouble();
		if (angulo > 360 || angulo < -360) {
			voltas = (int)(angulo / 360);
			angulo = (angulo % 360); 
			System.out.println("Foram dadas " + voltas + " voltas!");
			System.out.println("O ângulo reduzido é igual a " + angulo);
		 }else {
			voltas = 0;
		}
		if (angulo == 0 || angulo == 90 || angulo == 180 || angulo == 270 || angulo == 360 || angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360 ) { 
			System.out.println("Está em cima de algum dos eixos");
		}else {
			System.out.println("Não está em cima de nenhum dos eixos");
		}
		if (angulo >= 0 && angulo < 90 || angulo <= -270 && angulo > -360) {
		System.out.println("Está no 1° Quadrante!");
	    }else if (angulo >= 90 && angulo < 180 || angulo <= -180 && angulo > -270) {
		System.out.println("Está no 2° Quadrante!");
	    }else if (angulo >= 180 && angulo < 270 || angulo <= -90 && angulo > -180 ) {
		System.out.println("Está no 3° Quadrante!");
	    }else if (angulo >= 270 && angulo < 360 || angulo <= 0 && angulo > -90) {		
		System.out.println("Está no 4° Quadrante!");
	    }	
	if (angulo < 0) {
		System.out.println("Foram dadas " + voltas + " voltas, no sentido horário!" );
	}else {
		System.out.println("Foram dadas " + voltas + " voltas, no sentido anti-horário!" );
	}
	
	

}
 }