//6 - Escreva um programa em JAVA que lê um número inteiro do teclado e imprime todos os seus divisores de resto 0.
package br.edu.ifcvideira.Lista03;
import java.util.Scanner;
public class Exercicio06 {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		
		int x;
		int i;
		
		System.out.print("Digite um número inteiro: ");
		x = scan.nextInt();
		
			for (i=1; i<x; i++){
				if (x%i==0){
					System.out.println(x + " é divisivel por " + i);
				}
			}
		scan.close();	
	}
}
