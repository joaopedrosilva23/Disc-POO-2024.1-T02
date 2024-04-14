package br.edu.principal;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		double i, ano_atual, salario, novo_salario, percentual;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano atual: ");
		ano_atual = sc.nextDouble();
		
		salario = 1000;
		percentual = 1 * 0.05;
		novo_salario = salario + (salario * percentual);
		
		for(i = 2007; i <= ano_atual; i++) {
			percentual = 2 * percentual;
			novo_salario = novo_salario + (percentual * novo_salario);
		}
		System.out.printf("Seu novo salário sera de: %.2f", novo_salario);
		sc.close();
	}

}
