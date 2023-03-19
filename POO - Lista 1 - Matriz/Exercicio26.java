import java.util.Scanner;

public class Exercicio26 {
	
	public static void main (String[] args) {
		
		System.out.println("26 -  Escreva um programa em Java para gerar uma matriz W (N x M). Ordene os elementos da matriz de forma decrescente e imprimir a matriz original e a matriz ordenada.\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanho;
		
		do {
			System.out.print("Digite a dimensao da Matriz: ");
			tamanho = scan.nextInt();
				
		} while(tamanho < 1);
	
		int[][] matriz = new int[tamanho][tamanho];
		
		System.out.println("\nMatriz:\n");
		
		for(int i = 0; i < matriz.length; i++) {
			
			System.out.print("\t");
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = (int)(Math.random() * (99 - 10 + 1) + 10);
				
				System.out.printf("%d   ",matriz[i][j]);
			}
			System.out.println("");
		}
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				for(int k = 0; k < matriz[j].length; k++) {
					
					for(int l = 0; l < matriz[k].length; l++) {
						
						if(matriz[i][j] > matriz[k][l]) {
							
							int temp = matriz[i][j];
							matriz[i][j] = matriz[k][l];
							matriz[k][l] = temp;
						}
					}
				}
			}
		}
		
		System.out.println("\nMatriz Decrescente:\n");
		
		for(int i = 0; i < matriz.length; i++) {
			
			System.out.print("\t");
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				System.out.printf("%d   ",matriz[i][j]);
			}
			System.out.println("");
		}
	}
}



