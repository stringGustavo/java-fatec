import java.util.Scanner;

public class Exercicio13 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("12 - Utilizando o metodo dado(), criado no exercicio anterior, lance o dado 1 milhao de vezes. Conte quantas vezes cada numero saiu. A probabilidade deu certo? Ou seja, a porcentagem dos numeros foi parecida?");

		int numeroGerado = 0, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0, contador6 = 0;

		for(int i = 0; i < 1000000; i++) {
					
			numeroGerado = jogarDado();
					
			if(numeroGerado == 1) {
				contador1++;
			} else if(numeroGerado == 2) {
				contador2++;
			} else if(numeroGerado == 3) {
				contador3++;
			} else if(numeroGerado == 4) {
				contador4++;
			} else if(numeroGerado == 5) {
				contador5++;
			} else {
				contador6++;
			}
		}
		
		System.out.printf("\nCaiu 1: %d Vezes; - %.3f%%\nCaiu 2: %d Vezes; - %.3f%%", contador1, gerarPorcentagem(contador1), contador2, gerarPorcentagem(contador2));
		System.out.printf("\nCaiu 3: %d Vezes; - %.3f%%\nCaiu 4: %d Vezes; - %.3f%%", contador3, gerarPorcentagem(contador3), contador4, gerarPorcentagem(contador4));
		System.out.printf("\nCaiu 5: %d Vezes; - %.3f%%\nCaiu 6: %d Vezes; - %.3f%%", contador5, gerarPorcentagem(contador5), contador6, gerarPorcentagem(contador6));
	}	
	
	static double gerarPorcentagem(int numero) {
		double porcentagem = ((double)numero / 1000000) * 100;
		
		return porcentagem;
	}
	
	static int jogarDado() {
		int dado = (int)(Math.random() * 6);
				
		return dado;
	}
}

