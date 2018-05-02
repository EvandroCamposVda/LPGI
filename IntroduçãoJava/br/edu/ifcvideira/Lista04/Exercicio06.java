/*6 – Faça um programa em JAVA que leia um vetor de 3 posições contendo os caracteres de um numero. Em seguida escreva esse numero por extenso. */

package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio06 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	int vet[] = new int [3];
	int i = 0;
		for (i=0;i<3;i++){
			System.out.print("Digite um valor para a posição " + (i+1) + "ª do vetor: ");
			vet[i] = Integer.parseInt(scan.nextLine());
		}
		
		if ((vet[0]==0&&vet[1]==0&&vet[2]==0)){
			System.out.print("Zero");
		}
		
		if ((vet[0]==1)&&(vet[1]==0)&&(vet[2]==0)){
			System.out.print("Cem");
		}
		if ((vet[0]==1)&&(vet[1]>=0)&&(vet[2]>=1)){
			System.out.print("cento");
		}else if ((vet[0]==2)){
			System.out.print("duzentos");
		}else if ((vet[0]==3)){
			System.out.print("trezentos");
		}else if ((vet[0]==4)){
			System.out.print("quatrocentos");
		}else if ((vet[0]==5)){
			System.out.print("quinhentos");
		}else if ((vet[0]==6)){
			System.out.print("seiscentos");
		}else if ((vet[0]==7)){
			System.out.print("setecentos");
		}else if ((vet[0]==8)){
			System.out.print("oitocentos");
		}else if ((vet[0]==9)){
			System.out.print("novecentos");
		}
		if ((vet[1]==1)&&(vet[2]==0)){
			System.out.print(" e Dez");
		}else if ((vet[1]==2)&&(vet[2]>=0) && (vet[0]>=0)){
			System.out.print(" e Vinte");
		}else if ((vet[1]==3)&&(vet[2]>=0)&& (vet[0]>=0)){
			System.out.print(" e Trinta");
		}else if ((vet[1]==4)&&(vet[2]>=0)&& (vet[0]>=0)){
			System.out.print(" e Quarenta");
		}else if ((vet[1]==5)&&(vet[2]>=0)&& (vet[0]>=0)){
			System.out.print(" e Cinquenta");
		}else if ((vet[1]==6)&&(vet[2]>=0)&& (vet[0]>=0)){
			System.out.print(" e Sessenta");
		}else if ((vet[1]==7)&&(vet[2]>=0)&& (vet[0]>=0)){
			System.out.print(" e Setenta");
		}else if ((vet[1]==8)&&(vet[2]>=0)&& (vet[0]>=0)){
			System.out.print(" e Oitenta");
		}else if ((vet[1]==9)&&(vet[2]>=0)&& (vet[0]>=0)){
			System.out.print(" e Noventa");
		}
		if (vet[2]==1&& (vet[1]!=(vet[2]))){
			System.out.print(" e um");
		}else if ((vet[2]==2) && (vet[1]>=0)){
			System.out.print(" e dois");
		}else if (vet[2]==3 && (vet[1]>=0)){
			System.out.print(" e tres");
		}else if (vet[2]==4 && (vet[1]>=0)){
			System.out.print(" e quatro");
		}else if (vet[2]==5 && (vet[1]>=0)){
			System.out.print(" e cinco");
		}else if (vet[2]==6 && (vet[1]>=0)){
			System.out.print(" e seis");
		}else if (vet[2]==7 && (vet[1]>=0)){
			System.out.print(" e sete");
		}else if (vet[2]==8 && (vet[1]>=0)){
			System.out.print(" e oito");
		}else if (vet[2]==9 && (vet[1]>=0)){
			System.out.print(" e nove");
		}
		if ((vet[1]==1)&&(vet[2]==1)){
			System.out.print(" e onze");
		}else if ((vet[1]==1)&&(vet[2]==2)){
			System.out.print(" e doze");
		}else if ((vet[1]==1)&&(vet[2]==3)){
			System.out.print(" e treze");
		}else if ((vet[1]==1)&&(vet[2]==4)){
			System.out.print(" e quatorze");
		}else if ((vet[1]==1)&&(vet[2]==5)){
			System.out.print(" e quinze");
		}else if ((vet[1]==1)&&(vet[2]==6)){
			System.out.print(" e dezesseis");
		}else if ((vet[1]==1)&&(vet[2]==7)){
			System.out.print(" e dezessete");
		}else if ((vet[1]==1)&&(vet[2]==8)){
			System.out.print(" e dezoito");
		}else if ((vet[1]==1)&&(vet[2]==9)){
			System.out.print(" e dezenove");
		}
		scan.close();
	}
}
