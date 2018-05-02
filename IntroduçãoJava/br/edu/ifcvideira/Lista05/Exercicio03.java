/*3 - Faça um programa que receba uma única String de números inteiros separados por ’;’(ponto e vírgula). Apresente o maior e o menor número dessa 
 * String.// Dica: utilize o método split() da classe String.
 */
package br.edu.ifcvideira.Lista05;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String dados;
		String [] dados1 = new String [99];
		int valor [] = new int [99];
		int i;
		int maior = 0;
		int menor = 9999;
		
		System.out.println("Digite uma sequencia de numeros separados por ; (Exemplo: ''3;25;5;8;9''): ");
		dados = String.valueOf(scan.nextLine());
		
		dados1 = dados.split(";");
		
		for (i=0;i<dados1.length;i++){
			valor[i] = Integer.parseInt(dados1[i]);
		}
		
		for (i=0;i<dados1.length;i++){
			if (valor[i]>maior){
				maior = valor[i];
			}else if (valor[i]<menor){
				menor = valor[i];
			}
		}
		System.out.println("O maior valor encontrado foi: " + maior);
		System.out.println("O menor valor encontrado foi: " + menor);
		scan.close();
	}
}
