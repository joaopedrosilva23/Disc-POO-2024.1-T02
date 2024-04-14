package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double altura, peso;
		 System.out.println("Digite o valor do peso: ");
		 peso = input.nextDouble();
		 System.out.println("Digite o valor da altura: ");
		 altura = input.nextDouble();
		 if (altura < 1.20) {
		 if (peso <= 60){
		 System.out.println("Sua classificação é A");
		 } else if (peso > 60 && peso <= 90) {
		 System.out.println("Sua classificação é D");
		 } else if (peso > 90) {
		 System.out.println("Sua classificação é G");
		 }
		 }
		 if (altura >= 1.20 && altura <= 1.70) {
		 if (peso <= 60){
		 System.out.println("Sua classificação é B");
		 } else if (peso > 60 && peso <= 90) {
		 System.out.println("Sua classificação é E");
		 } else if (peso > 90) {
		 System.out.println("Sua classificação é H");
		 }
		 }
		 if (altura > 1.70) {
		 if (peso <= 60){
		 System.out.println("Sua classificação é C");
		 } else if (peso > 60 && peso <= 90) {
		 System.out.println("Sua classificação é F");
		 } else if (peso > 90) {
		 System.out.println("Sua classificação é I");

	
		 }


		 }
		 input.close();
	}
}