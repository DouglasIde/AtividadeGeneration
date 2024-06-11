package AtividadesLacosCondicionais;

import java.util.Scanner;

public class ExercicioDoisListaDoisEx06 {
	public static void main(String[] args) {
		
		/*
		 * Leia o Nome do Colaborador (String)
		 * Leia o Código do Cargo do Colaborador (int 1 - 6)
		 * Leia o Salário (float)
		 * Mostre na tela o Nome do Colaborador, Cargo e o novo salário
		 * 
		 * */
		
		Scanner leitura = new Scanner(System.in);
		
		String nomeColaborador, cargo;
		float salario, novoSalario, reajuste;
		int opcao;
		
		System.out.println("Digite o nome do Colaborador: ");
		nomeColaborador = leitura.nextLine();
		
		System.out.println("Digite o seu Salário: ");
		salario = leitura.nextFloat();
		
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
        
        switch(opcao) {
        case 1:
        	cargo = "Gerente";
        	reajuste = 0.10f;
        	novoSalario = salario + (salario * reajuste);
            System.out.printf("Nome do Colaborador: %s%n", nomeColaborador);
            System.out.printf("Cargo: %s%n", cargo);
            System.out.printf("Salário: %.2f%n", novoSalario);
        	break;
        case 2:
        	cargo = "Vendedor";
        	reajuste = 0.07f;
        	novoSalario = salario + (salario * reajuste);
            System.out.printf("Nome do Colaborador: %s%n", nomeColaborador);
            System.out.printf("Cargo: %s%n", cargo);
            System.out.printf("Salário: %.2f%n", novoSalario);
            break;
        case 3:
        	cargo = "Supervisor";
        	reajuste = 0.09f;
        	novoSalario = salario + (salario * reajuste);
            System.out.printf("Nome do Colaborador: %s%n", nomeColaborador);
            System.out.printf("Cargo: %s%n", cargo);
            System.out.printf("Salário: %.2f%n", novoSalario);
            break;
        case 4:
        	cargo = "Motorista";
        	reajuste = 0.06f;
        	novoSalario = salario + (salario * reajuste);
            System.out.printf("Nome do Colaborador: %s%n", nomeColaborador);
            System.out.printf("Cargo: %s%n", cargo);
            System.out.printf("Salário: %.2f%n", novoSalario);
            break;
        case 5:
        	cargo = "Estoquista";
        	reajuste = 0.05f;
        	novoSalario = salario + (salario * reajuste);
            System.out.printf("Nome do Colaborador: %s%n", nomeColaborador);
            System.out.printf("Cargo: %s%n", cargo);
            System.out.printf("Salário: %.2f%n", novoSalario);
            break;
        case 6:
        	cargo = "Técnico de TI";
        	reajuste = 0.08f;
        	novoSalario = salario + (salario * reajuste);
            System.out.printf("Nome do Colaborador: %s%n", nomeColaborador);
            System.out.printf("Cargo: %s%n", cargo);
            System.out.printf("Salário: %.2f%n", novoSalario);
            break;
            default:
            	System.out.println("Opção Inválida");
        }
        

        
       
        
       
	}
}
