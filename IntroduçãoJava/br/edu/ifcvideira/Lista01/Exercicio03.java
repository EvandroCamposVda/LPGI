/*3 - Faça um programa em JAVA que pede para o operador digitar o nome de uma pessoa, sua idade e seu salário 
 (float). Em seguida o programa deve imprimi-los na tela.*/

package br.edu.ifcvideira.Lista01;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String nome;
		float sal;
		int idade;
		
		
		System.out.println("Digite o seu nome: ");
		nome = scan.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();
		
		System.out.println("Digite seu salario: ");
		sal = scan.nextFloat();
		
		System.out.println("Nome: "+ nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + sal);
		scan.close();
	}
}
