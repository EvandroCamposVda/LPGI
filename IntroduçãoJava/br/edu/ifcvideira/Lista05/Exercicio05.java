/*5 - Implemente um programa que solicite ao usu�rio uma frase e inverta a ordem das palavras. Ex: Frase: aula at� meio dia. Exiba: dia meio at� 
 * aula. Monte a nova String, utilizando a classe StringBuilder e o seu m�todo append().*/

package br.edu.ifcvideira.Lista05;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String frase[] = new String[100];
		String fraseEntrada;
		StringBuilder palavra = new StringBuilder();
		int i;
		
		System.out.println("Digite uma frase: ");
		fraseEntrada = String.valueOf(scan.nextLine());
		
		frase = fraseEntrada.split(" ");
		
		for (i=(frase.length-1); i>-1; i--){
			palavra.append(frase[i] + " ");
		}
		
		System.out.println(palavra);
		scan.close();
	}
}
