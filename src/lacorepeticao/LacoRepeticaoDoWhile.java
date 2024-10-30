package lacorepeticao;

import java.util.Scanner;

public class LacoRepeticaoDoWhile {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int soma = 0;
		int numero;
		do {
			System.out.println("Digite um número: ");
			numero = leitor.nextInt();
			if (numero > 0) {
				soma += numero;
			}
		} while (numero != 0);
		System.out.println("A soma dos números positivos é:" + soma);

	}

}
