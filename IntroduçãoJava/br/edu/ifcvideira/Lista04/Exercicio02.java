/*2 � Fa�a um programa em JAVA que leia um vetor de 12 posi��es e em seguida ler tamb�m dois valores X e Y 
 * quaisquer correspondentes a duas posi��es no vetor. Ao final seu programa dever� escrever a soma dos valores 
 * encontrados nas respectivas posi��es X e Y.*/

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
			System.out.print("Digite um valor para a posi��o "+(i+1)+" do vetor: ");
			vetor [i] = scan.nextInt();
		}
		
		System.out.println("Digite um valor para x: ");
		x = scan.nextInt();
		System.out.println("Digite um valor para y: ");
		y = scan.nextInt();
		
		System.out.println("A soma das posi��es x e y � de: "+ (vetor[x-1]+vetor[y-1]));
		scan.close();
	}
}
