package Aj2Capitulo06;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExemploP120_01 {
	public static void main(String[] args) {
		//metodos estaticos está associado a classe e não ao objeto
		System.out.println("Exemplos do uso da classe math");
		System.out.println("Raiz quadrada de 625: " + Math.sqrt(625));
		System.out.println("Número aleatorio: " + Math.random());
		System.out.println("4.7998167944987 arredondado: " + Math.round(4.7998167944987));

		System.out.println("\n\n");
		
		//exemplo de como arredondar as casas decimais
		double val1 = 4312.7998167944987;
		System.out.println("Double value: "+val1);

		BigDecimal bd = new BigDecimal(val1).setScale(4, RoundingMode.HALF_UP);
		double val2 = bd.doubleValue();
		System.out.println("Rounded Double value: "+val2);
		
		System.out.println("\n\n");
		
		double val11 = 4312.7998167944987;
		System.out.println("Double value: "+val11);

		BigDecimal bd2 = new BigDecimal(val11).setScale(4, RoundingMode.HALF_DOWN);
		double val22 = bd2.doubleValue();
		System.out.println("Rounded Double value: "+val22);
	}
}
