package exercicio;

import java.util.Scanner;

public class JogoJokenPo {

	public static void main(String[] args) {
		// variaveis
		int jogador, computador;
		// objetos
		Scanner teclado = new Scanner(System.in);
		System.out.println("JokenPô");
		System.out.println("-----------");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		// entrada jogador
		System.out.print("Digite sua opção: ");
		jogador = teclado.nextInt();
		System.out.println(" ");
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
			System.out.println("Opção invalida");
			break;
		}
		//entrada computador
		computador = (int) (Math.random() * 3 + 1);
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu Pedra");
			break;
		case 2:
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura");
			break;
		}
		System.out.println(" ");
		//saida
		if (jogador == computador) {	
			System.out.println("Empate");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
				System.out.println("Jogador Vence");
			} else {
				System.out.println("Computador Vence");
			}
		}
		teclado.close();
	}
}
