package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Porcentagem {

	public static void main(String[] args) {
		//variaveis
		double p,v,r;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("Calculo de Porcentagem");
		System.out.print("Digite a porcentagem: ");
		p = teclado.nextDouble();
		System.out.print("Digite um valor: ");
		v = teclado.nextDouble();
		//processamento
		r = (p * v) / 100;
		//saida
		System.out.println("Descontar " + p + "% de R$" + v + " fica R$" + formatador.format(r));
		teclado.close();

	}

}
