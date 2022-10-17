package exercicio;

import java.util.Scanner;

public class DicaCombustivel {

	public static void main(String[] args) {
		// variaveis
		double g,a;
		//objetos
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Dica de qual combustivel usar");
		System.out.print("Preço do litro de alcool: ");
		a = teclado.nextDouble();
		System.out.print("Preço do litro de gasolina: ");
		g = teclado.nextDouble();
		//processo e saida
		if(a < g * 0.7) {
			System.out.println("Use alcool" );
		}else {
			System.out.println("Use gasolina" );
		}				
		teclado.close();
	}
}
