/*7 - Escreva um programa em JAVA para ler as dimensões de uma cozinha retangular 
 * (comprimento, largura e altura), calcular e escrever a quantidade de caixas de azulejos para 
 * se colocar em todas as suas paredes (considere que não será descontada a área ocupada por portas 
 * e janelas). Cada caixa de azulejos possui 1,5 m2.
 */
package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		float c,l,a, AL, LC, AC;
		
		System.out.println("Digite o comprimento da cozinha: ");
		c = scan.nextFloat();
		
		System.out.println("Digite a largura da cozinha: ");
		l = scan.nextFloat();
		
		System.out.println("Digite a area da cozinha: ");
		a = scan.nextFloat();
		
		AL = (float) ((a*l/1.5)*2);
		LC = (float) ((c*l/1.5)*2);
		AC = (float) ((a*c/1.5)*2);
		
		System.out.println("A quantidade de caixas necessárias será: " + (AL+LC+AC));
		scan.close();
	}
}
