import java.util.Scanner;

public class Exercicio03 {
	
	public static void main (String[] args) {
		
		//Gustavo Sant'Anna dos Santos;
		
		System.out.print("03 - Com base nos dois exercicios anteriores, crie programa que solicite ao usuario um numero tipo double. Apos verifique se o numero e positivo, negativo ou zero. As verificacoes devem ser feitas atraves de metodos.\n");
		
		double numero;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nDigite um numero: ");
		numero = scan.nextInt();
		
		if(isZero(numero)) {
			
			System.out.print("\nO numero e zero.");
		} else {
			
			System.out.println("\nO numero nao e zero.");	
			
			if(isPositivo(numero)) {
				
				System.out.print("O numero digitado e positivo.");
			} else {
				
				System.out.print("O numero digitado e negativo.");
			}
		}
	}
	
	static boolean isZero(double numero) {
			
		return (numero == 0);
	}
	
	static boolean isPositivo(double numero) {
			
		return (numero > 0);
	}
}

