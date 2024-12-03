package exercicios;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int codigoProduto, quantidade;
		double preço;
		
		System.out.println("Código do Produto | Produto | Preço");
		System.out.println(" 1   | Cachorro quente | R$ 10.00");
		System.out.println(" 2   | X-Salada        | R$ 15.00");
		System.out.println(" 3   | X-Bacon         | R$ 18.00");
		System.out.println(" 4   | Bauru           | R$ 12.00");
		System.out.println(" 5   | Refrigerante    | R$  8.00");
		System.out.println(" 6   | Suco de laranja | R$ 13.00");
		
		System.out.println("Digite o código do produto: ");
		codigoProduto = scan.nextInt();
		System.out.println("Quantas unidades você deseja: ");
		quantidade = scan.nextInt();
		
		switch(codigoProduto) {
		case 1:
			preço = 10.00 * quantidade;
			System.out.println("O valor total de Cachorro quente: " + preço);
		break;
		
		case 2:
		preço = 15.00 * quantidade;
		System.out.println("O valor total de X-Salada: " + preço);
		break;
		
		case 3:
		preço = 18.00 * quantidade;
		System.out.println("O valor total de X-Bacon: " + preço);
		break;
		
		case 4:
			preço = 12.00 * quantidade;
			System.out.println("O valor total de Bauru: " + preço);
		break;
		
		case 5:
			preço = 8.00 * quantidade;
			System.out.println("O valor total de Refrigerante: " + preço);
		break;
		
		case 6:
			preço = 13.00 * quantidade;
			System.out.println("O valor total de Suco de laranja: " + preço);
		break;
		
		}
	}

}
