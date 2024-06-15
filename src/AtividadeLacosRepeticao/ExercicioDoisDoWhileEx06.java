package AtividadeLacosRepeticao;

import java.util.Scanner;

public class ExercicioDoisDoWhileEx06 {
	public static void main(String[] args) {
		
		/*
		 * 
		 * Leia números inteiros via teclado até que o número 0 seja digitado
		 * No final mostre na tela a média de todos os números digitados
		 * 
		 * */
		
		Scanner leitura = new Scanner(System.in);
		
		int contagem = 0, media = 0;
		int numero;
		
		do {
			System.out.println("Digite o número desejado: ");
			numero = leitura.nextInt();
			if(numero != 0 && numero % 3 == 0) {
				contagem++;
				media += numero;
			}
		} while(numero != 0);
		
		if(contagem != 0) {
			System.out.println("A média de todos os números que são múltiplos de 3 é: " + (double)media/contagem); // Eu realizei o Casting exlícito para converter em DOUBLE
		} else {
			System.out.println("Não teve nenhum número digitado que seja múltiplo de 3!");
		}
	}
}
