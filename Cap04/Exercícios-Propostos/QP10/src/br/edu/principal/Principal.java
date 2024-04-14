package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("Digite o custo de fábrica do carro:");
		 double custoFabrica = input.nextDouble();
		 double precoConsumidor;
		 if (custoFabrica <= 12000) {
		 precoConsumidor = custoFabrica * 1.05;
		 } else if (custoFabrica <= 25000) {
		 precoConsumidor = custoFabrica * 1.25;
		 } else {
		 precoConsumidor = custoFabrica * 1.35;
		 }
		System.out.println("O preço ao consumidor é: R$" + precoConsumidor);
		 input.close();

	}

}
