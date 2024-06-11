package AtividadesFila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioUmListaUmEx01 {
	public static void main(String[] args) {

		/*
		 * Crie um programa contendo uma Collection Queue (Fila) de Objetos da Classe String
		 * O menu deverá ter 3 opções no menu
		 * 1 - Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente
		 * 2 - Listar todos os Clientes
		 * 3 - Chamar uma pessoa da fila
		 * 0 - Programa deve ser finalizado
		 * 
		 * */

		Scanner leitura = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		int opcao;

		while(true) {
			System.out.println("""
					*********************************
					1 - Adicionar Cliente na Fila
					2 - Listar todos os Clientes
					3 - Retirar Cliente da Fila
					0 - Sair
					*********************************
					Entre com a opção desejado:
					""");
			opcao = leitura.nextInt();

			switch(opcao) {
			case 1:
				System.out.println("Digite o nome do Cliente: ");
				fila.add(leitura.next());
				System.out.println("O Cliente foi Adicionado!");
				break;
			case 2:
				if(fila.isEmpty()) {
					System.out.println("A Fila está vazia!\n");
				} else {
					System.out.println("Fila dos Clientes: ");
					fila.peek();
					System.out.println(fila);
				}
				break;
			case 3:
				System.out.println("Fila dos Clientes Atualizada: ");
				fila.remove();
				System.out.println(fila);
				break;
			case 0:
				System.out.println("Programa Finalizado! Até mais :)");
				return;
			default:
				System.out.println("Chave Incorreta, Por favor insira uma chave válida do Menu!");
				return;
			}
		}


	}
}
