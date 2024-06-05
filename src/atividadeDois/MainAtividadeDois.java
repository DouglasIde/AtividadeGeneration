package atividadeDois;

import java.util.Locale;
import java.util.Scanner;

public class MainAtividadeDois {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner leitura = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4;
		
		System.out.println("Digite uma nota: ");
		nota1 = leitura.nextFloat();
		
		System.out.println("Digite uma outra nota: ");
		nota2 = leitura.nextFloat();
		
		System.out.println("Digite uma outra nota: ");
		nota3 = leitura.nextFloat();
		
		System.out.println("Digite uma outra nota: ");
		nota4 = leitura.nextFloat();
		
		float calcularMedia = (nota1 + nota2 + nota3 + nota4)/4; 
		
		System.out.printf("Média Final: %.1f", calcularMedia);
		
	}
}
