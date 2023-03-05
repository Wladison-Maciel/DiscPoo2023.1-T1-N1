package br.edu.principal;
import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		// O primeiro número será elevado ao segundo
		Scanner sc = new Scanner(System.in);
		double num1,num2;
		System.out.println("Digite um número: ");
		num1 = sc.nextDouble();
		System.out.println("Digite outro número: ");
		num2 = sc.nextDouble();
		System.out.println("O resultado do primeiro número elevado ao segundo = "+ Math.pow(num1,num2));		
	}

}
