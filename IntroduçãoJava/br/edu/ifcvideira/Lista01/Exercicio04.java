/*4 - Escreva um programa em JAVA para ler o raio de um círculo, calcular e escrever a sua área.*/

package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		float r;
		
		System.out.println("Digite o valor de raio: ");
		r = scan.nextFloat();
		
		
		System.out.println("A área do circulo é: " + (3.14*Math.pow(r, 2)));
		
		scan.close();
	}
}
