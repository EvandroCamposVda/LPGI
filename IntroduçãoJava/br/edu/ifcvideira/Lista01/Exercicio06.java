/*6 - Escreva um programa em JAVA para calcular e imprimir o n�mero de l�mpadas necess�rias para iluminar 
 * um determinado c�modo de uma resid�ncia. Dados de entrada: a pot�ncia da l�mpada utilizada (em watts), 
 * as dimens�es (largura e comprimento, em metros) do c�modo.
 *Considere que a pot�ncia necess�ria � de 18 watts por metro quadrado.
*/

package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double potencia;
		double l,c;
		double calc;
		
		System.out.println("Digite a potencia da l�mpada em watts: ");
		potencia = scan.nextDouble();
		
		System.out.println("Digite as dimens�es do c�modo (largura): ");
		l = scan.nextDouble();
		
		System.out.println("Digite as dimens�es do c�modo (comprimento): ");
		c = scan.nextDouble();
		
		calc = l*c*18;
		
		System.out.println("A quantidade de lampadas necess�rias � de: " + calc/potencia);
		scan.close();
	}
}
