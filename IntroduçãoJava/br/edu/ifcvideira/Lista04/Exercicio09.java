/*9 - Faça um programa em JAVA que irá ler 35 salários e 35 códigos de identificação de empregados. 
 * Estes dados devem ficar armazenados em vetores   diferentes. Após lidos os 35 dados pares de dados, mostrar quais são 
 * os códigos dos funcionários que ganham acima de R$ 880,00. */

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
			System.out.print("Digite o codigo de identificação: ");
			vet[i] = Integer.parseInt(scan.nextLine());
			System.out.print("Digite o salário: R$");
			vet1[i] = Integer.parseInt(scan.nextLine());
		}
		
		for (i=0;i<5;i++) {
			if (vet1[i]>880) {
				System.out.println("Código: " + vet[i] + "    Salário: R$" + df.format(vet1[i]));
			}
		}
		scan.close();
	}
}
