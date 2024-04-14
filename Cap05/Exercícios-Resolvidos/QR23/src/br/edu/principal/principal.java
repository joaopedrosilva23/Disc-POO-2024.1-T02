package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double sal, qtd, tipo, valor_kw, gasto, acresc, total, tot_geral = 0, qtd_cons = 0;

        tot_geral = 0;
        qtd_cons = 0;

        System.out.println("Digite o valor do salario minimo: ");
        sal = sc.nextDouble();
        System.out.println("Digite a quantidade de quilowatts gasta por consumidor:" );
        qtd = sc.nextDouble();
        valor_kw = sal / 8;

        while (qtd != 0) {
            gasto = qtd * valor_kw;
            System.out.println("Digite o tipo de consumidor (1 - residencial 2 - comercial 3 - industrial) ");
            tipo = sc.nextDouble();
            
            if (tipo == 1) {
                acresc = gasto * 5 / 100;
            } else if (tipo == 2) {
                acresc = gasto * 10 / 100;
            } else {
                acresc = gasto * 15 / 100;
            }
            
            total = gasto + acresc;
            tot_geral += total;
            
            if (total >= 500 && total <= 1000) {
                qtd_cons++;
            }
            
            System.out.println("O valor de cada quilowatt é de: " + valor_kw);
            System.out.println("O valor a ser pago por consumidor é de: " + total);
            
            
        }

        System.out.println("O faturamento geral da empresa foi de: "  + tot_geral);
        System.out.println("A quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00 " + qtd_cons);

	}

}