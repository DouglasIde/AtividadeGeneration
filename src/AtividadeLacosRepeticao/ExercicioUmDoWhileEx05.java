package AtividadeLacosRepeticao;

import java.util.Scanner;

public class ExercicioUmDoWhileEx05 {
	public static void main(String[] args) {

		/*
		 * Leia números Inteiros via teclado até que o número 0 seja digitado
		 * Mostre na tela a soma de todos os números digitados que sejam POSITIVOS
		 * 
		 * */

		int numero, soma = 0;

		Scanner leitura = new Scanner(System.in);

		do {
			System.out.println("Digite um número para ser somado: ");
			numero = leitura.nextInt();

			if(numero > 0) {
				soma += numero;
			}
			
		} while(numero != 0);
		System.out.printf("A soma dos números positivos é: %d", soma);
	}
}
