package AtividadesLacosCondicionais;

import java.util.Scanner;

public class ExercicioTresListaDoisEx07 {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		float numero1, numero2;
		float soma, subtracao, multiplicacao, divisao;
		int opcao;
		
		System.out.println("Digite um número para realizar um Cálculo: ");
		numero1 = leitura.nextFloat();
		
		System.out.println("Digite outro número para realizar um Cálculo: ");
		numero2 = leitura.nextFloat();
		
		System.out.println("""
				*******************************
				********* CALCULADORA *********
				*******************************
				Escolha o que deseja fazer:  
					1 - Soma				  
					2 - Substração            
					3 - Multiplicação         
					4 - Divisão               
				*******************************
				""");

		opcao = leitura.nextInt();
		
		switch(opcao) {
		case 1: 
			soma = numero1 + numero2;
			System.out.printf("A soma dos dois números é igual a: %.1f", soma);
			break;
		case 2:
			subtracao = numero1 - numero2;
			System.out.printf("A subtração dos dois números é igual a: %.1f ", subtracao);
			break;
		case 3:
			multiplicacao = numero1 * numero2;
			System.out.printf("A multiplicação dos dois números é igual a: %.1f", multiplicacao);
			break;
		case 4:
			divisao = numero1 / numero2;
			System.out.printf("A divisão dos dois números é igual a: %.1f", divisao);
			break;
			default:
				System.out.println("Opção Inválida!!!");
		}
	}
}
