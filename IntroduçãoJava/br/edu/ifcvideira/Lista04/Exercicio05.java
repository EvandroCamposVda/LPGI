/*5 - Fa�a um programa em JAVA que leia um vetor de 40 posi��es e atribua valor 0 para todos os elementos que 
 * possu�rem valores negativos. */
package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int vet[] = new int [40];
		int i;
		
		for (i=0;i<40;i++) {
			System.out.print("Digite um valor para a posi��o "+(i+1)+" do vetor: ");
			vet[i] = Integer.parseInt(scan.nextLine());
			if (vet[i] < 0) {
				vet[i] = 0;
			}
		}
		for (i=0;i<5;i++) {
			System.out.print(vet[i] + " ");
		}
		scan.close();
	}
}
