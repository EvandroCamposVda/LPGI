//2 - Fa�a um programa em Java que l� tr�s n�meros reais do teclado e apresenta na tela a m�dia destes n�meros.

package br.edu.ifcvideira.Lista01;
import java.util.Scanner;
public class Exercicio02 {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		
		float a, b, c;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		b = scan.nextFloat();
		
		System.out.println("Digite o terceiro12 valor: ");
		c = scan.nextFloat();
		
		System.out.println("A m�dia destes valores foi: " + (a+b+c)/3);
		scan.close();
	}
}
