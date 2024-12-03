package exercicios;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int codigoCargo;
		float salario, novoSalario;
		
		System.out.println("Código do Cargo | Cargo | Percentual do Reajuste");
		System.out.println(" 1   | Gerente 		   | 10%");
		System.out.println(" 2   | Vendedor        |  7%");
		System.out.println(" 3   | Supervisor      |  9%");
		System.out.println(" 4   | Motorista       |  6%");
		System.out.println(" 5   | Estoquista      |  5%");
		System.out.println(" 6   | Técnico de TI   |  8%");
		
		System.out.println("Nome: ");
		nome = scan.next();
		System.out.println("Qual o código do cargo: ");
		codigoCargo = scan.nextInt();
		System.out.println("Valor do salário: ");
		salario = scan.nextFloat();
		
		switch(codigoCargo) {
		case 1:
			novoSalario = salario + (salario * 0.1f);
			System.out.println("O novo salário do " + nome + " como Gerente é: " + novoSalario);
		break;
		
		case 2:
			novoSalario = salario * 0.07f;
			System.out.println("O novo salário do " + nome + " como Vendedor é: " + novoSalario);
		break;
		
		case 3:
			novoSalario = salario * 0.09f;
			System.out.println("O novo salário do " + nome + " como Supervisor é: " + novoSalario);
		break;
		
		case 4:
			novoSalario = salario * 0.06f;
			System.out.println("O novo salário do " + nome + " como Motorista é: " + novoSalario);
		break;
		
		case 5:
			novoSalario = salario * 0.05f;
			System.out.println("O novo salário do " + nome + " como Estoquista é: " + novoSalario);
		break;
		
		case 6:
			novoSalario = salario * 0.8f;
			System.out.println("O novo salário do " + nome + " como Técnico de TI é: " + novoSalario);
		break;
		
		}
		
		

	}

}
