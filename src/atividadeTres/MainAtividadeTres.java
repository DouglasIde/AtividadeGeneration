package atividadeTres;

import java.util.Scanner;
import java.util.Locale;

public class MainAtividadeTres {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitura = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Salário Bruto: ");
		salarioBruto = leitura.nextFloat();
		
		System.out.println("Adicional Noturno: ");
		adicionalNoturno = leitura.nextFloat();
		
		System.out.println("Horas Extras: ");
		horasExtras = leitura.nextFloat();
		
		System.out.println("Descontos: ");
		descontos = leitura.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("Salário Liquido: %.2f %n", salarioLiquido);
		
		
	}
}
