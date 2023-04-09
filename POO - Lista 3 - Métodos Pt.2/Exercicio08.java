import java.util.Scanner;

public class Exercicio08 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("08 - Crie um programa que solicite ao usuario dois numeros inteiros. Atraves de um metodo, que receba esses 2 numeros como parametros de entrada, verifique e retorne o maior dos dois valores.\n");
		
		int primeiroNumero, segundoNumero;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		primeiroNumero = scan.nextInt();
		
		System.out.print("Digite um numero: ");
		segundoNumero = scan.nextInt();
		
		maiorValor(primeiroNumero,segundoNumero);
	}
	
	static void maiorValor (int primeiroNumero, int segundoNumero) {
		
		System.out.printf("O maior numero digitado foi: %d", Math.max(primeiroNumero, segundoNumero));
	}
}

