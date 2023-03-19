import java.util.Scanner;

public class Exercicio06 {
	
	public static void main (String[] args) {
		
		System.out.println("06 - Escreva um programa em Java para gerar aleatoriamente (menor que 25) uma matriz N x M de dimensao definidas pelo usuario. Solicitar ao usuario um valor. Imprimir a matriz gerada. Informar se o valor digitado existe na matriz, indicando a posicao (linha X coluna) e no final a quantidade de ocorrencias.\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanhoLinha, tamanhoColuna, numeroDigitado, contador = 0;
		
		System.out.println("Entre com a dimensao da matriz:\n");
		
		do {
				
			System.out.print("Linhas: ");
			tamanhoLinha = scan.nextInt();
				
		} while(tamanhoLinha < 1);
		
		do {
			
			System.out.print("Colunas: ");
			tamanhoColuna = scan.nextInt();
			
		} while(tamanhoColuna < 1);
		
		int[][] matriz = new int[tamanhoLinha][tamanhoColuna];
		
		System.out.print("\nDigite um numero: ");
		numeroDigitado = scan.nextInt();
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = (int)(Math.random() * (24 - 1 + 1) + 1);
			}
		}
		
		System.out.println("\nMatriz: ");
		
		for(int x = 0; x < matriz.length; x++) {
			
			for(int y = 0; y < matriz[x].length; y++) {
				
				if(y == 0) {
					System.out.print("\t");
				}
				
				System.out.printf("%d   ",matriz[x][y]);
				
				if(matriz[x][y] < 10) {
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
		
		for(int a = 0; a < matriz.length; a++) {
			
			for(int b = 0; b < matriz[a].length; b++) {
				
				if(matriz[a][b] == numeroDigitado) {
					
					if(contador < 1) {
						System.out.printf("\nO numero digitado ( %d ) existe na posicao: ", numeroDigitado);	
					}
					
					contador++;
					System.out.printf("[%d,%d] ", a, b);
				}
			}
		}
		if(contador < 1) {
			System.out.printf("\nO numero digitado ( %d ) nao existe na matriz.", numeroDigitado);	
		}
		
		System.out.printf("\n\nOcorrencias do numero digitado: %d.", contador);
	}
}
