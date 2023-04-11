import java.util.Scanner;

public class Exercicio15 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("15 - Crie um programa de conversao de temperaturas em Celsius para Fahrenheit e vice-versa. O usuario devera escolher se o valor de temperatura que sera informado em Celsius ou em Fahrenheit. Se a entrada for em Celsius, a saida devera ser em Fahrenheit e o contrario, tambem, e verdade. O processo de conversao devera ser feito atraves de um ou mais metodos que recebe a temperatura fornecida como parametro de entrada e retorne a temperatura convertida. Para os calculos de conversao, utilize as formulas C = 5 * (F - 32) / 9 e F = (9 * C / 5) + 32. O programa deve ser executado enquanto o usuario desejar.");
		
		Scanner scan = new Scanner(System.in);
		Scanner scanC = new Scanner(System.in);
		
		char ch = '.', simbolo = (char)176;
		
		do {
			byte opcao = 0;
			double temperatura = 0;
			
			do {
				System.out.print("\nDigite 1 para converter Celsius em Fahrenheit.\nDigite 2 para converter Fahrenheit em Celsius.\nDigite 0 para Sair.\n\nAguardando Entrada: ");
				opcao = scan.nextByte();
				
				if(opcao == 0) {
					System.out.print("\nFim do Programa.");
					System.exit(0);
				}
				
				if(opcao != 0 && opcao != 1 && opcao != 2) {
					System.out.print("Opcao Inválida.");
				}
			} while(opcao != 0 && opcao != 1 && opcao != 2);
		
			if(opcao == 1) {
				System.out.print("\nDigite a temperatura em Celsius: ");
				temperatura = scan.nextDouble();
				
				System.out.printf("\nTemperatura: %.2f%cC\n", temperatura, simbolo);
				System.out.printf("\nEm Fahrenheit: %.2f%cF\n", converterParaFahrenheit(temperatura), simbolo);
			} else {
				System.out.print("\nDigite a temperatura em Fahrenheit: ");
				temperatura = scan.nextDouble();
				
				System.out.printf("\nTemperatura: %.2f%cF\n", temperatura, simbolo);
				System.out.printf("\nEm Celsius: %.2f%cC\n", converterParaCelsius(temperatura), simbolo);
			}
			
			do {
				System.out.print("\nDeseja fazer outra conversao? [S/N]: ");
				ch = scanC.next().toLowerCase().charAt(0);
			} while(ch != 's' && ch != 'n');
			
		} while(ch != 'n');
		
		System.out.print("\nFim do Programa.");
	}
	
	public static double converterParaCelsius(double numero) {
		double celsius = 5 * (numero - 32) / 9;
		
		return celsius;
	}
	
	public static double converterParaFahrenheit(double numero) {
		double fahrenheit = (9 * numero / 5) + 32;
		
		return fahrenheit;
	}
}
