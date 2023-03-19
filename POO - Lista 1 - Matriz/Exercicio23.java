import java.util.Scanner;

public class Exercicio23 {
	
	public static void main (String[] args) {
		
		System.out.println("23 - Escreva um programa em Java para solicitar ao usuario dimensoes de uma matriz. Preencher a matriz com os elementos da sequencia de Primos e imprimir o resultado.\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanhoLinha, tamanhoColuna, contador = 0, autenticador = 0;
		
		do {
			System.out.print("Digite a quantidade de Linhas: ");
			tamanhoLinha = scan.nextInt();
				
		} while(tamanhoLinha < 1);
		
		do {
			System.out.print("\nDigite a quantidade de Colunas da Matriz: ");
			tamanhoColuna = scan.nextInt();
			
		} while(tamanhoColuna < 1);
	
		int[][] matrizPrimos = new int[tamanhoLinha][tamanhoColuna];
		
		for(int i = 0; i < matrizPrimos.length; i++) {
			
			for(int j = 0; j < matrizPrimos[i].length; j++) {
				
				while(autenticador == 0) {
		
					int numero = (int)(Math.random() * (99 - 1 + 1) + 1);
			
					for(int p = 1; p <= numero; p++) {
				
						if(numero % p == 0) {
						contador++;
						}
					}
			
					if(contador == 2) {
						matrizPrimos[i][j] = numero;
						autenticador = numero;
					}
					contador = 0;
				}
					autenticador = 0;
			}
		}
		
		System.out.print("\nMatriz Primos: \n\n");
		
		for(int i = 0; i < matrizPrimos.length; i++) {
			
			System.out.print("\t");
			
			for(int j = 0; j < matrizPrimos[i].length; j++) {
				
				System.out.printf("%d  ", matrizPrimos[i][j]);
				
				if(matrizPrimos[i][j] < 10) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}



