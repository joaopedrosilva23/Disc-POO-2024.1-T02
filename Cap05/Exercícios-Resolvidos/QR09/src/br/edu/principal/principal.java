package br.edu.principal;


import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class principal {

		public static void main(String[] args) {
			double n1, n2, media, ta, te, tr,
			media_classe, total_classe;
			total_classe=0;
			te=0;
			tr=0;
			ta=0;
			
			
			Scanner sc = new Scanner(System.in);
			for(int i=1;i<=6;i++) {
				System.out.println("Digite sua primeira nota");
				n1=sc.nextDouble();
				
				System.out.println("Digite sua segunda nota");
				n2=sc.nextDouble();
				
				media=(n1+n2)/2;
				System.out.println("Sua média foi: "+media);
				if (media<=3) {
					
					tr=tr+1;
					System.out.println("Reprovado");
					
				}
				else if(media>3 && media<7) {
					
					te=te+1;
					System.out.println("Exame");
					
				}
				else {
					
					ta=ta+1;
					System.out.println("Aprovado");
					
				}
				
				total_classe=total_classe + media;
				
			}
			System.out.println(tr+" aluno(s) foram reprovados");
			System.out.println(te+" aluno(s) terão que fazer o exame");
			System.out.println(ta+" aluno(s)foram aprovados");
				media_classe =total_classe/6;
				System.out.println("A média da classe é: "+media_classe);


	}
}

