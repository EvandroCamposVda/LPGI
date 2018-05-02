/*9 - Fa�a um programa em JAVA que ir� ler 35 sal�rios e 35 c�digos de identifica��o de empregados. 
 * Estes dados devem ficar armazenados em vetores   diferentes. Ap�s lidos os 35 dados pares de dados, mostrar quais s�o 
 * os c�digos dos funcion�rios que ganham acima de R$ 880,00. */

package br.edu.ifcvideira.Lista04;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double vet [] = new double [5];
		double vet1 [] = new double [5];
		int i;
		
		for (i=0;i<5;i++) {
			System.out.print("Digite o codigo de identifica��o: ");
			vet[i] = Integer.parseInt(scan.nextLine());
			System.out.print("Digite o sal�rio: R$");
			vet1[i] = Integer.parseInt(scan.nextLine());
		}
		
		for (i=0;i<5;i++) {
			if (vet1[i]>880) {
				System.out.println("C�digo: " + vet[i] + "    Sal�rio: R$" + df.format(vet1[i]));
			}
		}
		scan.close();
	}
}
