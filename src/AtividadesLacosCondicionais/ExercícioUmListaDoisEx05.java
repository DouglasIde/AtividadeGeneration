package AtividadesLacosCondicionais;

import java.util.Scanner;

public class ExercícioUmListaDoisEx05 {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int quantidade, opcao;
		float preco, valorTotal;
	
		System.out.println("***** LANCHONETE DO CORINTHIANS *****");
		System.out.println("1 - Cachorro Quente - R$ 10,00");
		System.out.println("2 - X-Salada - R$ 15,00");
		System.out.println("3 - X-Bacon - R$ 18,00");
		System.out.println("4 - Bauru - R$ 12,00");
		System.out.println("5 - Refrigerante - R$ 8,00");
		System.out.println("6 - Suco de Laranja - R$ 13,00");
		System.out.println("*************************************");
		
		System.out.println("Digite qual opção deseja comprar: ");
		opcao = leitura.nextInt();
		
		
		switch(opcao) {
		case 1: 
			System.out.println("Qual a quantidade você deseja comprar?");
			quantidade = leitura.nextInt();
			preco = 10;
			valorTotal = quantidade * preco;
			System.out.printf("O valor total ficou: R$ %.2f", valorTotal);
			break;
		case 2:
			System.out.println("Qual a quantidade você deseja comprar?");
			quantidade = leitura.nextInt();
			preco = 15;
			valorTotal = quantidade * preco;
			System.out.printf("O valor total ficou: R$ %.2f", valorTotal);
			break;
		case 3:
			System.out.println("Qual a quantidade você deseja comprar?");
			quantidade = leitura.nextInt();
			preco = 18;
			valorTotal = quantidade * preco;
			System.out.printf("O valor total ficou: R$ %.2f", valorTotal);
			break;
		case 4:
			System.out.println("Qual a quantidade você deseja comprar?");
			quantidade = leitura.nextInt();
			preco = 12;
			valorTotal = quantidade * preco;
			System.out.printf("O valor total ficou: R$ %.2f", valorTotal);
			break;
		case 5:
			System.out.println("Qual a quantidade você deseja comprar?");
			quantidade = leitura.nextInt();
			preco = 8;
			valorTotal = quantidade * preco;
			System.out.printf("O valor total ficou: R$ %.2f", valorTotal);
			break;
		case 6:
			System.out.println("Qual a quantidade você deseja comprar?");
			quantidade = leitura.nextInt();
			preco = 13;
			valorTotal = quantidade * preco;
			System.out.printf("O valor total ficou: R$ %.2f", valorTotal);
			break;
			default:
				System.out.println("Por favor escolha uma das opções do Menu");
				break;
		}
	}
}
