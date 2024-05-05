/**
 * 
 */
package Aj3Capitulo01.testes;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author karlinhos987
 *
 */

//ExemploP38_01
public class TesteDateFormat {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 2);
		cal.set(Calendar.YEAR, 2023);
		Date data = cal.getTime();
		
		Locale franca = Locale.FRANCE;
		Locale alemanha = Locale.GERMANY;
		Locale eua = Locale.US;
		Locale brasil = Locale.of("pt", "BR");
		Locale[] variosLocais = {franca, alemanha, eua, brasil};
		
		for (Locale local : variosLocais) {
			DateFormat formatador = DateFormat
					.getDateInstance(DateFormat.LONG, local);
			System.out.println(formatador.format(data));
		}
	}
}
