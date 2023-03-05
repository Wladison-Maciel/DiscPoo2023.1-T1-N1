package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Valor do salário final mais um remuneração menos o imposto
		Scanner sc = new Scanner(System.in);
		double salario,imposto;
		System.out.println("Digite o valor do seu salário: ");
		salario = sc.nextDouble();
		imposto = salario * 10/100;
		System.out.println("O valor do salário final mais uma remuneração de 50$, ficará de: "+(salario+50-imposto));
	}

}
