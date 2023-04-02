import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		
		//Gustavo Sant'Anna dos Santos;
		
		System.out.println("04 - Escreva um programa que solicite 3 (tres) valores double e calcule a Equacao do Segundo Grau. O primeiro valor sera o \'a\', o segundo o \'b\' e o ultimo o \'c\'. Crie um metodo que receba tres valores, \'a\', \'b\' e \'c\', que sao os coeficientes da equacao do segundo grau e retorne o valor do delta, que e dado por \'b² - 4ac\'.\n");
		
		double a, b, c;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		a = scan.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = scan.nextInt();
		
		System.out.print("Digite o valor de C: ");
		c = scan.nextInt();

		if(equacaoSegundoGrau(a,b,c) < 0) {
			
			System.out.printf(" Delta: %.0f, Sem Solucao Real.", equacaoSegundoGrau(a, b, c));
		} else {
			
			System.out.printf("\nDelta: %.0f", equacaoSegundoGrau(a, b, c));
		}
	}
	
	static double equacaoSegundoGrau(double a, double b, double c) {
		
		double delta = (Math.pow(b, 2)) - (4 * a * c);
		
		return delta;
	}
}

