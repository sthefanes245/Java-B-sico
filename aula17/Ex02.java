/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.*/
package javaBasico.lista.aula17;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean igual = false;
		
		do {
		System.out.println("Informe o nome de usuário: ");
		String nome = scan.next();
		System.out.println("Informe a senha: ");
		String senha = scan.next();
		
		if(nome.equalsIgnoreCase(senha)) {		
			System.out.println("Erro! \nO nome de usuário e senha não podem ser iguais \nTente novamente");			
		}
		else {
			igual = true;
			System.out.println("Logado com sucesso!");
		}
		}while(!igual);
		
	}
}
