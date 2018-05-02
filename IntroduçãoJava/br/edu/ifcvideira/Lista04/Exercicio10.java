/*10 - Faça um programa em JAVA para ler inicialmente o nome, o preço, a quantidade e o código de 10 produtos e armazenar 
 * estes itens em vetores. Cada produto tem um código entre 0 e 9 e  os códigos são únicos. Depois que os dados dos produtos 
 * forem armazenados, perguntar o código de um produto, perguntar se foi venda ou compra e a quantidade (vendida / comprada) 
 * e alterar os vetores correspondentes. Continuar perguntando até que o usuário informe um código composto por um número 
 * negativo. Após terminada a  movimentação, mostrar a lista de produtos com o código, descrição, preço unitário e quantidade
 *  em estoque e o valor total do estoque de cada item. Imprimir também o valor total do estoque para todos os itens juntos.
 */

package br.edu.ifcvideira.Lista04;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		
		String nome[] = new String [3];
		double preco[] = new double [3];
		int quantidade[] = new int [3];
		int codigo[] = new int [3];
		int i=0;
		int dec=0;
		double calc=0;
		
		for (i=0;i<3;i++) {
			codigo[i] = i+1;
			System.out.println("Codigo: "+(codigo[i]));
			System.out.print("Digite o nome do produto: ");
			nome[i] = String.valueOf(scan.nextLine());
			System.out.print("Digite o valor do produto: R$");
			preco[i] = Double.parseDouble(scan.nextLine());
			System.out.print("Digite a quantidade de produtos: ");
			quantidade[i] = Integer.parseInt(scan.nextLine());
			System.out.println("  ");
		}
		
		for (;;) {
			System.out.println("Digite o código: ");
			dec = scan.nextInt();
			i=0;
				for (i=0;i<3;i++) {
					if (dec == codigo[i]) {
						System.out.println("1 - Compra");
						System.out.println("2 - Venda");
						System.out.println("Digite sua operação: ");
						dec = scan.nextInt();
							if (dec == 1) {
								System.out.println("Digite a quantidade comprada: ");
								dec = scan.nextInt();
								quantidade[i] = quantidade[i] + dec;
								System.out.println("Quantidade cadastrada com sucesso !");
								break;
							}else if (dec == 2) {
								System.out.println("Digite a quantidade de venda: ");
								dec = scan.nextInt();
								quantidade[i] = quantidade[i] - dec;
								System.out.println("Venda concluida com sucesso !");
								break;
							}else {
								System.out.println("Operação Invalida !");
								break;
							}
					}else if (dec < 0) {
						break;
					}else {
						System.out.println("Codigo Invalido !");
						break;
					}
				}	
				if (dec < 0){
					break;
				}
		}
			for (i=0;i<3;i++) {
				System.out.println("Código: " + (codigo[i])
						+ "  Descrição: " + (nome[i])+ 
							"  Preço: R$" + (preco[i]) + 
								"  Quantidade: " + (quantidade[i])+
									"Valor estoque: R$"+(quantidade[i]*preco[i]));
				calc = calc + (preco[i]*quantidade[i]);
			}
		System.out.println("Valor total em estoque: R$" + calc);
		scan.close();
	}
}

