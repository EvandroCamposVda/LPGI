/*1 – Faça um programa utilizando arrayList que permita: inserir alunos de uma escola, consultar se um aluno específico está na lista, inserir alunos 
 * no meio da lista em uma posição específica, remover qualquer aluno que está na lista e consultar a qualquer momento.*/

package br.edu.ifcvideira.Lista05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		ArrayList nome = new ArrayList ();
		String nome1;
		String nome2;//Buscar por nome
		String nome3;//Remover nome
		String nome4;//Adicionar para uma posição
		int dec;
		int cont;//Contador para listar nomes 
		int cont1;//Contador para comparar nomes
		int flag;//Ver se possui mais do que um nome igual
		int i;
		int exc;//excluir um aluno
		int pos;//Posição a ser gravada
		for(;;){
			System.out.println("Operações !");
			System.out.println("1 - Inserir");
			System.out.println("2 - Consultar");
			System.out.println("3 - Remover");
			System.out.print("Digite sua operação: ");
			dec = Integer.parseInt(scan.nextLine());
			if (dec == 1){//Cadastro de Nome
				System.out.println("1 - Posição");
				System.out.println("2 - Final da Lista");
				System.out.print("Digite sua operação: ");
				dec = Integer.parseInt(scan.nextLine());
				if (dec == 1){
					System.out.print("Digite o nome a ser cadastrado: ");
					nome4 = String.valueOf(scan.nextLine());
					System.out.print("Digite a posição a ser gravada: ");
					pos = Integer.parseInt(scan.nextLine());
					if (nome.contains(nome4)){
						System.out.println("Nome já cadastrado !");
						
					}else {
						nome.add(pos-1, nome4);
					}
				}else if (dec == 2){
					System.out.print("Digite o nome a ser inserido: ");
					nome1 = String.valueOf(scan.nextLine());
						if (nome.contains(nome1)){
							System.out.println("Nome já cadastrado !");
						}else{
							nome.add(nome1);
						}
				}
			}else if (dec == 2){//Listar Nomes
			 System.out.println("1 - Listar");
			 System.out.println("2 - Procurar por Nome");
			 System.out.print("Digite sua operação: ");
			 dec = Integer.parseInt(scan.nextLine());
			 	if (dec == 1){
					System.out.println(" ");
					System.out.println("Nomes Cadastrados !");
					System.out.println(" ");
					System.out.println(nome);
					System.out.println(" ");
			 	}else if (dec == 2){
					System.out.print("Digite um nome para buscar: ");
					nome2 = String.valueOf(scan.nextLine());
						if (nome.contains(nome2)){
							System.out.println(nome2 + " Encontrado !");
						}else {
							System.out.println(nome2 + " não encontrado !");
						}
			 	}
			}else if (dec == 3){
				System.out.println("Digite o nome a ser deletado: ");
				nome3 = String.valueOf(scan.nextLine());
					if (nome.contains(nome3)){
						nome.remove(nome3);
						System.out.println("Removido com sucesso !");
					}
			}
		}
	}
}
