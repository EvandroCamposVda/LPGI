/*10 - Fa�a um programa em JAVA para ler inicialmente o nome, o pre�o, a quantidade e o c�digo de 10 produtos e armazenar 
 * estes itens em vetores. Cada produto tem um c�digo entre 0 e 9 e  os c�digos s�o �nicos. Depois que os dados dos produtos 
 * forem armazenados, perguntar o c�digo de um produto, perguntar se foi venda ou compra e a quantidade (vendida / comprada) 
 * e alterar os vetores correspondentes. Continuar perguntando at� que o usu�rio informe um c�digo composto por um n�mero 
 * negativo. Ap�s terminada a  movimenta��o, mostrar a lista de produtos com o c�digo, descri��o, pre�o unit�rio e quantidade
 *  em estoque e o valor total do estoque de cada item. Imprimir tamb�m o valor total do estoque para todos os itens juntos.
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
			System.out.println("Digite o c�digo: ");
			dec = scan.nextInt();
			i=0;
				for (i=0;i<3;i++) {
					if (dec == codigo[i]) {
						System.out.println("1 - Compra");
						System.out.println("2 - Venda");
						System.out.println("Digite sua opera��o: ");
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
								System.out.println("Opera��o Invalida !");
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
				System.out.println("C�digo: " + (codigo[i])
						+ "  Descri��o: " + (nome[i])+ 
							"  Pre�o: R$" + (preco[i]) + 
								"  Quantidade: " + (quantidade[i])+
									"Valor estoque: R$"+(quantidade[i]*preco[i]));
				calc = calc + (preco[i]*quantidade[i]);
			}
		System.out.println("Valor total em estoque: R$" + calc);
		scan.close();
	}
}

