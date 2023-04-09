import java.util.Scanner;
public class Exercicio09 {
	
	public static void main (String[] args) {
		
		//Gustavo Sant'Anna dos Santos;
		
		System.out.println("09 - Crie um programa que solicite ao usuario dois numeros inteiros. Atraves de um metodo, que receba esses 2 numeros como parametros de entrada, verifique e retorne o menor dos dois valores.\n");
		
		int primeiroNumero, segundoNumero;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		primeiroNumero = scan.nextInt();
		
		System.out.print("Digite um numero: ");
		segundoNumero = scan.nextInt();
		
		menorValor(primeiroNumero,segundoNumero);
	}
	
	static void menorValor (int primeiroNumero, int segundoNumero) {
		
		System.out.printf("O menor numero digitado foi: %d", Math.min(primeiroNumero, segundoNumero));
	}
}

