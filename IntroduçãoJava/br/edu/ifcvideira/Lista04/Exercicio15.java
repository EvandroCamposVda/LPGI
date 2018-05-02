/*15 - Leia uma matriz 50 x 2, onde cada coluna corresponde a um lado de um triangulo retângulo. Declare um vetor que 
 * contenha a área dos respectivos triângulos e o escreva. */
package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int matriz [][] = new int [50][3];
		int vet[] = new int [50];
		int i = 0;
		int j = 0;
		
		for (i=0;i<50;i++) {
			for (j=0;j<2;j++) {
				System.out.print("Digite o lado "+(j+1)+" do triangulo "+(i+1)+": ");
				matriz [i][j] = Integer.parseInt(scan.nextLine());
			}
			System.out.println("  ");
			vet[i] = (matriz[i][0]*matriz[i][1])/2;
		}
		
		for (i=0;i<50;i++) {
			System.out.println("Triangulo "+(i+1)+" resultado: "+(vet[i]));
		}
		scan.close();
	}
}
