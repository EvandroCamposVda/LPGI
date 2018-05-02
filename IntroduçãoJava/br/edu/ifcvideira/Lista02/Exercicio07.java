package br.edu.ifcvideira.Lista02;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio07 {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00"); 
		
		String num;
		int tipo;
		double registroL;
		double registroI;
		double total;
		
		System.out.println("Digite o número de telefone: ");
		num = String.valueOf(scan.nextLine());
		
		System.out.println("1 - Residencial\n2 - Comercial\nDigite o tipo de tarifa: ");
		tipo = scan.nextInt();
		
		if ((tipo == 1) ||(tipo == 2)) {
			if (tipo == 1) {
				System.out.println("Digite a quantidade de minutos registrados para chamadas locais: ");
				registroL = scan.nextDouble();
				System.out.println("Digite a quantidade de minutos registrados para chamadas interurbanas: ");
				registroI = scan.nextDouble();
				
				total = ((10.20) + (registroL*0.50) + (registroI*1.10));
				
				System.out.println("Número: "+ num);
				System.out.println("Tipo de linha: Residencial");
				System.out.println("Local para fixo e celular: " + df.format(registroL));
				System.out.println("Interurbano para fixo e celular: " + df.format(registroI));
				System.out.println("Valor da conta: " + df.format(total));
				System.out.println("Valor taxa FNT: " + df.format(total*0.3));
				System.out.println("Valor total da fatura: " + df.format(total + (total*0.3)));
				
			}else if (tipo == 2) {
				System.out.println("Digite a quantidade de minutos registrados para chamadas locais: ");
				registroL = scan.nextDouble();
				System.out.println("Digite a quantidade de minutos registrados para chamadas interurbanas: ");
				registroI = scan.nextDouble();
				
				total = ((19.50) + (registroL*0.50) + (registroI*1.10));
				
				System.out.println("Número: "+ num);
				System.out.println("Tipo de linha: Comercial");
				System.out.println("Local para fixo e celular: " + df.format(registroL));
				System.out.println("Interurbano para fixo e celular: " + df.format(registroI));
				System.out.println("Valor da conta: " + df.format(total));
				System.out.println("Valor taxa FNT: " + df.format(total*0.3));
				System.out.println("Valor total da fatura: " + df.format(total + (total*0.3)));
			}
		}else {
			System.out.println("Valor invalido !");
		}
		scan.close();
		
	}
}
