import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String[] args) {
		
		System.out.println("10 - Escreva um programa em Java para gerar uma matriz quadrada H de dimensao N. Imprimir os elementos da diagonal secundaria (linha + coluna = dimensao + 1).\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanho;
		
		do {
			System.out.print("Entre com a dimensao da matriz: ");
			tamanho = scan.nextInt();
				
		} while(tamanho < 1);
		
		int[][] matriz = new int[tamanho][tamanho];
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = (int)(Math.random() * (99 - 10 + 1) + 10);
			}
		}
		
		System.out.println("\nMatriz: ");
		
		for(int i = 0; i < matriz.length; i++) {
			
			System.out.print("\t");
					
			for(int j = 0; j < matriz[i].length; j++) {
				
				if(i + j == tamanho - 1) {
					System.out.printf("[%d]  ", matriz[i][j]);
				} else {
					System.out.printf(" %d   ", matriz[i][j]);
				}
			}
			System.out.println("");
		}
		
		System.out.print("\nDiagonal Secundaria: ");
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				if(i + j == tamanho - 1) {
					System.out.printf("%d ", matriz[i][j]);
				}
			}
		}
	}
}
