import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Exercicio28 {
	
	public static void main (String[] args) {
		
		System.out.println("28 - Escreva um programa em Java para gerar uma matriz Z (N x M). Ordenar as colunas da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.\n");
		
		Scanner scan = new Scanner(System.in);
		int tamanho;
		
		do {
			System.out.print("Digite a dimensao da Matriz: ");
			tamanho = scan.nextInt();
				
		} while(tamanho < 1);
	
		int[][] matriz = new int[tamanho][tamanho];
		
		System.out.println("\nMatriz:\n");
		
		for(int i = 0; i < matriz.length; i++) {
			
			System.out.print("\t");
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = (int)(Math.random() * (99 - 10 + 1) + 10);
				
				System.out.printf("%d  ",matriz[i][j]);
			}
			System.out.println("");
		}
		
		Vector<Integer> vetorOrdenar = new Vector<>();
		
		for (int i = 0; i < matriz.length; i++) {
			
            for (int j = 0; j < matriz[i].length; j++) {
 
                vetorOrdenar.add(matriz[j][i]);
            }
            
            Collections.sort(vetorOrdenar);
            
            for (int j = 0; j < matriz.length; j++) {
 
                matriz[j][i] = vetorOrdenar.get(j);
            }
            
            vetorOrdenar.removeAll(vetorOrdenar);
		}
		
		System.out.println("\nMatriz Ordenada por Colunas:\n");
            
            for(int i = 0; i < matriz.length; i++) {
			
				System.out.print("\t");
			
				for(int j = 0; j < matriz[i].length; j++) {
				
					System.out.printf("%d  ",matriz[i][j]);
				}
				System.out.println("");
			}
	}
}
