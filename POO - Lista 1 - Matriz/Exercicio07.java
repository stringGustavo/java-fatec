import java.util.Scanner;

public class Exercicio07 {
	
	public static void main (String[] args) {
		
		System.out.println("07 - Escreva um programa em Java para gerar uma matriz E de dimensao N x M, determinar e imprimir o maior e o menor elemento deste conjunto, informando a posicao dos mesmos.\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanhoLinha, tamanhoColuna, maior = 0, menor = Integer.MAX_VALUE;
		
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
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = (int)(Math.random() * (99 - 1 + 1) + 1);
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
				
				if(maior < matriz[x][y]) {
					maior = matriz[x][y];
				}
				
				if(menor > matriz[x][y]) {
					menor = matriz[x][y];
				}
			}
			
			System.out.println("");
		}
		
		System.out.printf("\nMaior numero: %d\n\nMenor numero: %d\n", maior, menor);
		
		System.out.print("\nPosicao do Maior: ");
		for(int a = 0; a < matriz.length; a++) {
			
			for(int b = 0; b < matriz[a].length; b++) {
				
				if(matriz[a][b] == maior) {
					System.out.printf("[%d,%d] ",a ,b);
				}
			}
		}
		System.out.println("");
		
		System.out.print("\nPosicao do Menor: ");
		for(int a = 0; a < matriz.length; a++) {
			
			for(int b = 0; b < matriz[a].length; b++) {
				
				if(matriz[a][b] == menor) {
					System.out.printf("[%d,%d] ",a ,b);
				}
			}
		}
	}
}
