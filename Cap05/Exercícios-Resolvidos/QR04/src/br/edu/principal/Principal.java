package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double cont, cod, num_vei, num_acid, maior = 0, cid_maior = 0, menor = 0, cid_menor = 0, media_vei, soma_vei, media_acid, soma_acid, cont_acid;
		
		soma_vei = 0;
		soma_acid = 0;
		cont_acid = 0;
		
		for(cont = 1; cont <= 5; cont++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe o código, o número de veículos e o número de acidentes:");
            cod = sc.nextInt();
            num_vei = sc.nextInt();
            num_acid = sc.nextInt();

			if (cont == 1) {
				maior = num_acid;
				cid_maior = cod;
				menor = num_acid;
				cid_menor = cod;
			} else {
				if(num_acid > maior) {
					maior = num_acid;
                    cid_maior = cod;
				}
				if(num_acid < menor) {
					menor = num_acid;
					cid_menor = cod;
				}
			}
			soma_vei = soma_vei + num_vei;
			if(num_vei < 2000) {
				soma_acid = soma_acid + num_acid;
				cont_acid = cont_acid + 1;
			}
			sc.close();
		}
		media_vei = soma_vei / 5;
        media_acid = soma_acid / cont_acid;

        System.out.println("Cidade com o maior número de acidentes: " + cid_maior);
        System.out.println("Maior número de acidentes: " + maior);
        System.out.println("Cidade com o menor número de acidentes: " + cid_menor);
        System.out.println("Menor número de acidentes: " + menor);
        System.out.println("Média de veículos nas cidades: " + media_vei);
        System.out.println("Média de acidentes: " + media_acid);
	}

}
