package br.edu.ifcvideira.Lista02;
import java.util.Scanner;
public class Exercicio08 {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int n1;
		int n2;
		
		System.out.println("Digite o numero chave: ");
		n1 = scan.nextInt();
		
		if ((n1 >= 0) &(n1 <= 100)) {
			for (;;) {
				System.out.println("Digite um valor: ");
				n2 = scan.nextInt();
				
				if (n1 == n2) {
					System.out.println("Voce acertou !");
					break;
				}
				if (n1 < n2) {
					System.out.println("Resposta: " + (n2 - n1));
				}else {
					System.out.println("Resposta: " +(n1 - n2));
				}
			}
		}else if ((n1 > 100) || (n1 < 0)) {
			System.out.println("Codigo invalido !");
		}
		scan.close();
	}
}
