package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double preco, imp, transp, seguro, finalPreco;
        double totalImp = 0;
        int origem;
        String meioT, carga;
        
        System.out.print("Informe o preço (ou digite 0 para sair): ");
        preco = sc.nextDouble();
        
        while (preco > 0) {
            System.out.print("Informe a origem (1, 2 ou 3): ");
            origem = sc.nextInt();
            
            System.out.print("Informe o meio de transporte (A ou B): ");
            meioT = sc.next();
            
            System.out.print("Informe se a carga é especial (S ou N): ");
            carga = sc.next();
            
            if (preco <= 100) {
                imp = preco * 5 / 100;
            } else {
                imp = preco * 10 / 100;
            }
            
            if (carga == "S") {
                if (origem == 1) {
                    transp = 50;
                } else if (origem == 2) {
                    transp = 21;
                } else {
                    transp = 24;
                }
            } else {
                if (origem == 1) {
                    transp = 12;
                } else if (origem == 2) {
                    transp = 21;
                } else {
                    transp = 60;
                }
            }
            
            if (origem == 2 || meioT == "A") {
                seguro = preco / 2;
            } else {
                seguro = 0;
            }
            
            finalPreco = preco + imp + transp + seguro;
            totalImp += imp;
            
            System.out.println("Imposto: " + imp);
            System.out.println("Custo de transporte: " + transp);
            System.out.println("Custo de seguro: " + seguro);
            System.out.println("Preço final: " + finalPreco);
            
            System.out.print("Informe o preço (ou digite 0 para sair): ");
            preco = sc.nextDouble();
        }
        
        System.out.println("Total de impostos: " + totalImp);

	}

}
