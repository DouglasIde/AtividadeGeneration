package AtividadesLacosCondicionais;

import java.util.Scanner;

public class ExercicioDoisListaDois {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		String nomeColaborador;
		float numero;
		int opcao;
		
		System.out.println("Digite o nome do Colaborador: ");
		nomeColaborador = leitura.nextLine();
		
		System.out.println("**************************");
        System.out.println("Selecione um cargo:");
        System.out.println("1. Gerente");
        System.out.println("2. Vendedor");
        System.out.println("3. Supervisor");
        System.out.println("4. Motorista");
        System.out.println("5. Estoquista");
        System.out.println("6. Técnico de TI");
        System.out.println("**************************");
        opcao = leitura.nextInt();
        
        
       
	}
}
