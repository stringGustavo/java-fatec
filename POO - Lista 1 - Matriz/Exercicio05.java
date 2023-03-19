import java.util.Scanner;

public class Exercicio05 {
	
	public static void main (String[] args) {
		
		System.out.println("05 - Escreva um programa em Java para ler 2 matrizes N x M (definido pelo usuario) e calcular a soma entre elas gerando uma terceira matriz.\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanhoLinha, tamanhoColuna;
		
		System.out.println("Entre com a dimensao da matriz:\n");
		
		do {
				
			System.out.print("Linhas: ");
			tamanhoLinha = scan.nextInt();
				
		} while(tamanhoLinha < 1);
		
		do {
			
			System.out.print("Colunas: ");
			tamanhoColuna = scan.nextInt();
			
		} while(tamanhoColuna < 1);
		
		int[][] primeiraMatriz = new int[tamanhoLinha][tamanhoColuna];
		int[][] segundaMatriz = new int[tamanhoLinha][tamanhoColuna];
		int[][] somaMatrizes = new int[tamanhoLinha][tamanhoColuna];
		
		System.out.println("");
		
		for(int i = 0; i < primeiraMatriz.length; i++) {
			
			for(int j = 0; j < primeiraMatriz[i].length; j++) {
				
				System.out.printf("Matriz 1 - [%d,%d]: ", i, j);
				primeiraMatriz[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("");
		
		for(int i = 0; i < segundaMatriz.length; i++) {
			
			for(int j = 0; j < segundaMatriz[i].length; j++) {
				
				System.out.printf("Matriz 2 - [%d,%d]: ", i, j);
				segundaMatriz[i][j] = scan.nextInt();
			}
		}
		
		for(int x = 0; x < somaMatrizes.length; x++) {
			
			for(int y = 0; y < somaMatrizes[x].length; y++) {
				
				somaMatrizes[x][y] = primeiraMatriz[x][y] + segundaMatriz[x][y];
			}
		}
		
		System.out.println("\nSoma das Matrizes: \n");
		
		for(int x = 0; x <  somaMatrizes.length; x++) {
			
			for(int y = 0; y < somaMatrizes[x].length; y++) {
				
				if(y == 0) {
					System.out.print("\t");
				}
				
				System.out.printf("%d ",somaMatrizes[x][y]);
				
				if(somaMatrizes[x][y] < 10) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
