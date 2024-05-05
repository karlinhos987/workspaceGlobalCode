/**
 * 
 */
package Aj3Capitulo01.testes;

import java.util.Calendar;

/**
 * @author karlinhos987
 *
 */

//ExemploP31_01
public class TesteCalendarManipulacao {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int minutos = cal.get(Calendar.MINUTE);
		int mes = cal.get(Calendar.MONTH);
		System.out.println("agora: " + cal.getTime());
		
		//dia 10 as 21h, 03 anos atras
		cal.add(Calendar.YEAR, -3);
		cal.set(Calendar.DAY_OF_MONTH, 10);
		cal.set(Calendar.HOUR_OF_DAY, 21);
		System.out.println("dia 10 as 21, 03 anos atras: " + cal.getTime());
		
		//9 da noite do dia 10
		cal.set(Calendar.DAY_OF_MONTH, 10);
		cal.set(Calendar.HOUR_OF_DAY,21);
		
		//o objeto cal representa
		//as 2 da madrugada do dia 10
		cal.roll(Calendar.HOUR_OF_DAY, 5); //+5 horas
		System.out.println("+ 5 horas com roll: " + cal.getTime());
	}
}
