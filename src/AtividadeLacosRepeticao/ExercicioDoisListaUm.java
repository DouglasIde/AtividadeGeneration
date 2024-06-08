package AtividadeLacosRepeticao;

import java.util.Scanner;

public class ExercicioDoisListaUm {
	public static void main(String[] args) {

		/*
		 * Leia 10 números inteiros via teclado
		 * Mostre na tela quantos números são PARES
		 * Mostre na tela quantos números são ÍMPARES
		 * 
		 * */

		Scanner leitura = new Scanner(System.in);

		int pares,impares,numeros;

		for (int i = 0; i<10 ; i++) {
			System.out.println("Digite um números:");
			numeros = leitura.nextInt();
		}
		
		if(numeros %2 == 0 && numeros %3 == 0) {
			System.out.println("Total de números pares: " + numeros);
		}
	}

}


