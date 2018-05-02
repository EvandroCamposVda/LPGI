/*18 - Faça um programa que calcule o determinante de uma matriz 3X3.*/

package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int matriz [][] = new int [3][3];
		double calc;
		double calc1;
		double det;
		int i;
		int j;
		
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.print("Digite um valor para a posição ("+(i+1)+","+(j+1)+") da matriz: ");
				matriz[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		
		//Impressão Matriz
		
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println(" ");
		}
		
		calc = matriz[0][0] * matriz[1][1] * matriz[2][2];
        calc += matriz[2][0] * matriz[1][2] * matriz [0][1];
        calc += matriz[2][1] * matriz[1][0] * matriz [0][2];
        calc1 = -1 * matriz[0][2] * matriz[1][1] * matriz[2][0];
        calc1 += -1 * matriz[2][1] * matriz[1][2] * matriz[0][0];
        calc1 += -1 * matriz[2][2] * matriz[1][0] * matriz[0][1];
        
        det = calc + calc1;
        System.out.println("Calculo: " + det);
        scan.close();
	}
}
