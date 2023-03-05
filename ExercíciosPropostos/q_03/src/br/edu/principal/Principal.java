package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		//Divisão de um número por outro
		Scanner sc = new Scanner(System.in);
		double PrimeiroN, SegundoN;
		System.out.println("Digite o número que será divido: ");
		PrimeiroN = sc.nextDouble();
		System.out.println("Digite o divisor: ");
		SegundoN = sc.nextDouble();
		System.out.printf("O resultado da disivisâo é igual a = %.3f",(PrimeiroN/SegundoN));
	}

}
