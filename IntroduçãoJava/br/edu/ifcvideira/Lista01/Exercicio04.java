/*4 - Escreva um programa em JAVA para ler o raio de um c�rculo, calcular e escrever a sua �rea.*/

package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		float r;
		
		System.out.println("Digite o valor de raio: ");
		r = scan.nextFloat();
		
		
		System.out.println("A �rea do circulo �: " + (3.14*Math.pow(r, 2)));
		
		scan.close();
	}
}
