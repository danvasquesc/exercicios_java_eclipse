/*O coração humano bate em média uma vez por segundo. Desenvolver um algoritmo para
calcular e escrever quantas vezes o coração de uma pessoa baterá se viver X anos. Dados de entrada:
idade da pessoa (inteiro em anos). Considerações: 1 anos = 365,25 dias, 1 dia = 24 horas, 1 hora =
60 minutos e 1 minuto = 60 segundos.*/

package exercicios_java_eclipse;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraBatimentosCardiacos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int idade;
		double segPorAno, totalBatimentos;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Idade em anos: ");
			idade = sc.nextInt();

			/*
			 * pode-se atribuir os segundos direto a variavel, pois é um valor fixo, mas
			 * preferi fazer a conta
			 */
			segPorAno = 365.25 * 24 * 60 * 60;

			totalBatimentos = idade * segPorAno;

			System.out.printf("O coração bateu %.0f vezes", totalBatimentos);

		}

	}

}
