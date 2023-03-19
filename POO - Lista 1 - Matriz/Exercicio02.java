
public class Exercicio02 {
	
	public static void main (String[] args) {
		
		System.out.println("02 - Escreva um programa em Java para geral aleatoriamente os elementos (menor que 100) de uma matriz B de 6 linha por 3 colunas, imprimir a matriz gerada e imprimir a matriz em ordem invertida.");
		
		int[][] matriz = new int[6][3];
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
		
				matriz[i][j] = (int)(Math.random() * (99 - 1 + 1) + 1);
			}
		}
		
		System.out.println("\nMatriz: \n");
		
		for(int x = 0; x < matriz.length; x++) {

			System.out.print("\t");
			
			for(int y = 0; y < matriz[x].length; y++) {
				
				System.out.printf("%d ",matriz[x][y]);
				
				if(matriz[x][y] < 10) {
					System.out.print(" ");
				} 
			}
			System.out.println("");
		}
		
		System.out.println("\nMatriz Invertida: \n");
		
		for(int a = matriz.length - 1; a >= 0; a--) {
					
			System.out.print("\t");
			
			for(int b = matriz[a].length - 1; b >= 0; b--) {
			
				System.out.printf("%d ",matriz[a][b]);
				
				if(matriz[a][b] < 10) {
					System.out.print(" ");
				} 
			}
			System.out.println("");
		}
	}
}

