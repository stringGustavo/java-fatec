import java.util.Scanner;

public class Exercicio18 {
	
	public static void main (String[] args) {
		
		System.out.println("18 - Escreva um programa em Java para gerar uma matriz quadrada R de dimensao N. Imprimir os elementos da acima da diagonal principal (inclusa) e acima da diagonal secundaria (inclusa).\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanho;
		
		do {
			System.out.print("Entre com a dimensao da matriz: ");
			tamanho = scan.nextInt();
				
		} while(tamanho < 1);
		
		int[][] matriz = new int[tamanho][tamanho];
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = (int)(Math.random() * (99 - 10 + 1) + 10
				);
			}
		}
		
		System.out.println("\nMatriz: ");
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				if(j == 0) {
					System.out.print("\t");
				}
				
				if(j > i || i + j < tamanho - 1) {
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
		
		System.out.print("\nAcima da Diagonal Principal: ");
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				if(j > i) {
					System.out.printf("%d ", matriz[i][j]);
				}
			}
		}
		
		System.out.print("\n\nAcima da Diagonal Secundaria: ");
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				if(i + j < tamanho - 1) {
					System.out.printf("%d ", matriz[i][j]);
				}
			}
		}
	}
}
