package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HoraTrabalho {

	public static void main(String[] args) {
		// variaveis
		double sal,cop,chr,vhr;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("Calculo do valor da hora de serviço");
		System.out.print("Remuneração mensal: ");
		sal = teclado.nextDouble();
		//processamento1
		//imp = (sal * 30) / 100;
		//System.out.println("Valor do imposto que incide sobre sua remuneração: " + formatador.format(imp));
		//entrada
		System.out.print("Custo operacional: ");
		cop = teclado.nextDouble();
		//processamento2
		//inv = (sal * 20) / 100;
		//System.out.println("Valor do investimento sobre sua remuneraçao: " + formatador.format(inv));
		//entrada
		System.out.print("Carga horaria mensal de trabalho: ");
		chr = teclado.nextDouble();
		//processamento3
		vhr = (sal + (sal * 0.3) + cop + (sal * 0.2)) / chr;
		System.out.println("Seu valor hora de trabalho será de: R$" + formatador.format(vhr));
		
		teclado.close();
		

	}

}
