/*5 - Número primo é aquele que só é divisível por ele mesmo e por 1. Faça um programa em JAVA que determine e escreva os números 
primos compreendidos entre 100 e 1000.*/

package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
			int i;
			int teste;
			int num = 0;
			
		for(teste=101;teste <=1000;teste+=2){	
			for(i=2; i<teste; i++){
				if(i>(teste/2)){
					break;
				}if(teste%i==0){
					num = 1;
					break;
				}
			}if (num==0){
				System.out.println("O numero " + teste + " é primo\n");
			}
			num = 0;
		}
		scan.close();
	}
}
