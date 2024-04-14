package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double salario, aumento, novo_sal;
		int cargo;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o cargo do funcionário");
		System.out.println("1-Escrituário");
		System.out.println("2-Secretário");
		System.out.println("3-Caixa");
		System.out.println("4-Gerente");
		System.out.println("5-Diretor");
		cargo = sc.nextInt();
		System.out.println("Digite o valor do salário: ");
		salario=sc.nextDouble();
		
		switch(cargo) {
		default:
			System.out.println("Esse cargo não existe");
		case 1:
			System.out.println("O cargo é Escrituário");
			aumento = salario*50/100;
			System.out.println("O valor do aumento é de: "+aumento+" reais");
			novo_sal =salario + aumento;
			System.out.println("O novo salário é de: "+novo_sal+" reais");
			break;
		case 2:
			System.out.println("O cargo é Secretário");
			aumento= salario*35/100;
			System.out.println("O valor do aumento é de: "+aumento+" reais");
			novo_sal=salario+aumento;
			System.out.println("O novo salário é de :"+novo_sal+" reais");
			break;
		case 3:
			System.out.println("O cargo é Caixa");
			aumento= salario*20/100;
			System.out.println("O valor do aumento é de: "+aumento+" reais");
			novo_sal=salario+aumento;
			System.out.println("O novo salário é de :"+novo_sal+" reais");
			break;
		case 4:
			System.out.println("O cargo é Gerente");
			aumento= salario*10/100;
			System.out.println("O valor do aumento é de: "+aumento+" reais");
			novo_sal=salario+aumento;
			System.out.println("O novo salário é de :"+novo_sal+" reais");
			break;
		case 5:
			System.out.println("O cargo é Diretor");
			aumento= salario*0;
			System.out.println("O valor do aumento é de: "+aumento+" reais");
			novo_sal=salario+aumento;
			System.out.println("O novo salário é de :"+novo_sal+" reais");
			break;
			
		}
		
	}

}
