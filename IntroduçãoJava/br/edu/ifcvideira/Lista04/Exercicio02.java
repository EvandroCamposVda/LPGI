/*2 – Faça um programa em JAVA que leia um vetor de 12 posições e em seguida ler também dois valores X e Y 
 * quaisquer correspondentes a duas posições no vetor. Ao final seu programa deverá escrever a soma dos valores 
 * encontrados nas respectivas posições X e Y.*/

package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int vetor [] = new int [12];
		int i;
		int x;
		int y;
		
		for (i=0;i<12;i++) {
			System.out.print("Digite um valor para a posição "+(i+1)+" do vetor: ");
			vetor [i] = scan.nextInt();
		}
		
		System.out.println("Digite um valor para x: ");
		x = scan.nextInt();
		System.out.println("Digite um valor para y: ");
		y = scan.nextInt();
		
		System.out.println("A soma das posições x e y é de: "+ (vetor[x-1]+vetor[y-1]));
		scan.close();
	}
}
