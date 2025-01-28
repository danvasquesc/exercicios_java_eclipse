/*Faça um algoritmo que receba 4 valores inteiros A, B, C e D. Dados os valores,
se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a
soma de A e B, e ainda, se ambos, C e D forem positivos e A for par, escrever a mensagem
"Valores aceitos", se não escrever "Valores não aceitos".*/

package exercicios_java_eclipse;

import java.util.Scanner;

public class ValoresAceitosOuNao {

	public static void main(String[] args) {

		int A, B, C, D;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Digite o valor de A: ");
			A = sc.nextInt();

			System.out.print("Digite o valor de B: ");
			B = sc.nextInt();

			System.out.print("Digite o valor de C: ");
			C = sc.nextInt();

			System.out.print("Digite o valor de D: ");
			D = sc.nextInt();

			boolean condicao1 = B > C;
			boolean condicao2 = D > A;
			boolean condicao3 = (C + D) > (A + B);
			boolean condicao4 = C > 0 && D > 0;
			boolean condicao5 = A % 2 == 0;

			if (condicao1 && condicao2 && condicao3 && condicao4 && condicao5) {
				System.out.println("Valores aceitos");
			} else {
				System.out.println("Valores não aceitos");
			}

		}

	}

}
