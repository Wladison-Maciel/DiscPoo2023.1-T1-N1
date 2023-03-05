package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// tabuada será feita a partir de números inteiros
		int resposta,numero;
		System.out.println("Qual operação deseja fazer?: ");
		System.out.println("1 = adição, 2 = subtração, 3 = multiplicação, 4 = divisão");
		resposta = sc.nextInt();
		System.out.println("Qual número deseja saber a tabuada?: ");
		numero = sc.nextInt();
		if (resposta == 1) {
			System.out.println("Tabuada de adição do número "+(numero));
			System.out.println(numero+" + 1 = "+(numero+1));
			System.out.println(numero+" + 2 = "+(numero+2));
			System.out.println(numero+" + 3 = "+(numero+3));
			System.out.println(numero+" + 4 = "+(numero+4));
			System.out.println(numero+" + 5 = "+(numero+5));
			System.out.println(numero+" + 6 = "+(numero+6));
			System.out.println(numero+" + 7 = "+(numero+7));
			System.out.println(numero+" + 8 = "+(numero+8));
			System.out.println(numero+" + 9 = "+(numero+9));
			System.out.println(numero+" + 10 = "+(numero+10));
		}
		if (resposta == 2) {
			System.out.println("Tabuada de substração do número "+(numero));
			System.out.println(numero+" - 1 = "+(numero-1));
			System.out.println(numero+" - 2 = "+(numero-2));
			System.out.println(numero+" - 3 = "+(numero-3));
			System.out.println(numero+" - 4 = "+(numero-4));
			System.out.println(numero+" - 5 = "+(numero-5));
			System.out.println(numero+" - 6 = "+(numero-6));
			System.out.println(numero+" - 7 = "+(numero-7));
			System.out.println(numero+" - 8 = "+(numero-8));
			System.out.println(numero+" - 9 = "+(numero-9));
			System.out.println(numero+" - 10 = "+(numero-10));
		}
		if (resposta == 3) {
			System.out.println("Tabuada de multiplicação do número "+numero+":");
			System.out.println(numero+" x 1 = "+(numero*1));
			System.out.println(numero+" x 2 = "+(numero*2));
			System.out.println(numero+" x 3 = "+(numero*3));
			System.out.println(numero+" x 4 = "+(numero*4));
			System.out.println(numero+" x 5 = "+(numero*5));
			System.out.println(numero+" x 6 = "+(numero*6));
			System.out.println(numero+" x 7 = "+(numero*7));
			System.out.println(numero+" x 8 = "+(numero*8));
			System.out.println(numero+" x 9 = "+(numero*9));
			System.out.println(numero+" x 10 = "+(numero*10));
		}
		if (resposta == 4) {
			System.out.println("Tabuada de divisao do número "+numero+":");
			System.out.println(numero+" / 1 = "+(numero/1));
			System.out.println(numero+" / 2 = "+(numero/2));
			System.out.println(numero+" / 3 = "+(numero/3));
			System.out.println(numero+" / 4 = "+(numero/4));
			System.out.println(numero+" / 5 = "+(numero/5));
			System.out.println(numero+" / 6 = "+(numero/6));
			System.out.println(numero+" / 7 = "+(numero/7));
			System.out.println(numero+" / 8 = "+(numero/8));
			System.out.println(numero+" / 9 = "+(numero/9));
			System.out.println(numero+" / 10 = "+(numero/10));
		}
	}
}