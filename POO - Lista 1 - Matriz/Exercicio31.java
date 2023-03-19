import java.util.Scanner;

public class Exercicio31 {
	
	public static void main (String[] args) {
		
		System.out.println("31 - Escreva um programa em Java para gerar uma matriz (N x M). O usuario deve informar uma faixa de valores inteiros positivos (valor inicial e valor final). O programa deve gerar aleatoriamente os elementos da matriz, respeitando a faixa de valores fornecida pelo usuario. Ao final, imprimir a matriz resultante.\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanhoLinha, tamanhoColuna, valorInicio, valorFinal;
		
		do {
			System.out.print("Quantidade de Linhas: ");
			tamanhoLinha = scan.nextInt();
			
		} while(tamanhoLinha < 1);
		
		do {
			
			System.out.print("\nQuantidade de Colunas: ");
			tamanhoColuna = scan.nextInt();
			
		} while(tamanhoColuna < 1);
		
		System.out.print("\nInforme a faixa de valores:\n");
		
		do {
			
			System.out.print("\nValor Inicial: ");
			valorInicio = scan.nextInt();
			
		} while(valorInicio < 1);
		
		do {
			
			System.out.print("\nValor Final: ");
			valorFinal = scan.nextInt();
			
		} while(valorFinal < 1);
		
		if(valorInicio > valorFinal) {
			int aux = valorInicio;
			valorInicio = valorFinal;
			valorFinal = aux;
		}
		
		int[][] matrizAleatoria = new int[tamanhoLinha][tamanhoColuna];
		
		System.out.println("\nMatriz Aleatoria:\n");
		
		for(int i = 0; i < matrizAleatoria.length; i++) {
			
			System.out.print("\t");
			
			for(int j = 0; j < matrizAleatoria[i].length; j++) {
				
				matrizAleatoria[i][j] = (int)(Math.random() * (valorFinal - valorInicio + 1) + valorInicio);
				
				System.out.printf("%d  ", matrizAleatoria[i][j]);
				
				if(matrizAleatoria[i][j] < 10 && matrizAleatoria[i][j] >= 0) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}



