import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		
		System.out.println("04 - Escreva um programa em Java para ler uma matriz D de dimensao N x M, onde N e M nao poderem ser menores que um. Gerar os elementos aleatoriamente. O usuario deve informar a dimensao (linha e coluna) e um valor maximo para elementos aleatorios. O programa efetuar todas as validacoes. Lembre-se de aproveitar os recursos da linguagem Java para facilitar as validacoes.\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanhoLinha, tamanhoColuna, maximoAleatorio;
		
		System.out.println("Entre com a dimensao da matriz:\n");
		
		do {
				
			System.out.print("Linhas: ");
			tamanhoLinha = scan.nextInt();
				
		} while(tamanhoLinha < 1);
		
		do {
			
			System.out.print("Colunas: ");
			tamanhoColuna = scan.nextInt();
			
		} while(tamanhoColuna < 1);
		
		System.out.print("\nDigite o valor maximo para a geracao de numeros aleatorios: ");
		maximoAleatorio = scan.nextInt();
		
		int[][] matriz = new int[tamanhoLinha][tamanhoColuna];
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = (int)(Math.random() * (maximoAleatorio - 1 + 1) + 1);
			}
		}
		
		System.out.println("\nMatriz: ");
		
		for(int x = 0; x < matriz.length; x++) {
			
			for(int y = 0; y < matriz[x].length; y++) {
				
				if(y == 0) {
					System.out.print("\t");
				}
				
				System.out.printf("%d  ", matriz[x][y]);
				
				if(matriz[x][y] < 10) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
