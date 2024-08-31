/*Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';*/
package javaBasico.lista.aula17;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false; 
			
		do {	
			System.out.println("Informe seu nome(maior que 3 caracteres): ");
			String nome = scan.nextLine();
			if(nome.length() > 3) {
				infoValida = true;
			}
			else {
				System.out.println("Nome precisa de no mínimo 3 caracteres");
			}
			
		}while(!infoValida);
		
		infoValida = false;
		
		do {	
			System.out.println("Informe sua idade(entre 0 e 150): ");
			int idade = scan.nextInt();
			if(idade >= 0 && idade <= 150) {
				infoValida = true;
			}
			else {
				System.out.println("Idade precisa ser entre 0 e 150");
			}
			
		}while(!infoValida);
		
		infoValida = false;
		
		do {	
			System.out.println("Informe seu salário(maior que 0): ");
			double salario = scan.nextDouble();
			if(salario > 0) {
				infoValida = true;
			}
			else {
				System.out.println("Salário deve ser maior que 0");
			}
			
		}while(!infoValida);
		
		infoValida = false;
		
		do {	
			System.out.println("Informe seu sexo(F-feminino ou M-masculino): ");
			String sexo = scan.next();
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			}
			else {
				System.out.println("Sexo inválido");
			}
			
		}while(!infoValida);
		
		infoValida = false;
		
		do {	
			System.out.println("Informe seu estado civil(S-solteiro, C-casado, V-viuvo e d-divorciado): ");
			String estadoCivil = scan.next();
			if(estadoCivil.equalsIgnoreCase("s") || 
					estadoCivil.equalsIgnoreCase("c") ||
					estadoCivil.equalsIgnoreCase("v") ||
					estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			}
			else {
				System.out.println("Estado civil inválido");
			}
			
		}while(!infoValida);
		
	}

}
