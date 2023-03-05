package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* Pegará o valor das vendas do usuario e aplicará
		 * 4% sob esse mesmo valor e acrescentará ao valor 
		 * do salario
		 */
		Scanner sc = new Scanner(System.in);
		double salario,vendas;
		System.out.println("Digite o valor do seu salário:");
		salario = sc.nextDouble();
		System.out.println("Digite o valor de suas vendas: ");
		vendas = sc.nextDouble();
		double comissao = vendas*0.04;
		System.out.println("Sua comissão é de: "+(comissao));
		System.out.println("O valor final do seu salário ficará: "+(salario+comissao));
	}

}
