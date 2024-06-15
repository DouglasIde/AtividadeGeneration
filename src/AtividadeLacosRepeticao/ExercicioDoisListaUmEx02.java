package AtividadeLacosRepeticao;

import java.util.Scanner;

public class ExercicioDoisListaUmEx02 {
	public static void main(String[] args) {

		/*
		 * Leia 10 números inteiros via teclado
		 * Mostre na tela quantos números são PARES
		 * Mostre na tela quantos números são ÍMPARES
		 * 
		 * */

		Scanner leitura = new Scanner(System.in);

		int numerosPares = 0, numerosImpares = 0, numeros;

		for (int i = 0; i<10 ; i++) {
			System.out.println("Digite um números:");
			numeros = leitura.nextInt();
			
			if(numeros %2 == 0) {
				numerosPares++;
			} else {
				numerosImpares++;
			}
		}
		System.out.println("Total de números pares: " + numerosPares);
		System.out.println("Total de números ímpares: " + numerosImpares);
	}

}


