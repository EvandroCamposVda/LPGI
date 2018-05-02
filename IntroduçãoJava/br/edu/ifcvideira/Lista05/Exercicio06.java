package br.edu.ifcvideira.Lista05;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String dado;
		
		System.out.println("Digite a frase: ");
		dado = String.valueOf(scan.nextLine());
		
		dado = dado.replaceAll("A", "*");
		dado = dado.replaceAll("a", "*");
		dado = dado.replaceAll("Á", "*");
		dado = dado.replaceAll("á", "*");
		dado = dado.replaceAll("À", "*");
		dado = dado.replaceAll("à", "*");
		dado = dado.replaceAll("Â", "*");
		dado = dado.replaceAll("â", "*");
		dado = dado.replaceAll("ã", "*");
		dado = dado.replaceAll("Ã", "*");
		
		System.out.print(dado);
		scan.close();
	}
}