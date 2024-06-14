package AtividadeLacosRepeticao;

import java.util.Scanner;

public class ExercicioDoisWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitura = new Scanner(System.in);

		int idade;
		int identidadeGenero, pessoaDev;
		int countBackend = 0, countFrontend = 0, countFullstack = 0, countMobile = 0;
		int countMulheres = 0, countHomens = 0, countNaoBinario = 0;

		while(true) {
			System.out.println("Digite sua idade: ");
			idade = leitura.nextInt();

			System.out.println("""

						Qual a sua identidade de Gênero: 

						1 - Mulher Cis
						2 - Homem Cis
						3 - Não Binário
						4 - Mulher Trans
						5 - Homem Trans
						6 - Outros

						Escolha uma opção:
					""");
			identidadeGenero = leitura.nextInt();

			System.out.println("""

					Como você é como pessoa Desenvolvedora?

					1 - Backend
					2 - Frontend
					3 - Mobile
					4 - FullStack

					Escolha uma opção:
					""");
			pessoaDev = leitura.nextInt();
			
			if((identidadeGenero == 1 || identidadeGenero == 4)) {
				countMulheres++;
			} else if(identidadeGenero == 2 || identidadeGenero == 5) {
				countHomens++;
			} else if(identidadeGenero == 3) {
				countNaoBinario++;
			}
			
			
			if(pessoaDev == 1) {
				countBackend++;
			} else if(pessoaDev == 2) {
				countFrontend++;
			} else if(pessoaDev == 3) {
				countMobile++;
			} else if(pessoaDev == 4) {
				countFullstack++;
			} else {
				System.out.println("Porfavor digite uma das opções acima!");
			}
			

		}


	}

}
