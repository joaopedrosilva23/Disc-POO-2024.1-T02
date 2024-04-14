package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double n1P = 2;
		double n2P = 3;
		double n3P = 5;
		
		
		Scanner sc = new Scanner(System.in);
		double nTrabLab;
		System.out.printf("Digite sua nota do trabalho do laboratório: %n");
		nTrabLab = sc.nextDouble();
		while(nTrabLab < 0 && nTrabLab > 10) {
			System.out.println("Sua nota foi digitada errada.");
			System.out.printf("Digite sua nota do trabalho do laboratório: %n");
			nTrabLab = sc.nextDouble();
		}
		
	
		double avSemestral;
		System.out.printf("Digite sua nota na avaliação semestral: %n");
		avSemestral = sc.nextDouble();
		
		double exFinal;
		System.out.printf("Digite sua nota no Exame Final: %n");
		exFinal = sc.nextDouble();
		
		double mP = ((nTrabLab * 2) + (avSemestral * 3) + (exFinal * 5)) / 10;
		
		if (mP >= 8 && mP <= 10) {
			System.out.println("A sua média foi de: " + mP + ", obteve conceito A.");
		} else if (mP >= 7 && mP < 8) {
			System.out.println("A sua média foi de "+ mP + ", obteve conceito B.");
		} else if (mP >= 6 && mP < 7) {
			System.out.println("A sua média foi de "+ mP +", obteve conceito C.");
		} else if (mP >= 5 && mP < 6) {
			System.out.println("A sua média foi de "+ mP +", obteve conceito D.");
		} else if (mP >= 0 && mP < 5) {
			System.out.println("A sua média foi de "+ mP +", obteve conceito E.");
		} else {
			System.out.printf("Suas notas estão erradas. %n");
		}

	}

}




