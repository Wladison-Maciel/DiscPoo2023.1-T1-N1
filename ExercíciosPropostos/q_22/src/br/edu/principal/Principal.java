package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Calculo para saber o número de diagonais seguindo a formula
		Scanner sc = new Scanner(System.in);
		int n,nd;
		System.out.println("Digite o número de lados do poligono: ");
		n = sc.nextInt();
		nd = n * (n-3)/2;
		System.out.println("O número de diagonais desse poligono é: "+nd);
	}

}
