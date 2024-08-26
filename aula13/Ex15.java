package javaBasico.lista.aula13;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		double impostoRenda = 0.11;
		double inss = 0.08;
		double sindicato = 0.05;
		double pgInss, pgSindicato, pgImposto, desconto, salBruto, salLiquido;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe quanto você ganha por hora: ");
		double salHora = scan.nextDouble();
		System.out.println("Informe a quantidade de horas trabalhadas no mes: ");
		double horasTrabalhadas = scan.nextDouble();
		
		salBruto = salHora * horasTrabalhadas;
		
		System.out.println("O salario Bruto é: " + salBruto);
		
		
		pgInss = salBruto * inss;
		System.out.println("Pagou ao INSS: R$" +pgInss);
		pgSindicato = salBruto * sindicato;
		System.out.println("Pagou ao Sindicato: R$" +pgSindicato);
		pgImposto = salBruto * impostoRenda;
		System.out.println("Desconto do Imposto de Renda: R$" +pgImposto);
		desconto = pgInss + pgSindicato + pgImposto;
		System.out.println("Descontos totais: R$" +desconto);
		salLiquido = salBruto - desconto;
		System.out.println("Salario Liquido: R$" +salLiquido);
		
		
	}

}


/* Faça um Programa que pergunte quanto você ganha por hora e o 
número de horas trabalhadas no mês. Calcule e mostre o total do seu 
salário no referido mês, sabendo-se que são descontados 11% para o 
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um 
programa que nos dê: 
. 
salário bruto. 
a. quanto pagou ao INSS. 
b. quanto pagou ao sindicato. 
c. o salário líquido. 
d. calcule os descontos e o salário líquido, conforme a tabela 
abaixo: 
+ Salário Bruto : R$ - IR (11%) : R$ - INSS 
(8%) : R$ - Sindicato ( 5%) : R$ = Salário 
Liquido : R$ 
Obs.: Salário Bruto - Descontos = Salário Líquido. */