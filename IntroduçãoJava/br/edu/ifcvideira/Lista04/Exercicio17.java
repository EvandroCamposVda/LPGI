/*17 - Leia uma matriz 100 x 10 que se refere respostas de 10 questões de múltipla escolha, referentes a 100 alunos. 
 * Leia também um vetor de 10 posições contendo o gabarito de respostas que podem ser a, b, c ou d. Seu programa deverá 
 * comparar as respostas de cada candidato com o gabarito e emitir um vetor Resultado, contendo a pontuação correspondente.*/

package br.edu.ifcvideira.Lista04;

import java.util.Random;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random random = new Random ();
		String vet[] = new String [10];
		String matriz[][] = new String [100][10]; 
		int i = 0;
		int j = 0;
		int dec;
		int cont = 0;
		
		// Aleartorio Gabarito
		for (i=0;i<10;i++) {
			dec = (random.nextInt(4) + 1);
				if (dec == 1) {
					vet[i] = "a";
				}else if (dec == 2) {
					vet[i] = "b";
				}else if (dec == 3) {
					vet[i] = "c";
				}else if (dec == 4) {
					vet[i] = "d";
				}
		}
		// Impressao Gabarito
		System.out.println("Gabarito !");
		for (j=0;j<10;j++) {
			System.out.print(vet[j] + "  ");
		}
		// Criação Matriz
		System.out.println("  ");
		System.out.println("Respostas !");
		for (i=0;i<100;i++) {
			for (j=0;j<10;j++) {
				dec = (random.nextInt(4) + 1);
			
				if (dec == 1) {
					matriz[i][j] = "a";
				}else if (dec == 2) {
					matriz[i][j] = "b";
				}else if (dec == 3) {
					matriz[i][j] = "c";
				}else if (dec == 4) {
					matriz[i][j] = "d";
				}
			}
		}
		//Impressão e Comparação de respostas
		for (i=0;i<100;i++) {
			for (j=0;j<10;j++) {
				System.out.print(matriz[i][j] + "  ");
					if (vet[j] == matriz[i][j]) {
						cont++;
					}
			}
			System.out.print("Nota: " + cont);
			cont = 0;
			System.out.println("  ");
		}
		scan.close();
	}
}
