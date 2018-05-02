/*9 � Fa�a um	programa em JAVA que pergunte quanto voc� ganha por hora e o n�mero de horas	
 * trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que 
 * s�o descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um 
 * programa que nos mostre:
a) sal�rio bruto;
b) quanto pagou ao	 INSS;
c) quanto pagou ao	 sindicato;
d) o sal�rio l�quido.
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
		System.out.println("Sal�rio liquido: " + (sal - (sal*0.24)));
		
		scan.close();
	}
}
