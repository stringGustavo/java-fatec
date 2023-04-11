import java.util.Scanner;

public class Exercicio21 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("21 - ===Desafio!!!=== Crie um programa que solicite ao usuario um numero inteiro, que representara a quantidade de numeros inteiros que serao digitados em seguida e armazenados em um array. Atraves de um metodo que receba esse array de numeros inteiros como parametro de entrada, calcule e retorne o MDC (Maximo Divisor Comum) desse conjunto de dados. Valide as entradas para aceitar apenas numeros positivos (pode ser um metodo).");
		
		Scanner scan = new Scanner(System.in);

		int valorA, valorB, quantidadeTermos;
		int j = 0, cont = 0, quantidadePrimos = calcularQuantidadePrimos();
		char simbolo = (char)176;
		
		int[] primos = new int[quantidadePrimos];

		for(int i = 0; i <= 17389; i++) {
			if(gerarPrimos(i)) {
				primos[j] = i;
				j++;
			}
		}
		
		do {
			System.out.print("\nDigite a quantidade de Termos: ");
			quantidadeTermos = scan.nextInt();
			
			if(quantidadeTermos < 1) {
				System.out.println("\nDigite uma quantidade valida!");
			}
		} while(quantidadeTermos < 1);
		
		int[] numeros = new int[quantidadeTermos];
		
		for(int i = 0; i < quantidadeTermos; i++) {
			System.out.printf("\nDigite o %d%c numero: ", i+1, simbolo);
			numeros[i] = scan.nextInt();
			
			if(numeros[i] < 0) {
				i--;
			}
		}
		
		calcularMdc(numeros, primos);
	}
	
	static void calcularMdc(int[] arrNumeros, int[] arrPrimos) {
		int mdc = 1, contadorDivisivel = 0, comparador = 0, contadorCopia = 0;
			
			
		System.out.println("");
		for(int i = 0; i < arrPrimos.length; i++) {
			System.out.printf("\t[%d] - ", arrPrimos[i]);
			
			contadorDivisivel = 0;
			contadorCopia = 0;
			comparador = 0;
			
			for(int j = 0; j < arrNumeros.length; j++) {
				
				if(arrNumeros[j] % arrPrimos[i] == 0) {					
					contadorDivisivel++;
					
					if(contadorDivisivel == arrNumeros.length) {
						mdc *= arrPrimos[i];
					}
				}
				
				System.out.printf("%d", arrNumeros[j]);
				
				if(j+1 < arrNumeros.length) {
					System.out.print(", ");
					
					if(contadorDivisivel == arrNumeros.length) {
						System.out.print("  <--");
					}
				} else {
					if(contadorDivisivel == arrNumeros.length) {
						System.out.print("  <--");
					}
					System.out.println("");
				}
				
				if(arrNumeros[j] % arrPrimos[i] == 0 && arrNumeros[j] > 1) {
					arrNumeros[j] /= arrPrimos[i];
				}
				
				if(arrNumeros[j] % arrPrimos[i] == 0) {					
					contadorCopia++;
				}
			}
			
			for(int k = 0; k < arrNumeros.length; k++) {
				if(arrNumeros[k] == 1) {
					comparador += arrNumeros[k];
				}
			}
			
			if(comparador == arrNumeros.length) {
				break;
			}
			
			if(contadorCopia > 0) {
				i--;
			}
		}
		
		System.out.printf("\n\tMDC: %d", mdc);
	}
	
	static boolean gerarPrimos(int n1) {
		int contador = 0;
		
		for(int i = 1; i <= n1; i++) {
			if(n1 % i == 0) {
				contador++;
			}
		}
			
		return (contador == 2);
	}
	
	static int calcularQuantidadePrimos() {
		int numero = 2, contadorPrimos = 0;
		
		while(numero <= 17389) { //104729
			int contador = 0;
			
			for(int i = 1; i <= numero; i++) {
				if(numero % i == 0) {
					contador++;
				}
			}
			
			if(contador == 2) {
				contadorPrimos++;
			}
			
			numero++;
		}
		
		return contadorPrimos;
	}
}
