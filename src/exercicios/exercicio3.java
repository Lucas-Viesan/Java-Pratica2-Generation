package exercicios;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome, valida;
		int idade;
		boolean doador = false;
		
		System.out.println("Qual o seu nome: ");
		nome = scan.next();
		System.out.println("Qual a sua idade: ");
		idade = scan.nextInt();
		System.out.println("Você já realizou doação de sangue?(s ou n): ");
		valida = scan.next();
		
		if(idade >= 60 && idade < 70 && valida.equalsIgnoreCase("s")) {
				doador = true;
					
		} else if (idade >= 60 && idade < 70 && valida.equalsIgnoreCase("n")) {
			doador = false;
		} else if (idade >= 18 && idade < 60) {
			doador = true;
		} else {
			doador = false;
		}
		
		if (doador == true) {
			System.out.println("O " + nome + " está Apto para doar sangue");
		} else {
			System.out.println("O " + nome + " não está Apto para doar sangue");
		}
	}

}
