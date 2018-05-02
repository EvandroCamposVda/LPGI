/*8 - A equipe Benneton-Ford deseja calcular o n�mero m�nimo de litros que dever� colocar no tanque de 
 * seu carro para que ele possa percorrer um determinado n�mero de voltas at� o primeiro reabastecimento. 
 * Escreva um programa em JAVA que leia o comprimento da pista (em metros), o n�mero total de voltas a 
 * serem percorridas no grande pr�mio, o n�mero de reabastecimentos desejados e o consumo de combust�vel 
 * do carro (em Km/L). Calcular e escrever o n�mero m�nimo de litros necess�rios para percorrer at� o 
 * primeiro reabastecimento. OBS: Considere que o n�mero de voltas entre os reabastecimentos � o mesmo.
 */

package br.edu.ifcvideira.Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double c,v,r,com;
		double calc1, calc2, calc3;
		
		System.out.println("Digite o comprimento da pista: ");
		c = scan.nextDouble();
		System.out.println("Digite a quantidade de voltas da pista: ");
		v = scan.nextDouble();
		System.out.println("Digite a quantidade de reabastecimento do carro: ");
		r = scan.nextDouble();
		System.out.println("Digite o consumo do carro na pista: ");
		com = scan.nextDouble();
		
		calc1 = c*v;
		calc2 = calc1/(r+1);
		calc3 = calc2/com;
			
		System.out.println("O n�mero necess�rio de litros para o primeiro abastecimento �: " + df.format(calc3));
		scan.close();
	}
}
