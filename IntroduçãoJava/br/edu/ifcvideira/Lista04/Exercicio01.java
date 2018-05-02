package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int vetor [] = new int [5];
		int i;
		
		//Recebimento do vetor
		for (i=0; i<5; i++){
			System.out.println("Digite um valor para a posição " + (i+1) + " do vetor: ");
			vetor[i] = Integer.parseInt(scan.nextLine());
		}
		for (i=4; i>=0; i--){
			System.out.println("Valor na posição " + (i+1) + ": " + vetor[i]);
		}
		scan.close();
	}
}
