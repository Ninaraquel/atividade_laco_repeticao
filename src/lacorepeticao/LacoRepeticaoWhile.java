package lacorepeticao;

import java.util.Scanner;

public class LacoRepeticaoWhile {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int idade;
		int menorQue21 = 0;
		int maiorQue50 = 0;

		while (true) {
			System.out.println("Digite uma idade:");
			idade = leitor.nextInt();

			if (idade < 0) {
				break;

			} else if (idade > 50) {
				maiorQue50++;

			} else if (idade < 21) {
				menorQue21++;
			}

		}
		System.out.println("Total de pessoas menores de 21 anos: " + menorQue21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorQue50);

	}

}
