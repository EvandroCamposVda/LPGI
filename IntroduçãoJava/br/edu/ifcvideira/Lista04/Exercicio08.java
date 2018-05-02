/*8 - Faça um programa em JAVA que leia um vetor de 50 posições e o compacte, ou seja, elimine as posições com valor zero avançando uma posição, 
 * com os com os valores subsequentes do vetor. Dessa forma todos “zeros” devem ficar para as posições finais do vetor.*/

package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio08 {
 public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int vet[] = new int [51];
	int i;
	int j;
	int cont;
	for (i=0;i<50;i++){
		System.out.print("Digite um valor para a posição "+(i+1)+" do vetor: ");
		vet[i] = Integer.parseInt(scan.nextLine());
	}
	cont = 50;
	for (i=0;i<cont;i++){
		if (vet[i]==0){
			for (j=i;j<cont;j++){
				vet[j] = vet[j+1];
			}
			cont--;
			i--;
		}
	}
	for (i=0;i<50;i++){
		System.out.print(vet[i] + " ");
	}
	scan.close();
 }
}
