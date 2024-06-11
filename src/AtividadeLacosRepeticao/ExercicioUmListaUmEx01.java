package AtividadeLacosRepeticao;

import java.util.Scanner;

public class ExercicioUmListaUmEx01 {
	public static void main(String[] args) {

		/* 
		 * leia 2 número inteiros via teclado
		 * O primeiro número deve ser menor do que o segundo número
		 * Caso o contrário deve ser exibida uma mensagem na tela informando que o intervalo é inválido.
		 * No intervalo, mostre na tela todos os números que são múltiplos de 3 e 5
		 * 
		 * */

		Scanner leitura = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("Digite o primeiro número do intervalo: ");
		numero1 = leitura.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		numero2 = leitura.nextInt();
		
		if(numero1 < numero2) {
			System.out.printf("No intervalo entre %d e %d são: ", numero1, numero2);
			for(int i = numero1; i <= numero2; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.printf("\nO %d é múltiplo de 3 e 5", i);
				}
			}
		} else {
			System.out.println("Intervalo Inválido!!");
		}
	}
}