package AtividadesLacosCondicionais;

import java.util.Scanner;

public class ExercicioTresListaUm {
	public static void main(String[] args) {
		
		/* 
		 * Para doar sangue é necessário ter entre 18 - 69 anos
		 * Só pode doar sangue se não for a primeira vez entre 60 - 69 anos
		 */
		
		Scanner leitura = new Scanner(System.in);
		
		String nomeDoador;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite o seu Nome: ");
		nomeDoador = leitura.nextLine();
		
		System.out.println("Digite a sua Idade: ");
		idade = leitura.nextInt();
		
		System.out.println("É a sua primeira doação? (True/False)");
		primeiraDoacao = leitura.nextBoolean();
		
		if(primeiraDoacao == true && idade >= 60 && idade <= 69) { // JOÃO SILVA
			System.out.printf("%s NÃO está apto(a) para doar sangue!", nomeDoador);
		} else if(primeiraDoacao == false && idade >= 60 && idade <= 69) { // PEDRO SOUZA
			System.out.printf("%s está apto(a) para doar sangue!", nomeDoador);
		} else if(primeiraDoacao == true && idade >= 18 && idade <= 69) { // MARIA ANJOS
			System.out.printf("%s está apto(a) para doar sangue!", nomeDoador);
		} else { 
			System.out.printf("%s NÃO está apto(a) para doar sangue", nomeDoador); // FABIO CAMÕES
		}

		
	}
}