/**
 * 
 */
package Aj3Capitulo01.testes;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author karlinhos987
 *
 */

//ExemploP44_01
public class TesteImpressaoFormatada {
	public static void main(String[] args) {
		String nome = "Jose da Silva";
		double pagamento = 6500;
		Date data = new Date();
		SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance();
		System.out.println(nome + " recebeu um pagamento de R$"
				+ formatadorMoeda.format(pagamento) +" no dia " + formatadorData.format(data));
	}
}
