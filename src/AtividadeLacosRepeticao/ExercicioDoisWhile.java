package AtividadeLacosRepeticao;

import java.util.Scanner;

public class ExercicioDoisWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitura = new Scanner(System.in);

		int idade;
		int identidadeGenero;

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
			
			Escolha a sua resposta:
		""");
		identidadeGenero = leitura.nextInt();
	}

}
