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

		String vertebrado = "vertebrado",invertebrado = "invertebrado";
		String tipoAnimal, aveOuMamifero, aveCarnivoroOuOnivoro;
		String herbivoroOuOnivoro;
		String insetoOuAnelideo;
		String hematofagoOuHerbivoro, hematofagoOuOnivoro;

		System.out.println("Digite um tipo de Animal (Ex: Vertebrado ou Invertebrado): ");
		tipoAnimal = leitura.nextLine();

		if(tipoAnimal.equalsIgnoreCase(vertebrado)) {
			System.out.println("Ele(a) é um Mamífero ou uma Ave? : ");
			aveOuMamifero = leitura.nextLine();
			if(aveOuMamifero.equalsIgnoreCase("ave")) {
				System.out.println("Ele(a) é Carnívoro ou Onívoro? ");
				aveCarnivoroOuOnivoro = leitura.nextLine();
				if(aveCarnivoroOuOnivoro.equalsIgnoreCase("carnívoro")) {
					System.out.println("O seu animal é uma ÁGUIA");
				} else if(aveCarnivoroOuOnivoro.equalsIgnoreCase("onívoro")) {
					System.out.println("O seu animal é uma POMBA");
				}
			} else if(aveOuMamifero.equalsIgnoreCase("mamifero")) {
				System.out.println("Ele(a) é Herbivoro ou Onivoro? ");
				herbivoroOuOnivoro = leitura.nextLine();
				if(herbivoroOuOnivoro.equalsIgnoreCase("herbivoro")) {
					System.out.println("O seu animal é uma VACA");
				} else if(herbivoroOuOnivoro.equalsIgnoreCase("onivoro")) {
					System.out.println("O seu animal é um HOMEM");
				}
			}
		} else if(tipoAnimal.equalsIgnoreCase(invertebrado)) {
			System.out.println("Ele(a) é um Inseto ou Anelideo? : ");
			insetoOuAnelideo = leitura.nextLine();
			if(insetoOuAnelideo.equalsIgnoreCase("inseto")) {
				System.out.println("Ele(a) é Hematofago ou Herbivoro? ");
				hematofagoOuHerbivoro = leitura.nextLine();
				if(hematofagoOuHerbivoro.equals("hematofago")) {
					System.out.println("O seu animal é uma PULGA");
				} else if(hematofagoOuHerbivoro.equalsIgnoreCase("herbivoro")) {
					System.out.println("O seu animal é uma LAGARTA");
				}
			} else if(insetoOuAnelideo.equalsIgnoreCase("anelideo")) {
				System.out.println("Ele(a) é um Hematofago ou Onivoro?");
				hematofagoOuOnivoro = leitura.nextLine();
				if(hematofagoOuOnivoro.equalsIgnoreCase("Hematofago")) {
					System.out.println("O seu animal é um SANGUESSUGA");
				} else if(hematofagoOuOnivoro.equalsIgnoreCase("onivoro")){
					System.out.println("O seu animal é uma MINHOCA");
				}
			}
		}
	}
}
