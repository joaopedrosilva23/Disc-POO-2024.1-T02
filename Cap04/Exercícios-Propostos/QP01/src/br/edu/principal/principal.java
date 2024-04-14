package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double n1, n2, n3, n4, media;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua primeira nota: ");
		n1 = sc.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		n2 = sc.nextDouble();
		System.out.println("Digite sua terceira nota: ");
		n3 = sc.nextDouble();
		System.out.println("Digite sua quarta nota: ");
		n4 = sc.nextDouble();
		media = (n1 + n2 + n3 + n4) / 4;
		if (media >= 7) {
			System.out.println("Você foi aprovado com média " + media + " Parabéns!");
		}else if ( media > 0 && media < 7) {
			System.out.println("Você foi reprovado!");
		}else {
			System.out.println("Média inválida! Digite suas notas novamente. ");
		}
		
		
		

	}

}
