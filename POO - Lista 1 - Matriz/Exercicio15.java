import java.util.Scanner;

public class Exercicio15 {
	
	public static void main (String[] args) {
		
		System.out.println("15 - Escreva um programa em Java para gerar uma matriz quadrada O de dimensao N. Imprimir os elementos da abaixo da diagonal principal (inclusa) e acima da diagonal secundaria (inclusa).\n");
		
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
				
				if(i + j < tamanho - 1 || i > j) {
					System.out.printf("[%d]  ", matriz[i][j]);
				} else {
					System.out.printf(" %d   ", matriz[i][j]);
				}
				
				if(matriz[i][j] < 10) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		System.out.print("\nAcima da Diagonal Secundaria: ");
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				if(i + j < tamanho - 1) {
					System.out.printf("%d ", matriz[i][j]);
				}
			}
		}
		
		System.out.print("\n\nAbaixo da Diagonal Principal: ");
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				if(i > j) {
					System.out.printf("%d ", matriz[i][j]);
				}
			}
		}
	}
}
