package AtividadesLacosCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatroListaDoisEx08 {
	public static void main(String[] args) {
		
		/* 
		 * Desenvolver uma Conta Bancária
		 * O programa deve ler o tipo de operação a ser realizada (int 1 - 3)
		 * Valor a ser depositado ou sacado (somente nas opções 2 e 3)
		 * Um saque só pode ser realizado caso haja saldo sulficiente
		 * Ao final de cada operação exiba o novo Saldo na tela
		 * A variável FLOAT será iniciada com R$ 1000.0
		 * Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem ("Operação Inválida")
		 * 
		 * */
		
		Scanner leitura = new Scanner(System.in);
		Locale locale = new Locale("en","US"); // Não está funcionando
		
		float valorInicial = 1000.0f; 
		float valorAtribuido = 0; 
		float saldo = valorInicial + valorAtribuido;
		float saque;
		int opcao;
		
		System.out.println("""
				Digite qual Operação você deseja realizar:
				
				1 - Saldo
				2 - Saque
				3 - Depósito
				""");
		
		opcao = leitura.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("***** SALDO *****");
			System.out.println("O seu saldo é de: " + saldo);
			break;
		case 2:
			System.out.println("***** SAQUE *****");
			System.out.println("Qual a quantidade que deseja sacar?: ");
			saque = leitura.nextFloat();
			if(saque > saldo) {
				System.out.println("Saldo Insuficiente!");
			} else {
				saldo = valorInicial + saque; 
				System.out.println("Novo Saldo: " + saldo);
			}
			break;
		case 3:
			System.out.println("***** DEPÓSITO *****");
			default:
				System.out.println("Operação Inválida");
		}
		
	}
}
