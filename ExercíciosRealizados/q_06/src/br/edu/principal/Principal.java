package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		/* Calculo do salario base com a gratificação de 5% sob salario base e
		 * menos 7% sob o salario base
		 */
		Scanner sc = new Scanner(System.in);
		double salario,imposto,grati;
		System.out.println("Digite o valor de seu salário: ");
		salario = sc.nextDouble();
		grati = salario*5/100;
		imposto = salario*7/100;
		System.out.println("O salário final ficará: "+(salario+grati-imposto));
	}

}
