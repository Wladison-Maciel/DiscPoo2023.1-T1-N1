package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Questão 2");
		//Resultado da Multiplicação de três números
		Scanner sc = new Scanner(System.in);
		double n1,n2,n3;
		System.out.println("Digite um número: ");
		n1 = sc.nextDouble();
		System.out.println("Digite um segundo número: ");
		n2 = sc.nextDouble();
		System.out.println("Digite um terceiro número: ");
		n3 = sc.nextDouble();
		System.out.println("O resultado da multiplicação dos números dá: "+(n1*n2*n3));
	}

}