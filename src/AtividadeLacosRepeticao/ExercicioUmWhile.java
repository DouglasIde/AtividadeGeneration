package AtividadeLacosRepeticao;

import java.util.Scanner;

public class ExercicioUmWhile {
	public static void main(String[] args) {
		
		/*
		 * Leia a idade de várias pessoas (int)
		 * Mostre na tela o total de pessoas cuja idade seja MENOR que 21 anos
		 * Mostre na tela o total de pessoas cuja idade seja MAIOR que 50 anos
		 * Se digitar uma idade negativa, o programa é finalizado
		 * 
		 * */
		
		int idade, idadeMenorVinteUm = 0, idadeMaiorCinquenta = 0;
		
		
		Scanner leitura = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite uma idade: ");
			idade = leitura.nextInt();

			if(idade < 0) {
				break;
			} else if(idade < 21) {
				idadeMenorVinteUm++;
			} else if(idade > 50) {
				idadeMaiorCinquenta++;
			}
		}
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d", idadeMenorVinteUm);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", idadeMaiorCinquenta);
	
	}
}
