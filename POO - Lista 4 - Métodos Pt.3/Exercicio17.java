import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Exercicio17 {
	
	//Gustavo Sant'Anna dos Santos;
	
	public static void main (String[] args) {
		
		System.out.println("17 - Um professor, muito legal, fez 3 provas durante um semestre, mas so vai levar em conta as duas notas mais altas para calcular a media. Crie um programa que solicite ao usuario o valor double das 3 notas, mostre como seria a media com essas 3 provas, a media com as 2 notas mais altas, bem como a nota mais alta e a nota mais baixa. Tente criar apenas um metodo para retornar essas medias. Este método devera receber as 3 notas como parametros de entrada e retornar os valores solicitados. As notas devem ser de zero a dez e qualquer valor diferente devera ser desconsiderado, assumindo zero.");
		
		Scanner scan = new Scanner(System.in);
		
		char c = (char)176;
		Double[] notas = new Double[3];
	
		for(int i = 0 ; i < 3; i++) {
			
			System.out.printf("\nDigite a %d%c nota: ", i+1, c);
			notas[i] = scan.nextDouble();
			
			if(notas[i] < 0 || notas[i] > 10) {
				notas[i] = 0.0;
			}
		}
		
		scan.close();		
		ordenarNotas(notas);
	}
	
	static void estabelecerMedias(double n1, double n2, double n3) {
		double mediaNormal = (n1 + n2 + n3) / 3;
		double mediaMaioresNotas = (n1 + n2) / 2;
		
		System.out.printf("\nMedia com as 3 notas: %.2f", mediaNormal);
		System.out.printf("\nMedia com as 2 maiores notas: %.2f", mediaMaioresNotas);
	}
	
	static void ordenarNotas(Double[] arr) {
		Arrays.sort(arr, Comparator.reverseOrder());
		
		double notaMaior = arr[0];
		double notaMedia = arr[1];
		double notaMenor = arr[2];
		
		estabelecerMedias(notaMaior,notaMedia,notaMenor);
		
		System.out.printf("\n\nMaior Nota: %.2f\nNota Media: %.2f\nMenor Nota: %.2f", notaMaior, notaMedia, notaMenor);
	}
}
