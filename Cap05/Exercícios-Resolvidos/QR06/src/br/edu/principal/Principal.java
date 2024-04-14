package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cont, codigo, nht;
		double valor, sal_min = 450, sal_inicial, aux, sal_final;
	    String turno, categoria;
	     
	    for (cont = 1; cont <= 10; cont++) {
	    	System.out.println("Informe o código, número de horas trabalhadas, turno e categoria:");
            codigo = scanner.nextInt();
            nht = scanner.nextInt();
            turno = scanner.next().toUpperCase();
            while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
                System.out.println("Turno inválido, informe novamente (M, V ou N):");
                turno = scanner.next().toUpperCase();
            }
            categoria = scanner.next().toUpperCase();
            while (!categoria.equals("G") && !categoria.equals("O")) {
                System.out.println("Categoria inválida, informe novamente (G ou O):");
                categoria = scanner.next().toUpperCase();
            }
            if (categoria.equals("G")) {
                if (turno.equals("N")) {
                    valor = sal_min * 18 / 100;
                } else {
                    valor = sal_min * 15 / 100;
                }
            } else {
                if (turno.equals("N")) {
                    valor = sal_min * 13 / 100;
                } else {
                    valor = sal_min * 10 / 100;
                }
            }
            sal_inicial = nht * valor;

            if (sal_inicial <= 300) {
                aux = sal_inicial * 20 / 100;
            } else if (sal_inicial < 600) {
                aux = sal_inicial * 15 / 100;
            } else {
                aux = sal_inicial * 5 / 100;
            }

            sal_final = sal_inicial + aux;
            System.out.println("Código: " + codigo);
            System.out.println("Número de horas trabalhadas: " + nht);
            System.out.println("Valor da hora trabalhada: " + valor);
            System.out.println("Salário inicial: " + sal_inicial);
            System.out.println("Valor do acréscimo: " + aux);
            System.out.println("Salário final: " + sal_final);
	    }
	     
	}

}
