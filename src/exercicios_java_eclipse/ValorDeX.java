/*) Considerando a expressão: AX + BX + C = 1 .Faça um algoritmo que receba 3
valores inteiros A, B, e C e calcule o valor de X. Dados os valores caso A e B possuam valor
0 e C seja diferente de 1 imprimir “solução impossível” */

package exercicios_java_eclipse;

import java.util.Scanner;

public class ValorDeX {

	public static void main(String[] args) {

		int A, B, C;
		double X;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Digite o valor de A: ");
			A = sc.nextInt();

			System.out.print("Digite o valor de B: ");
			B = sc.nextInt();

			System.out.print("Digite o valor de C: ");
			C = sc.nextInt();

			if (A == 0 && B == 0 && C != 1) {
				System.out.println("Solução impossível");
			} else {
				X = (1.0 - C) / (A + B); /*
											 * Usei 1.0 (double) em vez de 1 (int) para evitar que o Java arredonde o
											 * resultado e não tenha exatidão
											 */
				System.out.printf("O valor de X é: %.2f%n", X);

			}
		}

	}

}
