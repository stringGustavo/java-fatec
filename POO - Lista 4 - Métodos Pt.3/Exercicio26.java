import java.util.Scanner;

public class Exercicio26 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.print("26 - ===Desafio!!!=== Crie um programa que solicite ao usuario um numero inteiro, que representara a quantidade de numeros inteiros que serao digitados em seguida e armazenados em um array. Atraves de um metodo que receba esse array de numeros inteiros como parametro de entrada. Este metodo devera retornar, apenas, os numeros perfeitos existentes no conjunto recebido.\n");
		
		Scanner scan = new Scanner(System.in);
		Scanner scanC = new Scanner(System.in);
		
		char opcao, simbolo = (char)176;
		int quantidadeTermos;
		
		do {
			do {
				System.out.print("\nDigite a quantidade de termos: ");
				quantidadeTermos = scan.nextInt();
				
				if(quantidadeTermos <= 0) {
					System.out.print("Valor invalido. Digite um valor positivo.");
				}
			} while(quantidadeTermos <= 0);
			
			long[] numeros = new long[quantidadeTermos];
			
			for(int i = 0; i < numeros.length; i++) {
				System.out.printf("\nDigite o %d%c numero: ", i+1, simbolo);
				numeros[i] = scan.nextLong();
			}
			
			verificarNumeroPerfeito(numeros);
			
			do {
				System.out.print("\n\nDeseja solicitar outros numeros? [S/N]:");
				opcao = scanC.next().toLowerCase().charAt(0);
			} while(opcao != 's' && opcao != 'n');
		} while(opcao != 'n');
		
		System.out.print("\nFim do Programa.");
	}
	
	static void verificarNumeroPerfeito(long[] nums) {
		long contador = 0, soma = 0;
		
		System.out.println("");
		for(int i = 0; i < nums.length; i++) {
			contador = 1;
			soma = 0;
			
			while(contador < nums[i]) {
				if(nums[i] % contador == 0) {
					soma += contador;
				}
				contador++;
			}
			if(soma == nums[i]) {
				System.out.printf("%d ", soma);
			}
		}
	}
}
