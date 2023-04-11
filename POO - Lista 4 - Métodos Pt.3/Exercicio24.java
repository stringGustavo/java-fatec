import java.util.Scanner;

public class Exercicio24 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.print("24 - Crie um programa que solicite ao usuario um numero inteiro. Atraves de um metodo que receba esse numero inteiro como parametro de entrada, verifique e retorne um valor boolean, que indicara, caso true que ele e um numero perfeito, caso false, que não e.\n");
		
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
		
			if(verificarNumeroPerfeito(numero)) {
				System.out.printf("\nO numero %d e perfeito.\n", numero);
			} else {
				System.out.printf("\nO numero %d nao e perfeito.\n", numero);
			}
			
			do {
				System.out.print("\nDeseja solicitar outro numero? [S/N]:");
				opcao = scanC.next().toLowerCase().charAt(0);
			} while(opcao != 's' && opcao != 'n');
		} while(opcao != 'n');
		
		System.out.print("\nFim do Programa.");
	}
	
	static boolean verificarNumeroPerfeito(int num) {
		int contador = 1, soma = 0;
		
		while(contador < num) {
			if(num % contador == 0) {
				soma += contador;
			}
			contador++;
		}
		
		return (soma == num);
	}
}
