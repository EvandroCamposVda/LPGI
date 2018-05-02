/*Faça um programa em JAVA que leia a quantia (valor inteiro positivo) a ser sacada e imprima as 
 * quantidades de notas de 50, 10, 5 e 2 a serem fornecidas aos clientes.
 */

package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int saque;
		int cont50 = 0;
		int cont10 = 0;
		int cont5 = 0;
		int cont2 = 0;
		
		System.out.println("Digite o valor a ser sacado: R$");
		saque = scan.nextInt();
		
		for (;;) {
			if (saque >= 50) {
				cont50++;
				saque -= 50;
			}else if (saque >=10) {
				cont10++;
				saque -= 10;
			}else if (saque >=5) {
				cont5++;
				saque -= 5;
			}else if (saque >= 2) {
				cont2++;
				saque -= 2;
			}else {
				break;
			}
		}
		System.out.println("Quantidade de Notas !");
		System.out.println("R$50,00: " + cont50);
		System.out.println("R$10,00: " + cont10);
		System.out.println("R$5,00: " + cont5);
		System.out.println("R$2,00: " + cont2);
		scan.close();
	}
}
