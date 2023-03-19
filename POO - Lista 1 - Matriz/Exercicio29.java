import java.util.Scanner;

public class Exercicio29 {
	
	public static void main (String[] args) {
		
		System.out.println("29 - Escreva um programa em Java para solicitar ao usuario um valor. Este valor lido sera a quantidade de elementos de um vetor. Gerar os elementos do vetor. A partir do vetor gerado, criar uma matriz, onde a quantidade de linhas sera igual a quantidade de elementos do vetor e as colunas serao os valores dos elementos do vetor mais um. Com a matriz criada, armazenar na primeira coluna de cada linha o respectivo elemento do vetor criado inicialmente e os demais elementos da linha serao formados pela sequencia de Primos. Imprimir a matriz resultante.\n");
		
		Scanner scan = new Scanner(System.in);
		int numero, contador, gerador = 0;
		
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
		
		for(int a = 0; a < matriz.length; a++) {
			
			for(int b = 0; b < matriz[a].length; b++) {
				
				while(b > 0 && matriz[a][b] == 0) {
					
					contador = 0;
					gerador++;
					for (int i = 1; i <= gerador; i++) {
						
						if (gerador % i == 0)
						{				
							contador++;  
						}
					}
					
					if(contador == 2) {
						matriz[a][b] = gerador;
					}
				}
			}
			gerador = 0;
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



