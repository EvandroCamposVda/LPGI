/*1 � Fa�a um programa em JAVA que l� dois n�meros inteiros do teclado, testa se o primeiro � menor que o segundo, 
 * se for imprime todos os n�meros do intervalo entre eles.*/

package br.edu.ifcvideira.Lista03;
import java.util.Scanner;
public class Exercicio01 {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		b = scan.nextInt();
		
		if (a < b){
			while (a < (b-1)){
				a++;
				System.out.print(a + " ");
				
			}
		}else {
			System.out.println("N�o foi possivel executar esta condi��o, primeiro numero n�o � maior que o segundo !!");
		}
		scan.close();
	}
}
