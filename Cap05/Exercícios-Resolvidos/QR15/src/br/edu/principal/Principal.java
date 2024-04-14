package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 double preco, custoEst, imp, precoFinal, adicional = 0, totImp = 0;
		 double maiorP = 0, menorP = 0;
		 int qtdB = 0, qtdN = 0, qtdC = 0;
		 for (int i = 1; i <= 12; i++) {
		 preco = input.nextDouble();
		String refri = input.next();
		 String categ = input.next();
		 if (preco <= 20) {
		 if (categ.equals("A")) {
		 custoEst = 2;
		 } else if (categ.equals("L")) {
		 custoEst = 3;
		 } else {
		 custoEst = 4;
		 }
		 } else if (preco > 20 && preco <= 50) {
		 if (refri.equals("S")) {
		 custoEst = 6;
		 } else {
		 custoEst = 0;
		 }
		 } else {
		 if (refri.equals("S")) {
		 if (categ.equals("A")) {
		 custoEst = 5;
		 } else if (categ.equals("L")) {
		 custoEst = 2;
		 } else {
		 custoEst = 4;
		 }
		 } else {
		 if (categ.equals("A") || categ.equals("V")) {
		 custoEst = 0;
		 } else {
		 custoEst = 1;
		 }
		 }
		 }
		 if (!categ.equals("A") && !refri.equals("S")) {
		 imp = preco * 4 / 100;
		 } else {
		 imp = preco * 2 / 100;
		 }
		 precoFinal = preco + custoEst + imp;
		 System.out.println(custoEst);
		 System.out.println(imp);
		System.out.println(precoFinal);
		 if (precoFinal <= 20) {
		 qtdB++;
		 System.out.println("Classificação Barato");
		 } else if (precoFinal > 20 && precoFinal <= 100) {
		 qtdN++;
		 System.out.println("Classificação Normal");
		 } else {
		 qtdC++;
		 System.out.println("Classificação Caro");
		 }
		 adicional += custoEst + imp;
		 totImp += imp;
		 if (i == 1) {
		 maiorP = menorP = precoFinal;
		 } else {
		 if (precoFinal > maiorP) {
		 maiorP = precoFinal;
		 }
		 if (precoFinal < menorP) {
		 menorP = precoFinal;
		 }
		 }
		 }
		 adicional /= 12;
		 System.out.println(adicional);
		 System.out.println(maiorP);
		 System.out.println(menorP);
		 System.out.println(totImp);
		 System.out.println(qtdB);
		 System.out.println(qtdN);
		 System.out.println(qtdC);
		 input.close();

	}

}
