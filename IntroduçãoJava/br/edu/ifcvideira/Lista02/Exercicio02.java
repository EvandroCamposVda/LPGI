/*2 - As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. 
 * Escreva um programa em JAVA que leia o número de maçãs compradas, calcule e escreva o valor total da compra.
 */

package br.edu.ifcvideira.Lista02;
import java.util.Scanner;
public class Exercicio02 {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		
		double maca;
		
		System.out.println("Digite a quantidade de maçã comprada: ");
		maca = scan.nextDouble(); 
		
		if (maca < 12){
			System.out.println(maca + " maçãs custaram R$" + maca*0.30);
		}else{
			System.out.println(maca + " maçãs custaram R$" + maca*0.25);
		}
		scan.close();
	}
}
