package br.edu.ifcvideira.Lista02;

import java.util.Scanner;

public class Exercicio01 {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		
		String senha = "1234";
		String senhaDig;
		
		System.out.println("Digite a senha: ");
		senhaDig = String.valueOf(scan.nextLine());
		
		if (senha.equals(senhaDig)){
			System.out.println("Acesso Permitido !");
		}else {
			System.out.println("Acesso negado !");
		}
		
		scan.close();
	}
}
