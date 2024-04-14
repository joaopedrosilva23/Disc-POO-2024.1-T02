package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 double vhe ,salMin, nht, ndep, nhet, imp = 0, sbruto, sliq, grat = 0, vh, smes,
		 vdep, salReceber;
		 System.out.println("Digite seu salário mínimo: ");
		 salMin = input.nextDouble();
		 System.out.println("Digite o número de horas trabalhadas: ");
		 nht = input.nextDouble();
		 System.out.println("Digite o número de dependentes: ");
		 ndep = input.nextDouble();
		 System.out.println("Digite a quantidade de horas extras: ");
		 nhet = input.nextDouble();
		 vh = 1/5 * salMin;
		 smes = vh * nht;
		 vdep = 32 * ndep;
		 vhe = nhet *(vh + (vh * 50/100));
		 sbruto = smes + vdep + vhe;
		if(sbruto < 200) {
		 imp = 0;
		 }if(sbruto >= 200 && sbruto <= 500) {
		 imp = sbruto * 10/100;
		 }if(sbruto > 500) {
		 imp = sbruto * 20/100;
		 }
		 sliq = sbruto- imp;
		 if(sliq <= 350) {
		 grat = 100;
		 }if(sliq > 350) {
		 grat = 50;
		 }salReceber = sliq + grat;
		 System.out.println("Seu novo salário é: " + salReceber);
		 input.close();
		 
	}

}
