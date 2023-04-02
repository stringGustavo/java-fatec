import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String[] args) {
		
		//Gustavo Sant'Anna dos Santos;
		
		System.out.print("01 - Crie programa que solicite ao usuario um numero tipo double. Apos verifique se o numero e positivo ou nao. A verificacao deve ser feita atraves de um metodo que receba um valor(parametro de entrada) e informe se ele e positivo ou negativo atraves de um retorno do tipo boolean. Assuma o numero zero como positivo. Declare como: boolean isPositivo(double num).\n");
		
		double numero;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nDigite um numero: ");
		numero = scan.nextInt();
		
		if(isPositivo(numero)) {
			
			System.out.printf("\nO numero %.0f e Positivo.", numero);
		} else {
			
			System.out.printf("\nO numero %.0f e Negativo.", numero);	
		}
	}
	
	static boolean isPositivo(double numero) {
			
		return (numero >= 0);
	}
}

