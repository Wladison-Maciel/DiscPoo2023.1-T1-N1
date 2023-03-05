package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Convesor de moedas
		Scanner sc = new Scanner(System.in);
		double real;
		System.out.println("Digite o valor em Reais que possui para a conversão: ");
		real = sc.nextDouble();
		System.out.printf("O valor em dolar ficaria: %.2f",(real)/1.80);
		System.out.printf("O valor em marco alemão ficaria: %.2f",(real)/2.0);
		System.out.printf("O valor em libra esterlina ficaria: %.2f",(real)/1.57);
	}

}
