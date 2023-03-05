package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Valor final de um salário mais um aumento
		Scanner sc = new Scanner(System.in);
		double salario,aumento,novsal;
		System.out.println("Digite o valor do salário: ");
		salario = sc.nextDouble();
		System.out.println("Digite o valor do aumento em porcentagem: ");
		aumento = sc.nextDouble();
		novsal = (salario*(aumento/100))+salario;
		System.out.println("O valor do salário mais o aumento será de: "+"R$"+novsal);
		
	}

}
