//Faça um programa que leia 5 números e informe o maior número.
package javaBasico.lista.aula17;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maior = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe um numero:");
			int num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior numero é : " + maior);

	}

}
