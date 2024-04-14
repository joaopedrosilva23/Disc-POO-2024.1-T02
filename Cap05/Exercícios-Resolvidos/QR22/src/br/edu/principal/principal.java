package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int idade, tot_f = 0, tot_m = 0, soma1 = 0, cont_m1 = 0, cont_m2 = 0, tot = 0, cont_f1 = 0, menor_idade = 0;
        double media_idade = 0, perc = 0;
        String sexo, exp;

        tot = 0;
        tot_f = 0;
        tot_m = 0;
        soma1 = 0;
        cont_m1 = 0;
        cont_m2 = 0;
        cont_f1 = 0;

        idade = sc.nextInt();
        while (idade != 0) {
            sexo = sc.next();
            exp = sc.next();
            
            if (sexo == "F" && exp == "S") {
                if (tot == 0) {
                    menor_idade = idade;
                    tot = 1;
                } else if (idade < menor_idade) {
                    menor_idade = idade;
                }
            }
            
            if (sexo == "M") {
                tot_m++;
                if (idade > 45) {
                    cont_m1++;
                }
                if (exp == "S") {
                    soma1 += idade;
                    cont_m2++;
                }
            }
            
            if (sexo == "F") {
                tot_f++;
                if (idade < 21 && exp == "S") {
                    cont_f1++;
                }
            }
            
            idade = sc.nextInt();
        }
        
        System.out.println(tot_f);
        System.out.println(tot_m);
        
        if (cont_m2 == 0) {
            System.out.println("Nenhum homem com experiência");
        } else {
            media_idade = soma1 / cont_m2;
            System.out.println(media_idade);
        }
        
        if (tot_m == 0) {
            System.out.println("Nenhum homem");
        } else {
            perc = cont_m1 * 100 / tot_m;
            System.out.println(perc);
        }
        
        System.out.println(cont_f1);
        System.out.println(menor_idade);

	}

}

