package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 double valorInicial, juros, valorParcela, total, valorJuros;
		 double numParcelas, i;
		 System.out.println("Digite o valor inicial da dívida: ");
		 valorInicial = input.nextDouble();
		 juros = 0;
		 numParcelas = 1;
		 total = valorInicial;
		 valorParcela = valorInicial;
		 System.out.println(total);
		 System.out.println(juros);
		 System.out.println(numParcelas);
		 System.out.println(valorParcela);
		 juros += 10;
		 numParcelas += 2;
		 for (i = 1; i <= 4; i++) {
		 valorJuros = valorInicial * juros / 100;
		 total = valorInicial + valorJuros;
		 valorParcela = total / numParcelas;
		 System.out.println(total);
		 System.out.println(valorJuros);
		 System.out.println(numParcelas);
		 System.out.println(valorParcela);
		 juros += 5;
		 numParcelas += 3;

		 }
	}
}
