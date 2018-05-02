/*16 - Leia uma matriz 8 x 8 e a transforme numa matriz triangular inferior , atribuindo zero a todos os elementos acima da 
 * diagonal principal, escrevendo-a ao final. */

package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int matriz [][] = new int [8][8];
		int i = 0; 
		int j = 0;
		
		for (i=0;i<8;i++) {
			for (j=0;j<8;j++) {
				System.out.println("Digite um valor para a posição ("+(i+1)+","+(j+i)+") da matriz: ");
				matriz[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		for (i=0;i<8;i++){
			for (j=0;j<8;j++){
				if (j>i){
					matriz[i][j] = 0;
				}
			}
		}
		
		for (i=0;i<8;i++) {
			for (j=0;j<8;j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println("  ");
		}
		scan.close();
	}
}
