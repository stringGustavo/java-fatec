import java.util.Scanner;

public class Exercicio08 {
	
	public static void main (String[] args) {
		
		System.out.println("08 - Escreva um programa em Java para gerar uma matriz F (N x M). Criar os vetores IMPAR e PAR com a quantidade de elementos (impares / pares) da matriz. Imprimir a matriz e os vetores. Validar para caso nao haja uma das duas possibilidades (sem elementos pares ou impares).\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanhoLinha, tamanhoColuna, contadorPar = 0, contadorImpar = 0, contadorVetorPar = 0, contadorVetorImpar = 0;
		
		System.out.println("Entre com a dimensao da matriz:\n");
		
		do {
				
			System.out.print("Linhas: ");
			tamanhoLinha = scan.nextInt();
				
		} while(tamanhoLinha < 1);
		
		do {
			
			System.out.print("Colunas: ");
			tamanhoColuna = scan.nextInt();
			
		} while(tamanhoColuna < 1);
		
		int[][] matriz = new int[tamanhoLinha][tamanhoColuna];
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)(Math.random() * (99 - 1 + 1) + 1);
				
				if(matriz[i][j] % 2 == 0) {
					contadorPar++;
				} else {
					contadorImpar++;
				}
			}
		}
		
		System.out.println("\nMatriz: ");
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				if(j == 0) {
					System.out.print("\t");
				}
				
				System.out.printf("%d   ", matriz[i][j]);
				
				if(matriz[i][j] < 10) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		int[] vetorPar = new int[contadorPar];
		int[] vetorImpar = new int[contadorImpar];
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				if(matriz[i][j] % 2 == 0) {
					vetorPar[contadorVetorPar] = matriz[i][j];
					contadorVetorPar++;
				} else {
					vetorImpar[contadorVetorImpar] = matriz[i][j];
					contadorVetorImpar++;
				}
			}
		}
		
		
		System.out.print("\nElementos Pares: ");
		for(int x = 0; x < vetorPar.length; x++) {
			
			System.out.printf("%d ", vetorPar[x]);
			
		}
		
		System.out.print("\nElementos Impares: ");
		for(int y = 0; y < vetorImpar.length; y++) {
			
			System.out.printf("%d ", vetorImpar[y]);
			
		}
	}
}
