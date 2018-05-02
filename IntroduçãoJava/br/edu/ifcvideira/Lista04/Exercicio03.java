/*3 - Faça um programa em JAVA que leia um vetor de 16 posições e troque os 8 primeiros valores pelos 8 
 * últimos e vice-e-versa. Escreva ao final o vetor obtido.*/

package br.edu.ifcvideira.Lista04;
import java.util.Scanner;
public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int vet[] = new int [16];
		int vet1[] = new int [16];
		int i;
		
		for (i=0; i<16; i++) {
			System.out.print("Digite um numero para a posição "+ (i+1)+" do vetor: ");
			vet[i] = Integer.parseInt(scan.nextLine());
		}
		
		for (i=0;i<8;i++) {
			vet1[i+8] = vet[i];
		}for (i=8;i<16;i++) {
			vet1[i-8] = vet[i];
		}
		
		for (i=0;i<16;i++) {
			System.out.print(vet1[i] + " ");
		}
		scan.close();
	}
}
