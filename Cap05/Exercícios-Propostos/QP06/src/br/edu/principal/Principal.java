package br.edu.principal;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
        
        double totalComprasAVista = 0;
        double totalComprasAPrazo = 0;
        double valorTotalCompras = 0;
        double primeiraPrestacao = 0;
        
        for (int i = 1; i <= 15; i++) {
            System.out.println("Transação " + i + ":");
            System.out.print("Digite o código da transação (V para à vista, P para a prazo): ");
            char codigo = scanner.next().charAt(0);
            
            while (codigo != 'V' && codigo != 'P') {
                System.out.print("Código inválido. Digite novamente (V para à vista, P para a prazo): ");
                codigo = scanner.next().charAt(0);
            }
            
            System.out.print("Digite o valor da transação: ");
            double valor = scanner.nextDouble();
            
            if (codigo == 'V') {
                totalComprasAVista += valor;
            } else {
                totalComprasAPrazo += valor;
            }
            
            valorTotalCompras += valor;
        }
        
        primeiraPrestacao = totalComprasAPrazo / 3;
        
        System.out.println("\nResumo das transações:");
        System.out.println("Valor total das compras à vista: " + totalComprasAVista);
        System.out.println("Valor total das compras a prazo: " + totalComprasAPrazo);
        System.out.println("Valor total das compras efetuadas: " + valorTotalCompras);
        System.out.println("Valor da primeira prestação das compras a prazo: " + primeiraPrestacao);
        
        scanner.close();
    }
}
		


