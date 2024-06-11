package AtividadesFila;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioDoisListaDoisEx02 {
	public static void main(String[] args) {
		
		/*
		 * Crie um programa contendo um Collection Stack (Pilha) objetos da Classe String
		 * Organizar a retirada de livros em uma Pilha
		 * O programa tem que ter um Menu com as opções:
		 * 		1 - Adicionar um novo livro na pilha. (Deve solicitar o nome do Livro)
		 * 		2 - Listar todos os livros da Pilha
		 * 		3 - Retirar um livro da Pilha
		 * 		0 - O programa deve ser finalizado
		 * Caso a pilha esteja vazia, ele deverá informar que a pilha está vazia
		 * 
		 * */
		
		Scanner leitura = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		int opcao;
		
		while(true) {
			
			System.out.println("""
					*********************************
					1 - Adicionar Livro na Pilha
					2 - Listar todos os Livros
					3 - Retirar Cliente da Pilha
					0 - Sair
					*********************************
					Entre com a opção desejado:
					""");
			opcao = leitura.nextInt();
		}
	}
}