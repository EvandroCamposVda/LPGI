/*3 - Fa�a um programa em JAVA que leia um n�mero indeterminado de idades. A �ltima idade lida, 
 * que n�o entrar� nos c�lculos, 
 * dever� ser igual a zero. Ao final programa dever� escrever quantas idades foram lidas, calcular e 
 * escrever a m�dia de idade
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
		System.out.println("A m�dia das idades � de: " + (m / c));
		scan.close();
	}
}
