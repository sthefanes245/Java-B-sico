//Faça um programa que leia 5 números e informe o maior número.
package javaBasico.lista.aula17;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double soma = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe um numero:");
			double num = scan.nextDouble();
			
			soma += num;
		}
		
		double media = soma / 5;
		
		System.out.println("A soma dos numeros é: " + soma);
		System.out.println("A média dos numeros é: " + media);
	}
}