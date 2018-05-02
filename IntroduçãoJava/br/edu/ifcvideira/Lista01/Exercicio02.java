//2 - Faça um programa em Java que lê três números reais do teclado e apresenta na tela a média destes números.

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
		
		System.out.println("A média destes valores foi: " + (a+b+c)/3);
		scan.close();
	}
}
