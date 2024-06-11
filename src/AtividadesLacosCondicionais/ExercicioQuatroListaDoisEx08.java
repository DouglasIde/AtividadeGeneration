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
		Locale locale = new Locale("en","US");
		
		float valorInicial;
		int opcao;
		
		System.out.println("""
				Digite qual Operação você deseja realizar:
				
				1 - Saldo
				2 - Saque
				3 - Depósito
				""");
		
		opcao = leitura.nextInt();
		
	}
}
