import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[4][5];
		
		System.out.println("Digite os Elementos da matriz: ");
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				System.out.printf("Elemento [%d,%d]: ",i, j);
				matriz[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("\nMatriz: ");
		
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
	}
}

