package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// valor do Kilowatts sob o salário e com desconto de 15%
		Scanner sc = new Scanner(System.in);
		double salario,qtdkw,vlrkw,valoreais,desc,vlrdesc;
		System.out.println("Digite o valor do seu salário: ");
		salario = sc.nextDouble();
		System.out.println("Digite a quantidade de Kilowatts consumido: ");
		qtdkw = sc.nextDouble();
		vlrkw = (salario/5)/100;
		valoreais = vlrkw*qtdkw;
		desc = valoreais*0.15;
		vlrdesc = valoreais-desc;
		System.out.println("O em reais de cada Killowatts ficará de: "+vlrkw);
		System.out.println("O valor em reais a ser pago em sua residência é de: "+valoreais);
		System.out.println("O valor em reais a ser pago com desconto de 15%, será de: "+vlrdesc);
	}

}
