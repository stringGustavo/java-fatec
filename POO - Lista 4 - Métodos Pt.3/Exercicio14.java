import java.util.Scanner;

public class Exercicio14 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("14 - Crie um programa de conversao de temperaturas em Celsius para Fahrenheit. O usuario devera informar a temperatura em Celsius e sera apresentada a temperatura em Fahrenheit. O processo de conversao devera ser feito atraves de um metodo que recebe a temperatura em Celsius como parametro de entrada e retorne a temperatura convertida para Fahrenheit. Para o calculo da conversao, utilize a formula F = ( 9 * C / 5 ) + 32.");
		
		Scanner scan = new Scanner(System.in);
		Scanner scanC = new Scanner(System.in);
		
		char ch = '.', simbolo = (char)176;
		
		do {
			byte opcao = 0;
			double temperatura = 0;
			
			do {
				System.out.print("\nDigite 1 para converter Celsius em Fahrenheit.\nDigite 0 para Sair.\n\nAguardando Entrada: ");
				opcao = scan.nextByte();
				
				if(opcao == 0) {
					System.out.print("\nFim do Programa.");
					System.exit(0);
				}
				
				if(opcao != 0 && opcao != 1 && opcao != 2) {
					System.out.print("Opcao Inválida.");
				}
			} while(opcao != 0 && opcao != 1 && opcao != 2);
		
			System.out.print("\nDigite a temperatura em Celsius: ");
			temperatura = scan.nextDouble();
			
			System.out.printf("\n%.2f%cC em Fahrenheit: %.2f%cF\n", temperatura, simbolo, converterParaFahrenheit(temperatura), simbolo);
			
			do {
				System.out.print("\nDeseja fazer outra conversao? [S/N]: ");
				ch = scanC.next().toLowerCase().charAt(0);
			} while(ch != 's' && ch != 'n');
			
		} while(ch != 'n');
		
		System.out.print("\nFim do Programa.");
	}
	
	public static double converterParaFahrenheit(double numero) {
		double fahrenheit = (9 * numero / 5) + 32;
		
		return fahrenheit;
	}
}
