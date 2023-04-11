import java.util.Scanner;

public class Exercicio19 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("19 - Crie um programa que solicite ao usuario dois numeros inteiros. Estes, devem ser passados como parametros de entrada para um metodo que ira gerar todos os numeros primos existentes no intervalo fechado desses dois valores e retornar uma array com a resposta. O programa principal ficara com a responsabilidade de imprimir o array de primos retornado pelo metodo. O metodo deve aceitar e entender como sendo a mesma coisa passar, por exemplo, os valores 1 e 100 ou 100 e 1.");
		
		Scanner scan = new Scanner(System.in);
		
		int primo;
		
		System.out.print("\nDigite um valor para o Intervalo inicial: ");
		int intervaloInicial = scan.nextInt();
		
		System.out.print("\nDigite um valor para o Intervalo Final: ");
		int intervaloFinal = scan.nextInt();
		
		if(intervaloInicial > intervaloFinal) {
			int auxiliar = intervaloInicial;
			intervaloInicial = intervaloFinal;
			intervaloFinal = auxiliar;
		}
		
		System.out.printf("\nPrimos entre %d e %d:\n", intervaloInicial, intervaloFinal);
		for(int i = intervaloInicial; i <= intervaloFinal; i++) {
			if(verificarPrimo(i)) {
				System.out.printf("%d ", i);
			}
		}
	}
	
	static boolean verificarPrimo(int n1) {
		int contador = 0;
		
		for(int i = 1; i <= n1; i++) {
			if(n1 % i == 0) {
				contador++;
			}
		}
		
		return (contador == 2);
	}
}
