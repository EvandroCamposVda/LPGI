/*12 - Fa�a um programa em JAVA que declare uma matriz 10X10 posi��es e preencha os elementos do com os valores da soma para
aquele elemento, de forma que, por exemplo, o elemento [7][9] valha 16. E uma outra tamb�m 10X10 que seja completada pela 
multiplica��o de i e j. Ex: [7][8] = 56.*/

package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio12 {
	 public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int matriz [][] = new int [10][10];
		int matriz1 [][] = new int [10][10];
		int i;
		int j;
		
		for (i=0;i<10;i++) {
			for (j=0;j<10;j++) {	
				matriz[i][j] = i+j;
			}
		}
		
		for (i=0;i<10;i++) {
			for (j=0;j<10;j++) {	
				matriz1[i][j] = i*j;
			}
		}
		
		
		System.out.println("Matriz soma");
		for (i=0;i<10;i++) {
			for (j=0;j<10;j++) {	
				System.out.print(matriz[i][j]+("  "));
			}
			System.out.println(" ");
		}
		System.out.println("Matriz multiplica��o");
		for (i=0;i<10;i++) {
			for (j=0;j<10;j++) {	
				System.out.print(matriz1[i][j]+ ("  "));
			}
			System.out.println(" ");
		}
		scan.close();
	}
}
