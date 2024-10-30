/*Teorema   de   Pitágoras:   H²  =   L1²   +   L2²  .   Tem   uma   infinidade   de   números   com   essa
combinação. Dado dois números inteiros positivos, M e N, onde M>N, desenvolver um algoritmo
para entrar com dois números positivos e fornecer os valores dos lados e da Hipotenusa do triângulo
gerados combinando M e N.
L1=M2−N2,L 2=2 *M*N,  Hipotenusa = M² + N²*/

package exercicios_java_eclipse;

import java.util.Scanner;

public class CalcularLadosHipotenusa {

	public static void main(String[] args) {

		int M, N, L1, L2, hipotenusa;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Digite o número inteiro de M (este número deve ser maior que N): ");
			M = sc.nextInt();

			System.out.print("Digite o número inteiro de N: ");
			N = sc.nextInt();

			/* Verificar se M é maior que N */

			if (M <= N) {
				System.out.println("Erro: M deve ser maior que N.");
				return; /* encerra o programa */
			}

			L1 = (int) (Math.pow(M, 2) - Math.pow(N, 2)); /* Formula: M² - N² */
			L2 = 2 * M * N;
			hipotenusa = (int) (Math.pow(M, 2) + Math.pow(N, 2)); /* Formula: M² + N² */

			System.out.printf("L1 = %d%n", L1);
			System.out.printf("L2 = %d%n", L2);
			System.out.printf("HIPOTENUSA = %d%n", hipotenusa);

		}

	}

}
