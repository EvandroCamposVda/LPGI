package br.edu.ifcvideira.Lista05;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String dado;
		char dados1 [] = new char [99999];
		int i;
		int pos=0;
		int flag=0;
		
		System.out.println("Digite uma frase: ");
		dado = String.valueOf(scan.nextLine());
		
		dado = dado.replace(" ", "");
		dado = dado.toLowerCase();
		dado = dado.replace("-", "");
		dados1 = dado.toCharArray();
		
		for (i=0;i<dados1.length;i++){
			if (dados1[i] != dados1[(dados1.length-1)-pos]){// COmparação do final do char
				flag = 1;
			}
			pos++;
		}
		
		if (flag == 0){
			System.out.println("A frase é um palíndromo !");
		}else {
			System.out.println("A frase não é um palíndromo !");
		}
		scan.close();
	}
}
