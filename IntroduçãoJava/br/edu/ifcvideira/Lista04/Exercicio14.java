/*14 - Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais elementos. Escreva ao final a matriz
 * obtida. */
package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int matriz [][] = new int [5][5];
		int i;
		int j;
		
		for (i=0;i<5;i++) {
			for (j=0;j<5;j++) {
				if (i==j) {
					matriz [i][j] = 1;
				}else {
					matriz [i][j] = 0;
				}
			}
		}
		
		for (i=0;i<5;i++) {
			for (j=0;j<5;j++) {
				System.out.print(matriz[i][j] +"  ");
			}
			System.out.println("  ");
		}
		scan.close();
	}
}
