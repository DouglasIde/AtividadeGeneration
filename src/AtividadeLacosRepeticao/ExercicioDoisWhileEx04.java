package AtividadeLacosRepeticao;

import java.util.Scanner;

public class ExercicioDoisWhileEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitura = new Scanner(System.in);

		int idade;
		int identidadeGenero, pessoaDev, somaIdade = 0, total = 0;
		int countBackend = 0, countFrontMulher = 0, countMobileHomem = 0, countFullstackBi = 0;
		char pergunta;

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


			if(pessoaDev == 1) {
				countBackend++;
			} else if((identidadeGenero == 1 || identidadeGenero == 4) && pessoaDev == 2) {
				countFrontMulher++;
			} else if((identidadeGenero == 2 || identidadeGenero == 5) && pessoaDev == 3) {
				countMobileHomem++;
			} else if(pessoaDev == 4) {
				countMobileHomem++;
			} else if(identidadeGenero == 3 && pessoaDev == 4 && idade < 30){
				countFullstackBi++;
			}

			total++;
			somaIdade += idade;

			System.out.println("Você deseja continuar a leitura de dados? (S/N)");
			pergunta = leitura.next().charAt(0);
			if(pergunta == 'N' || pergunta == 'n') {
				break;
			}


			double mediaIdade = (double) somaIdade / total;

			System.out.println("Número de Pessoas Desenvolvedoras Backend: " + countBackend);
			System.out.println("Número de Mulheres Cis e Trans Desenvolvedoras Frontend: " + countFrontMulher);
			System.out.println("Número de Homens Cis e Trans Desenvolvedoras Mobile maiores de 40 anos: " + countMobileHomem);
			System.out.println("Número de Não Binários Desenvolvedores FullStack menores de 30 anos: " + countFullstackBi);
			System.out.println("Número total de pessoas que responderam a pesquisa: " + total);
			System.out.println("Média da idade das pessoas que responderam á pesquisa: " + mediaIdade);
		}
	}
}
