import java.util.Scanner;
import java.util.Arrays;

public class Exercicio27 {
	
	public static void main (String[] args) {
		
		System.out.println("27 - Escreva um programa em Java para gerar uma matriz X (N x M). Ordenar as linhas da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanhoLinha,tamanhoColuna;
		
		do {
			System.out.print("Quantidade de Linhas: ");
			tamanhoLinha = scan.nextInt();
				
		} while(tamanhoLinha < 1);
		
		do {
			System.out.print("Quantidade de Colunas: ");
			tamanhoColuna = scan.nextInt();
				
		} while(tamanhoColuna < 1);
	
		int[][] matriz = new int[tamanhoLinha][tamanhoColuna];
		int[] vetorOrdenar = new int[tamanhoColuna];
		
		System.out.println("\nMatriz:\n");
		
		for(int i = 0; i < matriz.length; i++) {
			
			System.out.print("\t");
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = (int)(Math.random() * (99 - 10 + 1) + 10);
				
				System.out.printf("%d  ",matriz[i][j]);
			}
			System.out.println("");
		}
		
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				vetorOrdenar[j] = matriz[i][j];
			}
			
			for(int a = 0; a < matriz[i].length; a++) {
					
				Arrays.sort(vetorOrdenar);
				matriz[i][a] = vetorOrdenar[a];
			}	
		}
		
		System.out.println("\nMatriz de Linhas Crescentes:\n");
		
		for(int i = 0; i < matriz.length; i++) {
			
			System.out.print("\t");
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				System.out.printf("%d  ",matriz[i][j]);
			}
			System.out.println("");
		}
	}
}



