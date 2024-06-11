package AtividadesCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AtividadeUmListaDoisEx03 {
	public static void main(String[] args) {
		
		/*
		 * Criar uma Collection SET de objetos de Classe Wrapper Intenger
		 * O programa deve solicitar ao usuário que ele digite via teclado 10 valores inteiros não repetidos
		 * Adicione cada valor individualmente na Collection Set
		 * Mostre na tela todos os elementos da Collection Set (Utilizando a Classe Iterator)
		 * 
		 * */
		
		Scanner leitura = new Scanner(System.in);
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		int numerosDigitados;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			numerosDigitados = leitura.nextInt();
			setNumeros.add(numerosDigitados);
		}
		
		Iterator<Integer> isetNumeros = setNumeros.iterator();
		
		while(isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}
		
		
		
	}
}
