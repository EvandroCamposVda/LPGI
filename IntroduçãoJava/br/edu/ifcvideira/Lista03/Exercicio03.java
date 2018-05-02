/*3 - Faça um programa em JAVA que leia um número indeterminado de idades. A última idade lida, 
 * que não entrará nos cálculos, 
 * deverá ser igual a zero. Ao final programa deverá escrever quantas idades foram lidas, calcular e 
 * escrever a média de idade
 *  desse grupo de idades.
 */

package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double i;
		double m = 0;
		double c = 0;
		
		for (;;){
		System.out.println("Digite uma idade (Digite 0 para encerrar): ");
		i = scan.nextDouble();
			if (i == 0){
				break;
			}else {
				c ++;
				m = m + i;
			}
		}
		System.out.println("A média das idades é de: " + (m / c));
		scan.close();
	}
}
