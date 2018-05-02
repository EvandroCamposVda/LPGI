/*3 - Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino 2:masculino) de uma pessoa, construa um programa que calcule 
 * e imprima seu peso ideal, utilizando as seguintes fórmulas:
- para homens: (72.7 * Altura) – 58
- para mulheres: (62.1 * Altura) – 44.7*/

package br.edu.ifcvideira.Lista02;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio03 {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int sexo;
		double altura;
		
		System.out.println("1 - Feminino \n2 - Masculino\nDigite o sexo: ");
		sexo = scan.nextInt();
		
		System.out.println("Digite sua altura: ");
		altura = scan.nextDouble();
		
		if (sexo == 1){
			System.out.println("Peso ideal para feminino é: " + df.format((72.2 * altura)-58));
		}else if (sexo == 2){
			System.out.println("Peso ideal para masculino é: " + df.format((62.1 * altura)-44.7));
		}else {
			System.out.println("Dados Incorretos !");
		}
		scan.close();
		
	}
}
