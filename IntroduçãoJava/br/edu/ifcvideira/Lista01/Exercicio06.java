/*6 - Escreva um programa em JAVA para calcular e imprimir o número de lâmpadas necessárias para iluminar 
 * um determinado cômodo de uma residência. Dados de entrada: a potência da lâmpada utilizada (em watts), 
 * as dimensões (largura e comprimento, em metros) do cômodo.
 *Considere que a potência necessária é de 18 watts por metro quadrado.
*/

package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double potencia;
		double l,c;
		double calc;
		
		System.out.println("Digite a potencia da lâmpada em watts: ");
		potencia = scan.nextDouble();
		
		System.out.println("Digite as dimensões do cômodo (largura): ");
		l = scan.nextDouble();
		
		System.out.println("Digite as dimensões do cômodo (comprimento): ");
		c = scan.nextDouble();
		
		calc = l*c*18;
		
		System.out.println("A quantidade de lampadas necessárias é de: " + calc/potencia);
		scan.close();
	}
}
