package exercicio;

import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {
		//variaveis
		char opcao = 's';
		//objeto
		Scanner teclado = new Scanner(System.in);		
		//entrada		
		while (opcao == 's') {
			System.out.println("Lançamento do dado .........");
			int dado = (int) (Math.random() * 6 + 1);
			System.out.println("Face: " + dado);
			System.out.println("Deseja lançar o dado novamente (s/n)? ");
			opcao = teclado.next() .charAt(0);			
		}
		teclado.close();
	}
}
