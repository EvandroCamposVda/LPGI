/*4 - Faça um programa em JAVA para ler a altura e o sexo (feminino, masculino) de 10 pessoas. Calcular e escrever:
- A maior e a menor altura;
- A média de altura das mulheres;
- A porcentagem de homens;*/

package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double altura = 0; 
		double alt = 0;// Somatorio de altura feminino
		double ma = 0;//ALtura maxima
		double mea = 99;//Altura minima
		double m = 0;//Contador de sexo masculino
		double s = 0;//contador de sexo feminino 
		int i;
		
		for (i=0; i<10; i++){
			System.out.println("Digite a altura da pessoa: ");
			altura = scan.nextDouble();
			System.out.println("Digite o sexo da pessoa (1 - Masculino / 2 - Feminino): ");
			s = scan.nextDouble();
			
			if (s == 2){
				alt = altura + alt;
				s ++;
			}if (s == 1){
				m ++;
			}if (altura > ma){
				ma = altura;
			}if (altura < mea){
				mea = altura;
			}
			
		}
		System.out.println("A maior altura foi de: "+ ma);
		System.out.println("A menor altura foi de: "+ mea);
		System.out.println("A média de altura das mulheres é de: " + (alt/s));
		System.out.println("A porcentagem de homens é de: " + (m*100/10) +("%"));
		scan.close();
	}
}
