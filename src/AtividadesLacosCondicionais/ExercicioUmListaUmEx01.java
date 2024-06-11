package AtividadesLacosCondicionais;

import java.util.Scanner;

public class ExercicioUmListaUmEx01 {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int A, B, C, calculoAB;
		
		System.out.println("Digite o número de A: ");
		A = leitura.nextInt();
		
		System.out.println("Digite o número de B: ");
		B = leitura.nextInt();
		
		System.out.println("Digite o número de C: ");
		C = leitura.nextInt();
		
		calculoAB = A + B;
		
		if(calculoAB > C) {
			System.out.println("A soma de A + B é MAIOR do que C");
		} else if(calculoAB < C) {
			System.out.println("A soma de A + B é MENOR do que C");
		} else if(calculoAB == C) {
			System.out.println("A soma de A + B é IGUAL a C");
		}
	}
}
