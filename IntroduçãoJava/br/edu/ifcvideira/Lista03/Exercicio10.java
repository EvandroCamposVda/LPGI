/*10 - Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a massa inicial, em gramas, 
 * fazer um programa em JAVA que calcule o tempo necessário para que essa massa se torne menor que 0,5 gramas. O programa deve 
 * escrever a massa inicial, a massa final e o tempo calculado em horas, minutos e segundos.
 */

package br.edu.ifcvideira.Lista03;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int massa=0;
		int tot=0;
		int cont=0;
		int cont2 = 0;
		int min = 0;
		int horas = 0;
		int seg = 0;
		
		System.out.println("Digite a massa do material: ");
		massa = scan.nextInt();
		
		for (;;){
			tot = (massa / 2);
			massa = massa - tot;
			cont++;
			if (tot < 0.5){
				break;
			}
		}
		
		cont = cont*50;
		cont2 = cont;
		
		for (;;){
			if (cont2 > 3600){
				horas ++;
				cont2 = cont2 - 3600;
			}else if (cont2 > 60){
				min ++;
				cont2 = cont2 - 60;
			}else if (cont2 < 60){
				seg = cont2;
				if (seg > 60) {
					min ++;
					seg = 0;
				}
				cont2 = 0;
			}if (cont2 == 0){
				break;
			}
		}
		System.out.println("Segundos: " + seg);
		System.out.println("Minutos: " + min);
		System.out.println("Horas: "+ horas);
		scan.close();
	}
}
