import java.util.Scanner;

public class Exercicio24 {
	
	public static void main (String[] args) {
		
		System.out.println("24 - Escreva um programa em Java para solicitar ao usuario dimensoes de uma matriz. Preencher a matriz com os elementos da sequencia de Fibonacci e imprimir o resultado.\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanhoLinha, tamanhoColuna, fibonacci = 0, a = 0, b = 1;
		
		do {
			System.out.print("Digite a quantidade de Linhas: ");
			tamanhoLinha = scan.nextInt();
				
		} while(tamanhoLinha < 1);
		
		do {
			System.out.print("\nDigite a quantidade de Colunas da Matriz: ");
			tamanhoColuna = scan.nextInt();
			
		} while(tamanhoColuna < 1);
	
		int[][] matrizFibonacci = new int[tamanhoLinha][tamanhoColuna];
		
		System.out.print("\nMatriz: \n");
		
		for(int i = 0; i < matrizFibonacci.length; i++) {
			
			System.out.print("\t");
			
			for(int j = 0; j < matrizFibonacci[i].length; j++) {
				
				matrizFibonacci[i][j] = a;
				
				fibonacci = a + b;
				a = b;
				b = fibonacci;
				
				System.out.printf("%d   ", matrizFibonacci[i][j]);
				
				if(matrizFibonacci[i][j] < 1000) {
					System.out.print(" ");
					
					if(matrizFibonacci[i][j] < 100) {
						System.out.print(" ");
						
						if(matrizFibonacci[i][j] < 10) {
							System.out.print(" ");
						}		
					}
				}
			}
			System.out.println("");
		}
	}
}



