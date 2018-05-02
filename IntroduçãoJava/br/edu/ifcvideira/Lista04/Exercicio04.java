/*4 - Faça um programa em JAVA que leia um vetor de 20 posições e em seguida um valor X qualquer. 
 * Seu programa devera fazer uma busca do valor de X no vetor lido e informar a posição(ões) em que foi
   encontrado ou se não foi encontrado. */

package br.edu.ifcvideira.Lista04;
import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int vet[] = new int [20];
		int i;
		int bus;
		int cont = 0;
		
		for (i=0;i<20;i++) {
			System.out.print("Digite um valor para a posição "+(i+1)+" do vetor: ");
			vet[i] = Integer.parseInt(scan.nextLine());
		}
		System.out.println("Digite um valor para ser buscado: ");
		bus = scan.nextInt();
		
		for (i=0;i<20;i++) {
			if (vet[i] == bus) {
				System.out.println("Valor encontrado na posição: "+(i+1));
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("Não foi encontrado nenhum valor no banco !");
		}
		scan.close();
		
	}
}
