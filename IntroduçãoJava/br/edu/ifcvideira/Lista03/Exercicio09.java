/*9 � Foi feita uma pesquisa entre os habitantes de uma regi�o. Foram coletados os dados de idade, sexo (M/F) e sal�rio. Fa�a um programa em JAVA 
 * que calcule e mostre: A m�dia dos sal�rios; A maior e a menor idade; A quantidade de mulheres com sal�rio at� R$ 2000,00; Finalize a entrada de 
 * dados ao ser digitada uma idade negativa.  
 */

package br.edu.ifcvideira.Lista03;
import java.util.Scanner;
public class Exercicio09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String decS;//Recebendo dados de Sexo
		int contS = 0;//Somatorio de Mulheres com mais de R$2000
		int decI;//Recebendo idade
		int contSa = 0;//Contador de salarios
		int idadeMa = 0;//IDade maior
		int idadeMe = 199;//Idade menor
		double decSa;//Recebendo salario
		double salario = 0;//somatorio de salario
		
		for (;;){
			System.out.print("Digite a idade da pessoa: ");
			decI = scan.nextInt();
			if (decI < 0){
				break;
			}else {
				System.out.print("Digite o sexo da pessoa (M/F): ");
				decS = scan.next();
				System.out.print("Digite o sal�rio da pessoa: R$");
				decSa = scan.nextDouble();
				if (decSa > 0){//M�dia sal�rio
					salario = salario + decSa;
					contSa++;
				}if (decI > idadeMa){//Idade maior
					idadeMa = decI;
				}if (decI < idadeMe){//Idade Menor
					idadeMe = decI;
				}if (((decS.equals("F")||(decS.equals("f"))) && (decSa<2000))){
					contS++;
				}
			}
		}
		System.out.println("A m�dia dos salario � de: R$"+ (salario/contSa));
		System.out.println("A maior idade registrada foi de: " + idadeMa);
		System.out.println("A menor idade encontrada foi de: "+ idadeMe);
		System.out.println("A quantidade de mulheres com salario de at� R$2000,00 � de: " + contS);
		scan.close();
	}
}
