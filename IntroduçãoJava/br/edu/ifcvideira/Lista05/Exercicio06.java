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
		dado = dado.replaceAll("�", "*");
		dado = dado.replaceAll("�", "*");
		dado = dado.replaceAll("�", "*");
		dado = dado.replaceAll("�", "*");
		dado = dado.replaceAll("�", "*");
		dado = dado.replaceAll("�", "*");
		dado = dado.replaceAll("�", "*");
		dado = dado.replaceAll("�", "*");
		
		System.out.print(dado);
		scan.close();
	}
}