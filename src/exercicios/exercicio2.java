package exercicios;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um número: ");
		x = scan.nextInt();
		
		if (x % 2 == 0 && x >= 0) {
			System.out.println("O número " + x + " é par e positivo!");
		} else if (x % 2 == 0 && x < 0) {
			System.out.println("O número " + x + " é par e negativo!");
		} else if (x % 2 != 0 && x >= 0) {
			System.out.println("O número " + x + " é ímpar e positivo!");
		} else {
			System.out.println("O número " + x + " é ímpar e negativo!");
		}

	}

}
