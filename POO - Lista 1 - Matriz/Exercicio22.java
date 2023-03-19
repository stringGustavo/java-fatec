import java.util.Scanner;

public class Exercicio22 {
	
	public static void main (String[] args) {
		
		System.out.println("22 - Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). Gerar uma terceira matriz (N x (M+P)), sendo que para cada linha intercalar suas respectivas colunas e apresentar as tres matrizes.\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanhoLinha, tamanhoColuna, tamanhoColuna3, k = 0, l = 0, m = 0, n = 0;
		
		do {
			System.out.print("Digite a quantidade de Linhas: ");
			tamanhoLinha = scan.nextInt();
				
		} while(tamanhoLinha < 1);
		
		do {
			System.out.print("\nDigite a quantidade de Colunas: ");
			tamanhoColuna = scan.nextInt();
			
		} while(tamanhoColuna < 1);
		
		tamanhoColuna3 = tamanhoColuna + tamanhoColuna;
		
		int[][] primeiraMatriz = new int[tamanhoLinha][tamanhoColuna];
		int[][] segundaMatriz = new int[tamanhoLinha][tamanhoColuna];
		int[][] terceiraMatriz = new int[tamanhoLinha][tamanhoColuna3];
		
		
		System.out.println("\nMatriz 1: \n");
		for(int i = 0; i < primeiraMatriz.length; i++){
			
			System.out.print("\t");
			
			for(int j = 0; j < primeiraMatriz[i].length; j++) {
				
				primeiraMatriz[i][j] = (int)(Math.random() * (99 - 10 + 1) + 10);
				
				System.out.printf("%d   ", primeiraMatriz[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("\nMatriz 2: \n");
		for(int i = 0; i < segundaMatriz.length; i++){
			
			System.out.print("\t");
			
			for(int j = 0; j < segundaMatriz[i].length; j++) {
				
				segundaMatriz[i][j] = (int)(Math.random() * (99 - 10 + 1) + 10);
				
				System.out.printf("%d   ", segundaMatriz[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("\nMatriz 3: \n");
		
		for(int i = 0; i < terceiraMatriz.length; i++){
			
			System.out.print("\t");
			l = 0;
			n = 0;
			
			for(int j = 0; j < terceiraMatriz[i].length; j++) {
				
				if(j % 2 == 0) {
					terceiraMatriz[i][j] = primeiraMatriz[k][l++];
				} else {
					terceiraMatriz[i][j] = segundaMatriz[m][n++];
				}
				
				System.out.printf("%d   ", terceiraMatriz[i][j]);
			}
			
			k++;
			m++;
			System.out.println("");
		}
	}
}



