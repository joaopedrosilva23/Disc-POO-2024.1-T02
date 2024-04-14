package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 double salCarlos, salJoao;
		 int meses = 0;
		 System.out.println("Digite o salário de Carlos:");
		 salCarlos = input.nextDouble();
		 salJoao = salCarlos / 3;
		 while (salJoao < salCarlos) {
		 salCarlos += (salCarlos * 2 / 100);
		 salJoao += (salJoao * 5 / 100);
		 meses++;
		 }
		 System.out.println("Meses necessários para o salário de João ultrapassar o de Carlos: " +
		 meses);
		 input.close();
	}

}
