/*4 - Fa�a um programa em JAVA que leia um vetor de 20 posi��es e em seguida um valor X qualquer. 
 * Seu programa devera fazer uma busca do valor de X no vetor lido e informar a posi��o(�es) em que foi
   encontrado ou se n�o foi encontrado. */

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
			System.out.print("Digite um valor para a posi��o "+(i+1)+" do vetor: ");
			vet[i] = Integer.parseInt(scan.nextLine());
		}
		System.out.println("Digite um valor para ser buscado: ");
		bus = scan.nextInt();
		
		for (i=0;i<20;i++) {
			if (vet[i] == bus) {
				System.out.println("Valor encontrado na posi��o: "+(i+1));
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("N�o foi encontrado nenhum valor no banco !");
		}
		scan.close();
		
	}
}
