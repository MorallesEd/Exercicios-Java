package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		//variaveis
		double c,f;
		//objetos
		Scanner teclado =  new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//entrada
		System.out.println("Coversão de Temperatura");
		System.out.print("Digite uma temperatura em Fahrenheit: ");
		f = teclado.nextDouble();
		//processamento
		c = (f - 32) / 1.8;
		//saida
		System.out.println("Temperatura em Celsius: " + formatador.format(c) + "°C");
		teclado.close();

	}

}
