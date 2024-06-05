package atividadeDois;

import java.util.Locale;

public class MainAtividadeDois {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		float nota1 = 10f;
		float nota2 = 8f;
		float nota3 = 7f;
		float nota4 = 7.5f;

		float calcularMedia = (nota1 + nota2 + nota3 + nota4)/4; 
		
		System.out.printf("Média Final: %.1f", calcularMedia);
		
	}
}
