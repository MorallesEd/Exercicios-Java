package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PontoVenda {

	public static void main(String[] args) {
		// variaveis
		double vt,dsc,tdesc,vpg,tr;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("Ponto de Venda");
		System.out.print("Valor Total: ");
		vt = teclado.nextDouble();
		System.out.print("Desconto: ");
		dsc = teclado.nextDouble();
		//processamento
		tdesc = vt - (vt * dsc) / 100;
		System.out.println("Total com desconto: R$" + formatador.format(tdesc));
		
		System.out.print("Valor pago: ");
		vpg = teclado.nextDouble();
		
		tr = vpg - tdesc;
		System.out.println("Troco: R$" + formatador.format(tr));
		
		teclado.close();

	}

}
