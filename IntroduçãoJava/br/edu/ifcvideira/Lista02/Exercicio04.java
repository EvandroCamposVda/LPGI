package br.edu.ifcvideira.Lista02;
import java.util.Scanner;
public class Exercicio04 {
	private static Scanner scan;

	public static void main (String[] args) {
		scan = new Scanner (System.in);
		
		int v1,v2,v3,v4,v5;
		
		System.out.println("Digite o valor da base (lado1): ");
		v1 = scan.nextInt();
		
		System.out.println("Digite o valor da altura (lado2): ");
		v2 = scan.nextInt();
		
		System.out.println("Digite o valor da base (lado3):  ");
		v3 = scan.nextInt();
		
		System.out.println("Digite o valor da altura (lado4) (Digite 0 para encerrar): ");
		v4 = scan.nextInt();
		
		if (v4 == 0) {
			System.out.println("Triângulo, sua area é de: " + v1*v2/2);
		}else {
			System.out.println("Digite o valor da (lado5) (Digite 0 para encerrar): ");
			v5 = scan.nextInt();
				if (v5 == 0) {
					System.out.println("Quadrado, sua area é: " + v1*v2);
				}else {
					System.out.println("É um pentágono !");
				}
		}
		scan.close();
		
	}
}
