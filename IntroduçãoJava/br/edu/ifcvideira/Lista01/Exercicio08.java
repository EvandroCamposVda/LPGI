/*8 - A equipe Benneton-Ford deseja calcular o número mínimo de litros que deverá colocar no tanque de 
 * seu carro para que ele possa percorrer um determinado número de voltas até o primeiro reabastecimento. 
 * Escreva um programa em JAVA que leia o comprimento da pista (em metros), o número total de voltas a 
 * serem percorridas no grande prêmio, o número de reabastecimentos desejados e o consumo de combustível 
 * do carro (em Km/L). Calcular e escrever o número mínimo de litros necessários para percorrer até o 
 * primeiro reabastecimento. OBS: Considere que o número de voltas entre os reabastecimentos é o mesmo.
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
			
		System.out.println("O número necessário de litros para o primeiro abastecimento é: " + df.format(calc3));
		scan.close();
	}
}
