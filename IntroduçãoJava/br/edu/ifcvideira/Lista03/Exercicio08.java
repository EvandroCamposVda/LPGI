/*8 - Fa�a um programa em JAVA que apresente quatro op��es: (a) consulta saldo, (b) saque, (c) dep�sito, (d) saldo e (e) sair. 
 * O saldo deve iniciar em R$ 0,00. A cada saque ou dep�sito o valor do saldo deve ser atualizado e apresentado na tela.
 */

package br.edu.ifcvideira.Lista03;
import java.util.Scanner;
public class Exercicio08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int dec;
		double saldo = 0;
		double saque;
		double deposito = 0;
		
		System.out.println("Bem Vindo !");
		for (;;){
			System.out.println("1 - Consultar Saldo");
			System.out.println("2 - Saque");
			System.out.println("3 - Dep�sito");
			System.out.println("4 - Saldo");
			System.out.println("5 - Sair");
			System.out.println("Digite sua opera��o: ");
			dec = scan.nextInt();
				if (dec == 1){// Saldo
					System.out.println("Saldo banc�rio: R$" + saldo);
				}else if (dec == 2){// Saque 
					System.out.print("Digite um valor para saque: R$");
					saque = scan.nextDouble();
						if (saldo < saque){
							System.out.println("Saldo Indisponivel !");
						}else if (saldo > saque){
							saldo = saldo - saque;
							System.out.println("Saque concluido !");
						}
				}else if (dec == 3){
					System.out.print("Digite o valor para depositar: R$");
					deposito = scan.nextDouble();
					saldo = deposito + saldo;
					System.out.println("Deposito concluido com sucesso !");
				}else if (dec == 4){
					System.out.println("Saldo banc�rio: R$" + saldo);
				}else if (dec == 5){
					System.out.println("At� Logo !");
					break;
				}
			
		}
		scan.close();
	}	
}
