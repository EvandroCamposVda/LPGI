/*13 - Leia uma matriz 10 x 10 e escreva a localização (linha e a coluna) do maior valor.*/
package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int matriz [][] = new int [10][10];
		int i;
		int j;
		int maior = 0;
		int pi = 0;
		int pj = 0;
		
		
		for (i=0;i<10;i++) {
			for (j=0;j<10;j++) {
				System.out.print("Digite um valor para a posição ("+(i+1)+","+(j+1)+") da matriz: ");
				matriz[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		
		for (i=0;i<10;i++) {
			for (j=0;j<10;j++) {
				if (matriz[i][j]>maior) {
					pi = i+1;
					pj = j+1;
					maior = matriz[i][j];
				}
			}
		}
		
		System.out.println("O maior valor encontrado foi "+maior+" na posição (" +pi+ "," +pj+") !");
		scan.close();
	}
}
