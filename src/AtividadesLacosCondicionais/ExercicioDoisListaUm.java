package AtividadesLacosCondicionais;

import java.util.Scanner;

public class ExercicioDoisListaUm {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int numero;
		
		System.out.println("***** VERIFICAR SE O NÚMERO É PAR OU ÍMPAR!! *****");
		
		System.out.println("Digite um número: ");
		numero = leitura.nextInt();
		
		if(numero % 2 == 0 && numero >= 0) {
			System.out.printf("O número %d é PAR e POSITIVO!", numero);
		} else if(numero % 2 == 0 && numero < 0) {
			System.out.printf("O número %d é PAR e NEGATIVO!", numero);
		} else if(numero < 0) {
			System.out.printf("O número %d é ÍMPAR e NEGATIVO!", numero);
		} else {
			System.out.printf("O número %d é ÍMPAR e POSITIVO!", numero);
		}
	}
}
