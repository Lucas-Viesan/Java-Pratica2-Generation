package exercicios;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, n3, soma;
		
		System.out.println("Digite o 1º valor: ");
		n1 = scan.nextInt();
		System.out.println("Digite o 2º valor: ");
		n2 = scan.nextInt();
		System.out.println("Digite o 3º valor: ");
		n3 = scan.nextInt();
		
		soma = n1 + n2;
		
		if(soma > n3) {
			System.out.println("A soma de A + B é maior que C");
		} else if(soma == n3) {
			System.out.println("A soma de A + B é igual que C");
		} else {
			System.out.println("A soma de A + B é menor que C");
		}
		

	}

}
