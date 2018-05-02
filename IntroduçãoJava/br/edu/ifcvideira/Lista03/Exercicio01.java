/*1 – Faça um programa em JAVA que lê dois números inteiros do teclado, testa se o primeiro é menor que o segundo, 
 * se for imprime todos os números do intervalo entre eles.*/

package br.edu.ifcvideira.Lista03;
import java.util.Scanner;
public class Exercicio01 {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro número: ");
		a = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		b = scan.nextInt();
		
		if (a < b){
			while (a < (b-1)){
				a++;
				System.out.print(a + " ");
				
			}
		}else {
			System.out.println("Não foi possivel executar esta condição, primeiro numero não é maior que o segundo !!");
		}
		scan.close();
	}
}
