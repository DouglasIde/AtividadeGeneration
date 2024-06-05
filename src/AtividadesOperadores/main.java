package AtividadesOperadores;

import java.util.Scanner;
import java.util.Locale;

public class main {
	public static void main(String[] args) {
		
		/* 
		 * Para o código funcionar corretamente, digite com "." 
		 * (ponto) ao invés de "," (vírgula)
		 * */
		
		Locale.setDefault(Locale.US); 
		Scanner leitura = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite o Salário: ");
		salario = leitura.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leitura.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo Salário: R$ %.2f %n", novoSalario);
		
	}
}
