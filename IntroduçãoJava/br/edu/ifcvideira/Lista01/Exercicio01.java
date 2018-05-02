package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio01 {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
	
		int x;
		int y;
		
		System.out.println("Digite o valor de X: ");
		x = scan.nextInt();
		
		System.out.println("Digite o valor de Y: ");
		y = scan.nextInt();
		
		System.out.println("O quociente da divisão é: " + (double)x/y);
		System.out.println("O resto da divisão é: " + (double)x%y);
		
		scan.close();
	}
}
