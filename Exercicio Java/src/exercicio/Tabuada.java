package exercicio;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// variaveis
		int valor;
		//objetos
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("--------------------");
		System.out.println("      TABUADA       ");
		System.out.println("--------------------");
		System.out.print("Qual a tabuada que iremos executar: ");
		valor = teclado.nextInt();
		System.out.println("");
		/*System.out.println(" ");
		System.out.println(valor + "  X  1 = " + (valor * 1));
		System.out.println(valor + "  X  2 = " + (valor * 2));
		System.out.println(valor + "  X  3 = " + (valor * 3));
		System.out.println(valor + "  X  4 = " + (valor * 4));
		System.out.println(valor + "  X  5 = " + (valor * 5));
		System.out.println(valor + "  X  6 = " + (valor * 6));
		System.out.println(valor + "  X  7 = " + (valor * 7));
		System.out.println(valor + "  X  8 = " + (valor * 8));
		System.out.println(valor + "  X  9 = " + (valor * 9));
		System.out.println(valor + "  X 10 = " + (valor * 10));
		*/
		for (int i = 0; i <= 10; i++) {
			System.out.println(valor + " X " + i + " = " + (valor * i));;
		}
		teclado.close();
	}
}
