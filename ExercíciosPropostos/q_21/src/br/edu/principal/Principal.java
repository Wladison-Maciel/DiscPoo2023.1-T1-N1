package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Valor do salario bruto,extra e as horas e horas extras trabalhadas
		Scanner sc = new Scanner(System.in);
		double horas,salario,hextras;
		System.out.println("Digite o número de horas trabalhadas: ");
		horas = sc.nextDouble();
		System.out.println("Digite a quantidade de seu salário: ");
		salario = sc.nextDouble();
		System.out.println("Digite o número de horas extras trabalhadas: ");
		hextras = sc.nextDouble();
		System.out.println("Sua hora trabalhada equivale: "+(salario/8));
		System.out.println("Sua hora extra trabalhada equivale: "+(salario/4));
		System.out.println("O seu salário bruto equivale: "+(horas)*(salario/8));
		System.out.println("A quantia a receber pelas horas extras é: "+(hextras)*(salario/4));
		System.out.println("O Salário que irá receber: "+(horas*(salario/8)+(hextras*salario/4)));
	}

}
