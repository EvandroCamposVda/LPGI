package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int ab;
		int fat = 1;
		int i;
		
		System.out.println("Digite o valor para o fatorial: ");
		ab = scan.nextInt();
		
		for (i=ab; i>0; i--){
			fat = fat * i; 
		}
		System.out.println("O valor do fatorial é: " + fat);
		scan.close();
	}
}
