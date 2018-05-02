/*5 - Implemente um programa que solicite ao usuário uma frase e inverta a ordem das palavras. Ex: Frase: aula até meio dia. Exiba: dia meio até 
 * aula. Monte a nova String, utilizando a classe StringBuilder e o seu método append().*/

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
