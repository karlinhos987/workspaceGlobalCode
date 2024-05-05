/**
 * 
 */
package Aj3Capitulo01.testes;

import java.util.Calendar;
import java.util.Date;

/**
 * @author karlinhos987
 *
 */

//ExemploP28_01
public class TesteCalendarInstanciacao {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//captura a data atual
		Date data = cal.getTime();//retorna um  objeto java.util.Date
		System.out.println("data em cal " + data);
		data.setYear(99);//muda o ano para 1999
		cal.setTime(data);//configura nova data em cal
		System.out.println("data ajustada em cal: " + cal.getTime());
	}
}
