import java.util.Scanner;

public class Exercicio27 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.print("27 - Crie um programa que solicite ao usuario um numero inteiro. Atraves de um metodo que receba esse numero inteiro como parametro de entrada, inverta digito-a-digito e retorne um valor inteiro com o numero invertido.\n");
		
		Scanner scan = new Scanner(System.in);
		Scanner scanC = new Scanner(System.in);
		
		char opcao;
		long numero, max = Long.MAX_VALUE;
		
		System.out.printf("\nNumero maximo: %d\n", max);
		
		do {
			System.out.print("\nDigite um numero para inverter: ");
			numero = scan.nextLong();
			
			inverterDigitos(numero);
		
			do {
				System.out.print("\nDeseja inserir outro numero? [S/N]: ");
				opcao = scanC.next().toLowerCase().charAt(0);
			} while(opcao != 'n' && opcao != 's');
		} while(opcao != 'n');
		
		System.out.print("\nFim do Programa.");
	}
	
	static void inverterDigitos(long num) {
		long modulo = 0, inversor = 0, numCopia = num;
		boolean negativo;
		
		if(num < 0) {
			negativo = true;
			num *= -1;
		} else {
			negativo = false;
		}		
		
		while(num > 0) {
			modulo = num % 10;
			
			inversor = (inversor * 10) + modulo;
			
			num /= 10;
		}
		
		if(negativo) {
			inversor *= -1;
			System.out.printf("\n\t%d | %d\n", numCopia, inversor);
		} else {
			System.out.printf("\n\t%d | %d\n", numCopia, inversor);	
		}
	}
}
