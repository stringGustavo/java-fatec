import java.util.Scanner;

public class Exercicio22 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("22 - Crie um programa que solicite ao usuario dois numeros inteiros. Atraves de um metodo que receba esses dois numeros inteiros como parametro de entrada, calcule e retorne o MMC (Minimo Multiplo Comum) destes numeros fornecidos. Utilize decomposicao simultanea ou fatoracao simultanea.");
		
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
		
		calcularMmc(valorA, valorB, primos);
	}
	
	static void calcularMmc(int n1, int n2, int[] arrPrimos) {
		int mmc = 1;
		 
		 System.out.println("");
		 
		for(int i = 0; i < arrPrimos.length; i++) {
			if(n1 % arrPrimos[i] == 0 || n2 % arrPrimos[i] == 0) {
				System.out.print(" -->");
				mmc *= arrPrimos[i];
			}
			
			if(arrPrimos[i] < 10) {
				System.out.printf("\t[%d]  | (%d, %d)\n", arrPrimos[i], n1, n2);
			} else {
				System.out.printf("\t[%d] | (%d, %d)\n", arrPrimos[i], n1, n2);
			}
			
			if(n1 % arrPrimos[i] == 0 && n1 > 1) {
				n1 /= arrPrimos[i]; 
			}
			 
			if(n2 % arrPrimos[i] == 0 && n2 > 1) {
				n2 /= arrPrimos[i];
			}
			 
			if(n1 % arrPrimos[i] == 0 || n2 % arrPrimos[i] == 0) {
				i--;
			}
			
			if(n1 == 1 && n2 == 1) {
				if(arrPrimos[i] < 10) {
					System.out.printf("\t[%d]  | (%d, %d)", arrPrimos[i], n1, n2);
				} else {
					System.out.printf("\t[%d] | (%d, %d)", arrPrimos[i], n1, n2);
				}
				System.out.printf("\n\n\tMMC: %d", mmc);
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
