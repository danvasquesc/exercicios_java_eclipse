/*Muitos países estão passando a utilizar o sistema métrico. Fazer um algoritmo para executar
as seguintes conversões:
• Ler uma temperatura em Fahrenheit e imprimir o equivalente em Celsius (C = (F – 32)/1,8), 
considerando C e F os valores Celsius e Fahrenheit, respectivamente.
• Ler uma quantidade de chuva dada em polegadas e imprimir o equivalente em milímetros (1
polegada = 25,4 mm)*/

package exercicios_java_eclipse;

import java.util.Locale;
import java.util.Scanner;

public class TemperaturaChuva {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double C, F, polegadasChuva, milimetrosChuva;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Temperatura em Fahrenheit: ");
			F = sc.nextDouble();

			C = (F - 32) / 1.8;

			System.out.print("Quantidade de chuva em polegadas: ");
			polegadasChuva = sc.nextDouble();

			milimetrosChuva = polegadasChuva * 25.4;

			System.out.printf("A conversão para Celsius é = %.2f%n", C);
			System.out.printf("A quantidade de chuva em milímetros é = %.2f", milimetrosChuva);

		}

	}

}
