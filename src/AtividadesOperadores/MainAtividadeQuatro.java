package AtividadesOperadores;

import java.util.Scanner;
import java.util.Locale;

public class MainAtividadeQuatro {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitura = new Scanner(System.in);
		
		float numero1, numero2, numero3, numero4, calculo;
		String produto;
		
		System.out.println("Digite o nome do produto: ");
		produto = leitura.nextLine();
		
		System.out.println("Agora vamos verificar a diferença dos números");
		System.out.println("Atribua uma nota para este produto: ");
		numero1 = leitura.nextFloat();
		
		System.out.println("Atribua uma outra nota para este produto: ");
		numero2 = leitura.nextFloat();
		
		System.out.println("Atribua uma outra nota para este produto: ");
		numero3 = leitura.nextFloat();
		
		System.out.println("Atribua uma outra nota para este produto: ");
		numero4 = leitura.nextFloat();
		
		calculo = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.printf("Resultado: %.1f %n", calculo);
	}
}
