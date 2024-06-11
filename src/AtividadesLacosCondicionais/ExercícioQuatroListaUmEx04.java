package AtividadesLacosCondicionais;

import java.util.Scanner;

public class ExercícioQuatroListaUmEx04 {
	public static void main(String[] args) {
		
		/*
		 * Escreva um algoritmo que leia 3 palavras (STRING)
		 * Cada palavra definem as características de um tipo de animal
		 * 
		 * */
		
		Scanner leitura = new Scanner(System.in);
		
		String vertebrado = "vertebrado", tipoAnimal;
		
		System.out.println("Digite um tipo de Animal (Ex: Vertebrado ou Invertebrado): ");
		tipoAnimal = leitura.nextLine();
		
		if(tipoAnimal.equalsIgnoreCase(vertebrado)) {
			
		}
	}
}
