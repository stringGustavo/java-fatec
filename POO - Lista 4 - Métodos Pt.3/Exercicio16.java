import java.util.Scanner;

public class Exercicio16 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("16 - ===Desafio!!!=== Semelhante ao exercicio anterior Crie um programa de conversao de temperaturas, mas agora com tres possibilidades de unidade de medida: Celsius, Fahrenheit e Kelvin. A saída devera ser as outras duas temperaturas, exemplo: entrada em Celsius, a saida deve ser em Fahrenheit e Kelvin. O processo de conversao devera ser feito atraves de um ou mais metodos que recebe a temperatura fornecida como parametro de entrada e retorne as temperaturas convertidas. Para os calculos de conversao, utilize as formulas C = 5 * (F - 32) / 9, F = (9 * C / 5) + 32 e K = C + 273. O programa deve ser executado enquanto o usuario desejar.");
		
		Scanner scan = new Scanner(System.in);
		Scanner scanC = new Scanner(System.in);
		
		char ch = '.', simbolo = (char)176;
		
		do {
			byte opcao = 0;
			double temperatura = 0;
			
			do {
				System.out.print("\nDigite 1 para converter Celsius em Fahrenheit e Kelvin.\nDigite 2 para converter Fahrenheit em Celsius e Kelvin.\nDigite 3 para converter Kelvin em Celsius e Fahrenheit\nDigite 0 para Sair.\n\nAguardando Entrada: ");
				opcao = scan.nextByte();
				
				if(opcao == 0) {
					System.out.print("\nFim do Programa.");
					System.exit(0);
				}
				
				if(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3) {
					System.out.print("Opcao Inválida.");
				}
			} while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3);
		
			if(opcao == 1) {
				System.out.print("\nDigite a temperatura em Celsius: ");
				temperatura = scan.nextDouble();
				
				System.out.printf("\nTemperatura: %.2f%cC\n", temperatura, simbolo);
				System.out.printf("\nEm Fahrenheit: %.2f%cF\n", converterParaFahrenheit(temperatura), simbolo);
				System.out.printf("\nEm Kelvin: %.2fK\n", converterCelsiusParaKelvin(temperatura));
			} else if(opcao == 2) {
				System.out.print("\nDigite a temperatura em Fahrenheit: ");
				temperatura = scan.nextDouble();
				
				System.out.printf("\nTemperatura: %.2f%cF\n", temperatura, simbolo);
				System.out.printf("\nEm Celsius: %.2f%cC\n", converterParaCelsius(temperatura), simbolo);
				System.out.printf("\nEm Kelvin: %.2fK\n", converterFahrenheitParaKelvin(temperatura));
			} else {
				System.out.print("\nDigite a temperatura em Kelvin: ");
				temperatura = scan.nextDouble();
				
				converterKelvinParaCelsiusFahrenheit(temperatura, simbolo);
			}
			
			do {
				System.out.print("\nDeseja fazer outra conversao? [S/N]: ");
				ch = scanC.next().toLowerCase().charAt(0);
			} while(ch != 's' && ch != 'n');
			
		} while(ch != 'n');
		
		System.out.print("\nFim do Programa.");
	}
	
	public static void converterKelvinParaCelsiusFahrenheit(double numero, char c) {
		//6K − 273,15
		double conversorCelsius = numero - 273.15;
		
		//(6 K − 273,15) × 9/5 + 32
		double conversorFahrenheit = ((numero - 273.15) * 9/5) + 32;
		
		System.out.printf("\nTemperatura: %.2fK", numero);
		System.out.printf("\nEm Celsius: %.2f%cC", conversorCelsius, c);
		System.out.printf("\nEm Fahrenheit: %.2f%cF", conversorFahrenheit, c);
	}
	
	public static double converterCelsiusParaKelvin(double numero) {
		double kelvin = numero + 273.15;
		
		return kelvin;
	}
	
	public static double converterFahrenheitParaKelvin(double numero) {
		double kelvin = ((numero - 32) * 5/9) + 273.15;
		
		return kelvin;
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
