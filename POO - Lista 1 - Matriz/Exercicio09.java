import java.util.Scanner;

public class Exercicio09 {
	
	public static void main (String[] args) {
		
		System.out.println("09 - Escreva um programa em Java para gerar uma matriz quadrada G de dimensao N. Imprimir os elementos da diagonal principal (linha = coluna).\n");
		
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
				
				if(i == j) {
					System.out.printf("[%d]  ", matriz[i][j]);
				} else {
					System.out.printf(" %d   ", matriz[i][j]);
				}
			}
			System.out.println("");
		}
		
		System.out.print("\nDiagonal Principal: ");
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				if(i == j) {
					System.out.printf("%d ", matriz[i][j]);
				}
			}
		}
	}
}
