/*Faça um algoritmo para calcular descontos de produtos. O sistema deve receber
descrição do item, a quantidade adquirida pelo cliente, e o preço por cada unidade
do item. O sistema deve calcular e escrever os valores: total, desconto e o total a
pagar. Respeitando as regras de negócio que diz que se quantidade de itens for menor ou
igual a cinco unidades o desconto será de 5.55%, se quantidade maior que cinco e menor
ou igual a dez o desconto será de 8% e acima dessas quantidades o desconto será de
12.5%.*/

package exercicios_java_eclipse;

import java.util.Scanner;

public class DescontosProdutos {

	public static void main(String[] args) {

		String descricaoItem;
		int quantidade;
		double valorPorUnidade, valorTotal, desconto, valorFinal;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Digite a descrição do item: ");
			descricaoItem = sc.next();

			System.out.print("Digite a quantidade adquirida do item: ");
			quantidade = sc.nextInt();

			System.out.print("Digite o preço por unidade do item: R$ ");
			valorPorUnidade = sc.nextDouble();

			valorTotal = quantidade * valorPorUnidade;

			desconto = 0.0;

			if (quantidade <= 5) {
				desconto = 0.0555 * valorTotal;
			} else if (quantidade <= 10) {
				desconto = 0.08 * valorTotal;
			} else {
				desconto = 0.125 * valorTotal;
			}

			valorFinal = valorTotal - desconto;

			System.out.printf("Valor total: R$ %.2f%n", valorTotal);
			System.out.printf("Desconto: R$ %.2f%n", desconto);
			System.out.printf("Total a pagar: R$ %.2f%n", valorFinal);
		}

	}

}
