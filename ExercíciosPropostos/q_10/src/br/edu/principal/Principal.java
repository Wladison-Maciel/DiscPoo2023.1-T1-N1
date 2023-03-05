package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Calculo da área de um quadrado
		Scanner sc = new Scanner(System.in);
		double lado1,lado2;
		System.out.println("Digite o lado do quadrado: ");
		lado1 = sc.nextDouble();
		System.out.println("Digite o outro lado do quadrado: ");
		lado2 = sc.nextDouble();
		System.out.println("A área do quadrado é igual a: "+(lado1*lado2));
	}

}
