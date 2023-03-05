package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Valor da hipotenusa(escada) com o angulo que o usuario dará
		Scanner sc = new Scanner(System.in);
		double ang,alt,radiano,escada;
		System.out.println("Digite o valor do Ângulo formado pela escada e o chão(valor em graus): ");
		ang = sc.nextDouble();
		System.out.println("Digite o valor da altura da parede: ");
		alt = sc.nextDouble();
		radiano = ang*3.14/180;
		escada = alt / Math.sin(radiano);
		System.out.printf("A medida da escada será de: %.2f",escada);
	}

}
