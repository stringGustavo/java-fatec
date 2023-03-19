import java.util.Scanner;

public class Exercicio30 {
	
	public static void main (String[] args) {
		
		System.out.println("30 - Item ao exercicio anterior, mas utilizando a sequencia de Fibonacci.\n");
		
		Scanner scan = new Scanner(System.in);
		int numero, a, b, c;
		
		do {
			System.out.print("Digite um valor: ");
			numero = scan.nextInt();
			
		} while(numero < 1);
		
		int[][] matriz = new int[numero][];
		
		for(int i = 0; i < numero; i++) {
			
			int aleatorio = (int)(Math.random() * (9 - 1 + 1) + 1);
			
			matriz[i] = new int[aleatorio+1];
			
			matriz[i][0] = aleatorio;
		}
		
		for(int i = 0; i < matriz.length; i++) {
			
			a = 0;
			b = 0;
			c = 1;
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				while(j > 0 && matriz[i][j] == 0) {
					
					matriz[i][j] = b;
					
					a = b + c;
					b = c;
					c = a;
				}
			}
		}
		
		System.out.println("\nMatriz Gerada: \n");
		
		for(int i = 0; i < matriz.length; i++) {
			
			System.out.print("\t");
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				if(j == 0) {
					System.out.printf("(%d) ", matriz[i][j]);
				} else {
					System.out.printf("%d  ",matriz[i][j]);
				}
			}
			
			System.out.println("");
		}
	}
}



