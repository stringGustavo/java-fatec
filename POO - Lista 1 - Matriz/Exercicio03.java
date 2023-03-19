import java.util.Scanner;

public class Exercicio03 {
	
	public static void main (String[] args) {
		
		System.out.println("03 - Escreva um programa em Java para ler uma matriz C quadrada de dimensao N, onde N e menor ou igual a 20 e imprimir seus elementos. O usuario deve informar o numero o tamanho da matriz quadrada (dimensao) e os elementos podem ser gerados aleatoriamente (menor que 100).\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanho;
		
		do {
			
			System.out.print("Digite a dimensao da matriz: ");
			tamanho = scan.nextInt();
			
		} while(tamanho > 20);
		
		int[][] matriz = new int[tamanho][tamanho];
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = (int)(Math.random() * (99 - 1 + 1) + 1);
			}
		}
		
		System.out.println("\nMatriz: ");
		
		for(int x = 0; x < matriz.length; x++) {
			
			for(int y = 0; y < matriz[x].length; y++) {
				
				if(y == 0) {
					
					System.out.print("\t");
				}
				
				System.out.printf("%d ",matriz[x][y]);
				
				if(matriz[x][y] < 10) {
					
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}

