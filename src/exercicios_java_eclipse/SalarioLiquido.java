package exercicios_java_eclipse;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {

		double horasDia, precoHora, salarioBruto, salarioLiquido, desconto;
		int diasTrabalhados;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Digite a quantidade de horas trabalhadas por dia: ");
			horasDia = sc.nextDouble();

			System.out.print("Digite o valor da hora trabalhada: R$ ");
			precoHora = sc.nextDouble();

			System.out.print("Digite a quantidade de dias trabalhados no mês: ");
			diasTrabalhados = sc.nextInt();

			salarioBruto = horasDia * precoHora * diasTrabalhados;

			desconto = salarioBruto * 0.21;

			salarioLiquido = salarioBruto - desconto;

			System.out.println("Seu salário líquido é R$ " + salarioLiquido);

		}

	}

}
