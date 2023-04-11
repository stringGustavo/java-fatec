import java.util.Scanner;

public class Exercicio18 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("18 - Crie um programa que imprima na tela todos os numeros primos de 1 até 1000. Para tanto, crie um metodo que receba um numero inteiro como parametro de entrada e verifique se este numero e primo ou nao retornando um boolean como resposta.");
		
		System.out.println("\nPrimos: ");
		for(int i = 0; i <= 1000; i++) {
			if(verificarPrimo(i)) {
				System.out.printf("%d ", i);
			}
		}
	}
	
	static boolean verificarPrimo(int numero) {
		int contador = 0;
		
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				contador++;
			}
		}
		
		return (contador == 2);
	}
}
