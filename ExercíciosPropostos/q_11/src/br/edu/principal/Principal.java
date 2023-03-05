package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Calculo da área de um losango
		Scanner sc = new Scanner(System.in);
		double dmaior,dmenor;
		System.out.println("Digite o valor da Diagonal maior: ");
		dmaior = sc.nextDouble();
		System.out.println("Digite o valor da Diagonal menor: ");
		dmenor = sc.nextDouble();
		System.out.println("O valor da área do losango é: "+(dmaior*dmenor)/2);
	}

}
