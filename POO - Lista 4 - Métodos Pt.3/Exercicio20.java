import java.util.Scanner;

public class Exercicio20 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("20 - Crie um programa que solicite ao usuario dois numeros inteiros. Atraves de um metodo que receba esses dois numeros inteiros como parametro de entrada, calcule e retorne o MDC (Maximo Divisor Comum) destes numeros fornecidos.");
		
		Scanner scan = new Scanner(System.in);

		int quantidadePrimos = calcularQuantidadePrimos();
		int valorA, valorB, j = 0;
		
		int[] primos = new int[quantidadePrimos];

		for(int i = 0; i < 17389; i++) {
			if(gerarPrimos(i)) {
				primos[j] = i;
				j++;
			}
		}
		
		System.out.print("\nDigite um numero: ");
		valorA = scan.nextInt();
		
		System.out.print("\nDigite outro numero: ");
		valorB = scan.nextInt();
		
		calcularMdc(valorA, valorB, primos);
	}
	
	static void calcularMdc(int n1, int n2, int[] p1) {
		int mdc = 1;
		 
		 System.out.println("");
		 
		for(int i = 0; i < p1.length; i++) {
			
			if(n1 % p1[i] == 0 && n2 % p1[i] == 0) {
				System.out.print(" -->");
				mdc *= p1[i];
			}
			
			if(p1[i] < 10) {
				System.out.printf("\t[%d]  | (%d, %d)\n", p1[i], n1, n2);
			} else {
				System.out.printf("\t[%d] | (%d, %d)\n", p1[i], n1, n2);
			}
			
			if(n1 % p1[i] == 0 && n1 > 1) {
				n1 /= p1[i]; 
			}
			 
			if(n2 % p1[i] == 0 && n2 > 1) {
				n2 /= p1[i];
			}
			 
			if(n1 % p1[i] == 0 || n2 % p1[i] == 0) {
				i--;
			}
			
			if(n1 == 1 && n2 == 1) {
				if(p1[i] < 10) {
					System.out.printf("\t[%d]  | (%d, %d)", p1[i], n1, n2);
				} else {
					System.out.printf("\t[%d] | (%d, %d)", p1[i], n1, n2);
				}
				System.out.printf("\n\n\tMDC: %d", mdc);
				break;
			}
		}
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
