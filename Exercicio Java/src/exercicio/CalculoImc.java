package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// variaveis
		double peso,alt,imc;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("Calculo do IMC");
		System.out.print("Qual o seu peso: ");
		peso = teclado.nextDouble();
		System.out.print("Qual a sua altura: ");
		alt = teclado.nextDouble();
		//processo e saida
		imc = peso / (alt * alt);
		if (imc < 18.5) {
			System.out.println("IMC: " + formatador.format(imc) + " - Abaixo do peso");
		} else if (imc >= 18.6 && imc <= 24.9) {
			System.out.println("IMC: " + formatador.format(imc) + " - Peso ideal");
		}else if (imc >= 25.0 && imc <= 29.9){
			System.out.println("IMC: " + formatador.format(imc) + " - Levemente acima do peso");
		}else if (imc >= 30.0 && imc <= 34.9){
			System.out.println("IMC: " + formatador.format(imc) + " - Obesidade grau 1");
		}else if (imc >= 35.0 && imc <= 39.9){
			System.out.println("IMC: " + formatador.format(imc) + " - Obesidade grau 2 (severa)");
		}else {
			System.out.println("IMC: " + formatador.format(imc) + " - Obesidade 3 (mórbido)");
		}		
		teclado.close();
	}
}
