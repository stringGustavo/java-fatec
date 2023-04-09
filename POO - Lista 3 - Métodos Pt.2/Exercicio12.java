import java.util.Scanner;

public class Exercicio12 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("12 - Crie um programa que pergunte ao usuario se ele deseja lancar/jogar um dado. Por meio de um metodo chamado dado(), retorne, atraves de sorteio aleatorio, um numero de 1 ate 6. O programa deve ser executado enquanto o usuario quiser continuar jogando o dado.");

		char ch;
		Scanner scanC = new Scanner(System.in);
		
		do {
			do {
				System.out.print("\n\nDeseja jogar o dado? [S/N]: ");
				ch = scanC.next().toLowerCase().charAt(0);
			} while(ch != 's' && ch != 'n');
			
			if(ch == 's') {
				jogarDado();
			}
			
		} while(ch == 's');
	}
	
	public static void jogarDado() {
		int dado = (int)(Math.random() * (6 - 1 + 1) + 1);
		char circulo = (char)2;
		
		System.out.printf("\nResultado: %d\n\n", dado);
		
		if(dado == 1) {
			System.out.printf("\t/-----------\\\n\t|           |\n\t|           |\n\t|     %c     |\n\t|           |\n\t|           |\n\t\\-----------/", circulo);
		}
		else if(dado == 2) {
			System.out.printf("\t/-----------\\\n\t| %c         |\n\t|           |\n\t|           |\n\t|           |\n\t|         %c |\n\t\\-----------/", circulo, circulo);
		}
		else if(dado == 3) {
			System.out.printf("\t/-----------\\\n\t| %c         |\n\t|           |\n\t|     %c     |\n\t|           |\n\t|         %c |\n\t\\-----------/", circulo, circulo, circulo);
		}
		else if(dado == 4) {
			System.out.printf("\t/-----------\\\n\t| %c       %c |\n\t|           |\n\t|           |\n\t|           |\n\t| %c       %c |\n\t\\-----------/", circulo, circulo, circulo, circulo);
		}
		else if(dado == 5) {
			System.out.printf("\t/-----------\\\n\t| %c       %c |\n\t|           |\n\t|     %c     |\n\t|           |\n\t| %c       %c |\n\t\\-----------/", circulo, circulo, circulo, circulo, circulo);
		}
		else {
			System.out.printf("\t/-----------\\\n\t| %c       %c |\n\t|           |\n\t| %c       %c |\n\t|           |\n\t| %c       %c |\n\t\\-----------/", circulo, circulo, circulo, circulo, circulo, circulo);
		}
	}
}

