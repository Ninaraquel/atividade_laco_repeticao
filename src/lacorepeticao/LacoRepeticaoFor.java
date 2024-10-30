package lacorepeticao;

import java.util.Scanner;

public class LacoRepeticaoFor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int par = 0;
		int impar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "° número:\n");
			int numero = leitor.nextInt();

			// verificar se o número é par, se for incrementamos par
			//caso contrário incrementamos impar
			if (numero % 2 == 0) {
				par++;

			} else {
				impar++;

			}

		}
		
		leitor.close();
		
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);
	}
    
}
