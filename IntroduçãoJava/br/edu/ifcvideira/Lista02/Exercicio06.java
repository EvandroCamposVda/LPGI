package br.edu.ifcvideira.Lista02;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio06 {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double massa = 0;
		double densidade = 0;
		double v1;
		
		System.out.println("Digite a massa do leite: ");
		massa = scan.nextDouble();
		
		System.out.println("Digite a densidade do leite: ");
		densidade = scan.nextDouble();
		
		System.out.println("Digite o valor do leite por Kg: ");
		v1 = scan.nextDouble();
		
		System.out.println ("Massa: " + df.format(massa));
		System.out.println("Densidade: "+ df.format(densidade));
		System.out.println("Volume do leite: " + df.format(massa/densidade));
		System.out.println("Preço do Kg do leite: " + v1);
		System.out.println("Valor a ser pago: " + (df.format((massa)*v1)));
		
		if (densidade < 1.14) {
			System.out.println("Categoria do Leite: Categoria I (Abaixo de 1,14)");
		}else if ((densidade >= 1.14) && (densidade <=1.20)) {
			System.out.println("Categoria do Leite: Categoria II (Entre 1,14 e 1,20)");
		}else if (densidade > 1.20){
			System.out.println("Categoria do Leite: Categoria III (Acima de 1,20)");
		}
		scan.close();
	}
}
