/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.*/
package javaBasico.lista.aula17;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		boolean notaValida = false;
		
		do {
		
			System.out.println("Informe uma nota de 0 a 10");
			nota = scan.nextInt();
			
			if(nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			}
			else {
				System.out.println("Valor inválido");
			}
		} while(!notaValida);
		
		
	}

}
