package AtividadesCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;

public class AtividadeUmListaUmEx01 {
	public static void main(String[] args) {
		
		/*
		 * Crie um Collection ArrayList de Objetos da Classe String
		 * O programa deve solicitar ao usuário que ele digite via teclado 5 cores
		 * O usuário deve adicionar individualmente as cores no ArrayList
		 * Após isso ele fará:
		 * 		Mostre na tela todas as cores que foram adicionadas.
		 * 		Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente
		 * 
		 * */
		
	Scanner leitura = new Scanner(System.in);
	
	ArrayList<String> cores = new ArrayList<>();
	
	String buscaCores;
	
	
	for(int i = 0; i < 5; i++) {
		System.out.println("Digite uma cor: ");
		buscaCores = leitura.nextLine();
		cores.add(buscaCores);
	}
	
	System.out.println("\nTodas as Cores: " + cores); // Mostra todas as cores
	
	Collections.sort(cores);
	System.out.println("\nCores em Ordem Crescente: " + cores);
	
	}

}
