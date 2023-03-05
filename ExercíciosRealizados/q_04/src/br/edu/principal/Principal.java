package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Resultado de um aumento de 25% do salario
		Scanner sc = new Scanner(System.in);
		double salario,aumento;
		System.out.println("Digite o valor do seu salário: ");
		salario = sc.nextDouble();
		aumento = 0.25*salario;
		System.out.println("Houve um aumento no seu salário de 25%, você receberá no total: "+(aumento+salario));
	}
}
