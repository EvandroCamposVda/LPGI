/*11 - Um caixa eletrônico opera com notas de 50, 10, 5 e 2. Como medida de segurança, a cada vez que o 
 * cliente deseja sacar dinheiro, o valor é dado de forma a fornecer um pequeno volume de notas 
 * (supondo que o cliente sempre esteja dentro do seu limite).
 * Esta medida é feita para que a quantidade sacada não “faça muito volume” quando guardada pelo cliente.
 *  Por exemplo, se o cliente quiser sacar R$166,00 não são dadas 83 notas de 2; são dadas 3 notas de 50, 
 *  1 nota de 10 e 3 notas de 2. Assim, a resposta a ser impressa é 3 1 0 3.
 */
package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double saque;
		int cont50 = 0;
		int cont10 = 0;
		int cont5 = 0;
		int cont2 = 0;
		
		System.out.println("Digite o valor a ser retirado: R$");
		saque = scan.nextDouble();
		
		for (;;) {
			if (saque >= 50) {
				cont50++;
				saque = saque - 50;
			}else if (saque >= 10) {
				cont10++;
				saque = saque - 10;
			}else if (saque >= 5) {
				cont5++;
				saque = saque - 5;
			}else if (saque >= 2) {
				cont2++;
				saque = saque - 2;
			}else if (saque < 2) {
				break;
			}
			System.out.println("saque: " + saque);
		}
		System.out.println(cont50 +" " + cont10 +" " + cont5 +" " + cont2);
		scan.close();
	}
}
