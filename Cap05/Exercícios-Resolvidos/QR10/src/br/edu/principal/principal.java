package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		 double peso, alt, qtde, media_idade,
		media_altura, porc, tot80;
		 double idade;
		qtde=0;
		tot80 = 0;
		media_altura=0;
		
		Scanner sc = new Scanner(System.in);
		for (int i=1; i<=5;i++) {
			media_idade =0;
			for(int j=1; j<=11;j++) {
				System.out.println("Digite sua idade");
				idade= sc.nextDouble();
				
				System.out.println("Digite seu peso em kg");
				peso= sc.nextDouble();
				
				System.out.println("Digite sua altura em cm");
				alt= sc.nextDouble();
				if (idade<18) {
					
					qtde=qtde+1;
					media_idade=media_idade+idade;
					media_altura=media_altura+alt;
				}
				if(peso>80) {
					tot80=tot80+1;
				}
			}
			media_idade=media_idade/11;
			System.out.println("A idade média dos jogadores é de: "+media_idade+" anos123");
		}
	    System.out.println(qtde+" jogadores são menores de 18 anos");
		media_altura =media_altura/55;
		System.out.println("A altura média dos jogadores é de: "+media_altura+" cm");
		porc =tot80 * 100/55;
		System.out.println(porc+"% dos jogadores pesa mais de 80kg");
	}
}
