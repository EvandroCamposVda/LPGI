package br.edu.ifcvideira.Lista02;
import java.util.Scanner;
public class Exercicio05 {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		float a,b,c;
		
		System.out.println("Digite o lado a do triângulo: ");
		a = scan.nextFloat();
		System.out.println("Digite o lado b do triângulo: ");
		b = scan.nextFloat();
		System.out.println("Digite o lado c do triângulo: ");
		c = scan.nextFloat();
		
		if ((a == b) && (a == c) && (c == b)) {
			System.out.println("Triângulo Equilátero !");
		}else if ((a == b) || (b == c) || (c == a)) {
			System.out.println("Triangulo Isóscele !");
		}else {
			System.out.println("Trianguloo Escaleno !");
		}
		scan.close();
	}
}
