package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				 double x,y,z;
				 System.out.println("Digite o valor X: ");
				 x = input.nextDouble();
				 System.out.println("Digite o valor Y: ");
				 y = input.nextDouble();
				 System.out.println("Digite o valor Z: ");
				 z = input.nextDouble();
				 if(x < y + z && y < x + z &&z<x+y){
				 if(x == y && y == z) {
				 System.out.println("Essas medidas formam um triângulo quilátero");
				 }else if(x == y && x == z | y == z) {
				 System.out.println("Essas medidas formam um triângulo Isósceles");
				 }else if(x != y && x != z && y != z) {
				 System.out.println("Essas medidas formam um triângulo escaleno");
				 }else {
				 System.out.println("Essas medidas não formam um triângulo");
				 
				 }
				 }
				 input.close();
	}
}