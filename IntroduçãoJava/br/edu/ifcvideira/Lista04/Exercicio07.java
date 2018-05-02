/*7 - Faça um programa em JAVA que leia um vetor de 10 posições e verifique se existem valores iguais e os escreva.*/
package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int vet [] = new int [10];
		int vet1 [] = new int [10];
		int i;
		int j;
		int cont=0;
		
		for (i=0;i<10;i++) {
			System.out.print("Digite um valor para a "+(i+1)+" do vetor: ");
			vet[i] = Integer.parseInt(scan.nextLine());
		}
		
		for (j=0;j<10;j++) {
			for (i=(j+1);i<10;i++) {
				if (vet[i] == vet[j]) {
					vet1[j] = vet[j];
					cont++;
					vet[i] = 0;
				}
			}
		}
		if (cont==0) {
			System.out.println("Não foi encontrado nenhum valor igual !");
		}
		scan.close();
		
		if (cont>0){
		System.out.println("Valores repetidos !");
			for (i=0;i<10;i++){
				if (vet1[i]>0){
					System.out.print(vet1[i] + "  ");				
				}
			}
		}
	}
}
