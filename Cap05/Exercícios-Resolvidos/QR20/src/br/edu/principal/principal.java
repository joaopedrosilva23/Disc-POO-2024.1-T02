package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double cod, num_h, sal_b, sal_l = 0, media_m = 0, media_f = 0, cont_m = 0, cont_f = 0;
        String sexo;
        
        System.out.print("Informe o código (digite 99999 se quiser sair): ");
        cod = sc.nextDouble();
        
        while (cod != 99999) {
            System.out.print("Informe o sexo (M - masculino F - feminino): ");
            sexo = sc.next();
            
            System.out.print("Informe o número de horas trabalhadas: ");
            num_h = sc.nextInt();
            
            sal_b = num_h * 30;
            
            if (sexo == "M") {
                sal_l = sal_b - (sal_b * 10 / 100);
                media_m += sal_l;
                cont_m++;
            } else if (sexo == "F") {
                sal_l = sal_b - (sal_b * 5 / 100);
                media_f += sal_l;
                cont_f++;
            }
            
            System.out.println("Código: " + cod);
            System.out.println("Salário bruto: " + sal_b);
            System.out.println("Salário líquido: " + sal_l);
            
            System.out.print("Informe o código (99999 para sair): ");
            cod = sc.nextInt();
        }
        
        if (cont_m == 0) {
            System.out.println("Nenhum professor do sexo masculino");
        } else {
            media_m /= cont_m;
            System.out.println("Média salarial dos professores do sexo masculino: " + media_m);
        }
        
        if (cont_f == 0) {
            System.out.println("Nenhum professor do sexo feminino");
        } else {
            media_f /= cont_f;
            System.out.println("Média salarial dos professores do sexo feminino: " + media_f);
        }
        
        

	}

}

