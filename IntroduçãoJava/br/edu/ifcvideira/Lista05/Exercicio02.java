/*2 � Leia uma arrayList de 20 posi��es inteiras e a coloque em ordem crescente, utilizando a seguinte estrat�gia de ordena��o (sele��o direta):
selecione o elemento do vetor que apresenta o menor valor;
troque este elemento pelo primeiro;
repita estas opera��es, envolvendo agora apenas os 19 elementos restantes (trocando o de menor valor com a segunda posi��o, depois os 18 elementos
 (trocando o de menor valor com a terceira posi��o), depois os 17, os 16 e assim por diante, at� restar um �nico elemento, o maior deles.
*/
package br.edu.ifcvideira.Lista05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		ArrayList <Integer> dados = new ArrayList();
		int dec;
		int maior = 0;
		int valor = 0;
		int menor = 9999;
		int ind = 0;
		int aux;
		int i = 0;
		int j = 0;
		
		for (i=0;i<20;i++){
			System.out.print("Digite um valor para a posi��o "+(i+1)+" da ArrayList: ");
			dec = Integer.parseInt(scan.nextLine());
			dados.add(dec);
		}
		for (i=0;i<20;i++){
			for (j=i;j<20;j++){
				if (dados.get(j) < menor){
					menor = dados.get(j);
					ind = j;
				}
			}
			aux = dados.get(i);
			dados.set(i, menor);
			dados.set(ind, aux);
			menor = 9999;
		}		
		
		System.out.println(dados);
		scan.close();
	}
}
