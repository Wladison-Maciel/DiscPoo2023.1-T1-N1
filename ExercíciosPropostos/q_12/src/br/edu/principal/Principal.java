package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Quantos salários minimos uma pessoa ganha a mais
		Scanner sc = new Scanner(System.in);
		double salario;
		System.out.println("Digite o valor do seu salário: ");
		salario = sc.nextDouble();
		double result = salario/1.380;
		System.out.printf("Você recebe %.2f",result);
		System.out.print(" vezes a mais do que um salário minimo no Brasil!");
	}

}