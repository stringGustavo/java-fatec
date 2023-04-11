import java.util.Scanner;

public class Exercicio25 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.print("25 - Crie um programa que solicite ao usuario um numero inteiro. Utilizando metodos, exiba a sequencia dos numeros perfeitos ate o numero informado.\n");
		
		Scanner scan = new Scanner(System.in);
		Scanner scanC = new Scanner(System.in);
		
		int numero;
		char opcao;
		
		do {
			do {
				System.out.print("\nDigite um numero: ");
				numero = scan.nextInt();
				
				if(numero <= 0) {
					System.out.print("Digite um valor positivo!");
				}
			} while(numero <= 0);
		
			verificarNumeroPerfeito(numero);
			
			do {
				System.out.print("\nDeseja solicitar outro numero? [S/N]:");
				opcao = scanC.next().toLowerCase().charAt(0);
			} while(opcao != 's' && opcao != 'n');
		} while(opcao != 'n');
		
		System.out.print("\nFim do Programa.");
	}
	
	static void verificarNumeroPerfeito(int num) {
		int contador = 0, soma = 0;
		
		for(int i = 1; i <= num; i++) {
			contador = 1;
			soma = 0;
			
			while(contador < i) {
				if(i % contador == 0) {
					soma += contador;
				}
				contador++;
			}
			if(soma == i) {
				System.out.printf("%d ", soma);
			}
		}
	}
}
