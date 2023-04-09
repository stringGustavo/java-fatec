import java.util.Scanner;

public class Exercicio10 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("10 - Crie um programa que solicite ao usuario tres numeros inteiros. Atraves de um metodo, que receba esses 3 numeros como parametros de entrada, verifique e retorne o maior dos tres valores.\n");
		
		int primeiroNumero, segundoNumero, terceiroNumero;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		primeiroNumero = scan.nextInt();
		
		System.out.print("Digite outro numero: ");
		segundoNumero = scan.nextInt();
		
		System.out.print("Digite mais um numero: ");
		terceiroNumero = scan.nextInt();
		
		maiorValor3(primeiroNumero,segundoNumero,terceiroNumero);
	}
	
	static int maiorValor2 (int primeiroNumero, int segundoNumero) {
		
		int primeiroResultado = Math.max(primeiroNumero, segundoNumero);
		
		return primeiroResultado;
	}
	
	static void maiorValor3(int primeiroNumero, int segundoNumero, int terceiroNumero) {
		
		int segundoResultado = maiorValor2(primeiroNumero, segundoNumero);
		
		int maior = Math.max(segundoResultado, terceiroNumero);
		
		System.out.printf("\nO maior numero e: %d", maior);
	}
}

