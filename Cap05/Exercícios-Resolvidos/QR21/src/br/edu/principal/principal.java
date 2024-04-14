package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num, soma = 0, qtd = 0, maior = 0, menor = 0, qtd_par = 0, soma_par = 0, qtd_impar = 0;
        double media_par = 0, media = 0, perc = 0;

        System.out.print("Digite um número (30000 para sair): ");
        num = sc.nextInt();

        while (num != 30000) {
            if (qtd == 0) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
            soma += num;
            qtd++;

            if (num % 2 == 0) {
                soma_par += num;
                qtd_par++;
            } else {
                qtd_impar++;
            }

            System.out.print("Digite um número (30000 para sair): ");
            num = sc.nextInt();
        }

        if (qtd == 0) {
            System.out.println("Nenhum número digitado");
        } else {
            System.out.println("Soma: " + soma);
            System.out.println("Quantidade: " + qtd);
            media = (double) soma / qtd;
            System.out.println("Média: " + media);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);

            if (qtd_par == 0) {
                System.out.println("Nenhum número par");
            } else {
                media_par = (double) soma_par / qtd_par;
                System.out.println("Média dos números pares: " + media_par);
            }

            perc = ((double) qtd_impar / qtd) * 100;
            System.out.println("Percentual de números ímpares: " + perc + "%");
        }

        

	}

}