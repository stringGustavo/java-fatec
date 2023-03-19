import java.util.Scanner;

public class Exercicio21 {
	
	public static void main (String[] args) {
		
		System.out.println("21 - Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). Gerar uma terceira matriz (N x (M+P)), sendo que para cada linha concatenar suas respectivas colunas e apresentar as tres matrizes.\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanhoLinha, tamanhoColuna1, tamanhoColuna2, tamanhoColuna3;
		
		do {
			System.out.print("Digite a quantidade de Linhas: ");
			tamanhoLinha = scan.nextInt();
				
		} while(tamanhoLinha < 1);
		
		do {
			System.out.print("\nDigite a quantidade de Colunas da Matriz 1: ");
			tamanhoColuna1 = scan.nextInt();
			
		} while(tamanhoColuna1 < 1);
		
		do {
			System.out.print("\nDigite a quantidade de Colunas da Matriz 2: ");
			tamanhoColuna2 = scan.nextInt();
			
		} while(tamanhoColuna2 < 1);
		
		tamanhoColuna3 = tamanhoColuna1 + tamanhoColuna2;
		
		int[][] primeiraMatriz = new int[tamanhoLinha][tamanhoColuna1];
		int[][] segundaMatriz = new int[tamanhoLinha][tamanhoColuna2];
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
			
			for(int j = 0; j < terceiraMatriz[i].length; j++) {
				
				if(j < tamanhoColuna1) {
					terceiraMatriz[i][j] = primeiraMatriz[i][j];
				}
				
				if(j >= tamanhoColuna1) {
					terceiraMatriz[i][j] = segundaMatriz[i][j - tamanhoColuna1];
				}
				
				System.out.printf("%d   ", terceiraMatriz[i][j]);
			}
			System.out.println("");
		}
	}
}



