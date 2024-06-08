package AtividadesVetoresMatrizes;

import java.util.Scanner;

public class ExercicioUmMatriz {
	public static void main(String[] args) {

		/* 
		 * Elabora uma matriz 3x3 de números inteiros
		 * Mostre TODOS os elementos da Diagonal Principal
		 * Mostre TODOS elementos da Diagonal secundária
		 * A soma de TODOS os elementos da Diagonal Principal
		 * A soma de TODOS os elementos da Diagonal Secundária
		 * 
		 * */
		
		Scanner leitura = new Scanner(System.in);
		
		String diagonalPrincipal = "", diagonalSecundaria = ""; // Por que é o tipo String??
		int somaPrincipal = 0; 
		int somaSecundaria = 0;
		
		int[][] matrizNumeros = new int[3][3];
		
		for(int i = 0; i < 3; i++) { // i = indiceLinha
			for(int j = 0; j < 3; j++){ // j = indiceColunas
				System.out.println("Digite o número da posição: (" + i + "," + j + "): ");
				matrizNumeros[i][j] = leitura.nextInt();
			}
		}
		
		for(int i = 0; i < matrizNumeros.length; i++) {
			diagonalPrincipal += matrizNumeros[i][i] + " ";
			somaPrincipal += matrizNumeros[i][i];
		}
		
		for(int i = 0; i < matrizNumeros.length; i++) {
			diagonalSecundaria += matrizNumeros[i][matrizNumeros.length - 1 - i] + " ";
			somaSecundaria += matrizNumeros[i][matrizNumeros.length - 1 - i];
		}
		
		
		System.out.println("\nElementos da Diagonal Principal: ");
		System.out.println(diagonalPrincipal);
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		System.out.println(diagonalSecundaria);
		
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal: ");
		System.out.println(somaPrincipal);
		
		System.out.println("\nSoma dos Eelementos da Diagonal Secundária: ");
		System.out.println(somaSecundaria);
			
	}
}
