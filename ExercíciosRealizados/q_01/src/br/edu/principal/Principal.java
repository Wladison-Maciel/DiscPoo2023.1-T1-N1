package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Soma de 4 números digitados pelo usuario
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3,n4;
		System.out.println("Digite um número: ");
		n1 = sc.nextInt();
		System.out.println("Digite um segundo número: ");
		n2 = sc.nextInt();
		System.out.println("Digite um terceiro número: ");
		n3 = sc.nextInt();
		System.out.println("Digite um quarto número: ");
		n4 = sc.nextInt();
		System.out.println("O resultado da soma dos números é igual a: "+(n1+n2+n3+n4));
	}

}