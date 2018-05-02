/*5 - Escreva um programa em JAVA para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor 
 * correspondente em graus Celsius.*/
package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		float temp;
		
		System.out.println("Digite a temperatura: ");
		temp = scan.nextFloat();
		
		System.out.println("A temperatura em Fahrenheit é: " + (temp*1.8+32));
		scan.close();
	}
}
