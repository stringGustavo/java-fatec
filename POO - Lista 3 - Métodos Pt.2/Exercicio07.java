import java.util.Scanner;

public class Exercicio07 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("07 - Crie um programa que solicite ao usuario dois numeros inteiros. Atraves de um metodo, que receba esses 2 numeros como parametros de entrada, verifique e retorne o menor dos dois valores.\n");
		
		int primeiroNumero, segundoNumero;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		primeiroNumero = scan.nextInt();
		
		System.out.print("Digite um numero: ");
		segundoNumero = scan.nextInt();
		
		menorValor(primeiroNumero,segundoNumero);
	}
	
	static void menorValor (int primeiroNumero, int segundoNumero) {
		int menor = Integer.MAX_VALUE;
		
		if(menor > primeiroNumero) {
			menor = primeiroNumero;
		}
		
		if(menor > segundoNumero) {
			menor = segundoNumero;
		}
		
		System.out.printf("O menor numero digitado foi: %d", menor);
	}
}

