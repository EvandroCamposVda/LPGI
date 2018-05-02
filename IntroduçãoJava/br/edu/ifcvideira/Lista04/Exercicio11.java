/*11 - Uma determinada empresa deseja controlar as vendas de seus 10 principais produtos ao longo do ano. Para isto você 
 * deverá criar 12 vetores – 1 para cada mês do ano que armazenará a quantidade adequada de produtos. O programa deverá 
 * pedir a quantidade vendida de cada produto mês a mês. Cada posição do vetor conterá a quantidade vendida do produto no 
 * mês. Ao final o programa deverá mostrar a quantidade vendida de cada produto no primeiro semestre e no segundo semestre.
 */

package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int matriz [][]= new int [10][12];
		int i=0;//Codigo produto
		int j=0;//Quantidade Vendida
		int cont1 = 0;//contador do primeiro semestre
		int cont2 = 0;//contador segundo semestre
		
		for (i=0;i<3;i++) {
			System.out.println("Codigo: " + (i+1));
			for (j=0;j<12;j++) {
				System.out.print("Digite a quantidade vendida no mes "+(j+1)+": ");
				matriz[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		
		for (i=0;i<3;i++) {
		cont1 = 0;
		System.out.println("Codigo: "+(i+1));
			for (j=0;j<6;j++) {
				cont1 = cont1 + matriz[i][j];
			}
		System.out.println("Quantidade vendida 1º semestre: "+(cont1));
		System.out.println("  ");
		}
		
		for (i=0;i<3;i++) {
		cont2 = 0;
		System.out.println("Codigo: "+(i+1));
			for (j=6;j<12;j++) {
				cont2 = cont2 + matriz[i][j];
			}
		System.out.println("Quantidade vendida 2º semestre: "+(cont2));
		System.out.println("  ");
		}

		scan.close();
	}
}
