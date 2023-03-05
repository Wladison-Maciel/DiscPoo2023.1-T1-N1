package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Calculo de um deposito menos um imposto de cada de cheque
		Scanner sc = new Scanner(System.in);
		double salario,cheque1,cheque2,cpmf1,cpmf2,saldo;
		System.out.println("Digite o valor do deposito: ");
		salario = sc.nextDouble();
		System.out.println("Digite o valor do cheque1: ");
		cheque1 = sc.nextDouble();
		System.out.println("Digite o valor do cheque2: ");
		cheque2 = sc.nextDouble();
		cpmf1 = cheque1 * 0.0038;
		cpmf2 = cheque2 * 0.0038;
		saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
		System.out.println("O valor do saldo atual é de: "+(saldo));
	}

}
