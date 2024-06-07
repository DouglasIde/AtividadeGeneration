package AtividadesVetoresMatrizes;

import java.util.Scanner;

public class ExercicioUmVetores {
	public static void main(String[] args) {

		/*
		 * Vetor com 10 números inteiros não ordenados e não repetidos
		 * Usuário irá digitar um número
		 * O programa exibe na tela a posição deste número no vetor
		 * Caso o número NÃO seja encontrado, aparecer na tela: "Não foi encontrado!"
		 * 
		 * */

		Scanner leitura = new Scanner(System.in);

		int numeros[] = {2,5,1,3,4,9,7,8,10,6};

		int numeroDigitado;
		boolean numeroEncontrado = false;

		System.out.println("Digite o número que você deseja encontrar: ");
		numeroDigitado = leitura.nextInt();

		for(int i = 0; i < 10; i++) {
			if(numeroDigitado == numeros[i]) {
				System.out.println("O número " + numeroDigitado + " está localizado na posição " + i);
				numeroEncontrado = true;
				break;
			}
		}
		
		if(!numeroEncontrado) {
			System.out.println("O número " + numeroDigitado + " NÃO foi encontrado!");
		}
	}
}



