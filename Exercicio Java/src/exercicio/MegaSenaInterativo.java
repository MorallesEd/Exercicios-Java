package exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class MegaSenaInterativo {

	public static void main(String[] args) {		

		List<Integer> numeros = new ArrayList<>();
		
		for (int i = 1; i <= 60; i++) {
			numeros.add(i);
		}
		
		Collections.shuffle(numeros);
		List<Integer> escolhidos = numeros.subList(0, 6);
		String mostrar = "";
		Collections.sort(escolhidos);
				
		int resultado = JOptionPane.showConfirmDialog(null, "Vamos sortear os numeros da sorte?");
		
		if (resultado == JOptionPane.YES_OPTION) {
			for (Integer escolhido : escolhidos) {
				if (escolhido < 10) {
					mostrar = mostrar + ("0" + escolhido + " ");					
				} else {
					mostrar = mostrar + (escolhido + " ");					
				}					
			}
			JOptionPane.showMessageDialog(null, "Os numeros sorteados são: " + mostrar);			
		}		

	}
}
