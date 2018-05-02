/*7 - Faça um programa em JAVA que deve ficar lendo uma letra por vez do teclado até que o operador digite a letra x. Após o operador
 *  digitar x o programa deve apresentar na tela o número de vezes que o operador digitou dois caracteres iguais em sequencia.
 */

package br.edu.ifcvideira.Lista03;
import java.util.Scanner;
public class Exercicio07 {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		
		String a;
		String b = " ";
		String c = "x";
		int cont = 0;
		
		for (;;){
			System.out.println("Digite uma letra");
			a = scan.nextLine();
			
			if (a.equals(c)){
				break;
			}else if (a.equals(b)){
				cont++;
			}
			b = a;
		}
		System.out.println("Voce digitou "+ cont +" vezes letras em sequencia !");
		scan.close();
	}
}
