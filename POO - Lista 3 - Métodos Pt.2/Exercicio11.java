import java.util.Scanner;

public class Exercicio11 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("11 - Crie um programa que solicite ao usuario numeros inteiros. A cada numero inserido, perguntar ao usuario se ele deseja informar outro numero. Atraves de um metodo, verifique e retorne o menor dos valores.\n");

		int numero, contador = 1, menor = Integer.MAX_VALUE;
		char ch;

		Scanner scan = new Scanner(System.in);
		Scanner scanC = new Scanner(System.in);
	
		do {
			
			System.out.printf("(%d) - Digite um numero: ", contador);
			numero = scan.nextInt();
			contador++;
			
			if(menor > numero) {
				menor = numero;
			}
			
			do {
				System.out.print("Deseja inserir outro numero? [S/N]: ");
				ch = scanC.next().toLowerCase().charAt(0);
				
			} while(ch != 's' && ch != 'n');
			
		} while( ch == 's');
		
		verificarMenor(menor);
	}
	
	public static void verificarMenor(int menor){
		System.out.printf("\nO menor numero: %d", menor);
	}
}

