/**
 * 
 */
package Aj3Capitulo01.testes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/**
 * @author karlinhos987
 *
 */

//ExemploP36_01
public class TesteLocale {
	public static void main(String[] args) {
		Locale franca = Locale.FRANCE;
		Locale alemanha = Locale.GERMANY;
		Locale eua = Locale.US;
		Locale brasil = new Locale("pt", "BR");
		Locale brasil2 = Locale.of("pt", "BR");
		Locale [] variosLocais = {franca, alemanha, eua, brasil, brasil2};
		
		Date data = new Date();
		System.out.println("data: " + data);
		
		for (int i = 0; i < variosLocais.length; i++) {
			Locale local = variosLocais[i];
			SimpleDateFormat formatador = new SimpleDateFormat("EEEE MMMM dd", local);
			
			System.out.println(formatador.format(data));
		}
	}
}
