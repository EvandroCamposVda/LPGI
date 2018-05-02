/*9 – Faça um	programa em JAVA que pergunte quanto você ganha por hora e o número de horas	
 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que 
 * são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um 
 * programa que nos mostre:
a) salário bruto;
b) quanto pagou ao	 INSS;
c) quanto pagou ao	 sindicato;
d) o salário líquido.
*/

package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio09 {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		float h;
		float vh;
		float sal;
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		h = scan.nextFloat();
		
		System.out.println("Digite o valor de cada hora: ");
		vh = scan.nextFloat();
		
		sal = h*vh;
		
		System.out.println("Salario Bruto: " + sal);
		System.out.println("Valor pago INSS: " + (sal*0.08));
		System.out.println("Valor pago sindicato: " + (sal*0.05));
		System.out.println("Salário liquido: " + (sal - (sal*0.24)));
		
		scan.close();
	}
}
