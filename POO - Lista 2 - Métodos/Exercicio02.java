import java.util.Scanner;

public class Exercicio02 {
	
	public static void main (String[] args) {
		
		//Gustavo Sant'Anna dos Santos;
		
		System.out.print("02 - Crie programa que solicite ao usuario um numero tipo double. Apos verifique se o numero e zero ou nao. A verificacao deve ser feita atraves de um metodo que receba um valor (parametro de entrada) e informe se ele e zero ou nao atraves de um retorno do tipo boolean. Declare como: boolean isZero ( double num ).\n");
		
		double numero;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nDigite um numero: ");
		numero = scan.nextInt();
		
		if(isZero(numero)) {
			
			System.out.print("\nO numero e zero.");
		} else {
			
			System.out.printf("\nO numero nao é zero.");	
		}
	}
	
	static boolean isZero(double numero) {
			
		return (numero == 0);
	}
}

