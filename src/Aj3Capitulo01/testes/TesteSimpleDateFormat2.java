/**
 * 
 */
package Aj3Capitulo01.testes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author karlinhos987
 *
 */

//ExemploP34_01
public class TesteSimpleDateFormat2 {
	public static void main(String[] args) {
		String mascara = "'Sao Paulo', E, dd, 'de' M 'de' yyyy";
		//E    -> qua.
		//EE   -> qua.
		//EEE  -> qua.
		//EEEE -> quarta-feira
		//M    -> 8
		//MM   -> 08
		//MMM  -> ago.
		//MMMM -> agosto
		
		/*
		 * y - ano
		 * M - mes
		 * d - dia do mes
		 * E - dia da semana
		 * a - marcador de am/pm
		 * H - hora de 0 a 23
		 * h - hora 1 a 12
		 * m - minutos
		 * s - segundos
		 * S - milissegundos
		 * 
		 * */
		SimpleDateFormat formatador = new SimpleDateFormat(mascara);
		SimpleDateFormat formatador2 = new SimpleDateFormat("HH:mm:ss S'ms'");
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 9);
		cal.set(Calendar.MONTH, Calendar.AUGUST);
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.HOUR_OF_DAY, 14);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 22);
		cal.set(Calendar.MILLISECOND, 512);
		Date data = cal.getTime();
		
		System.out.println("data original: " + data);
		String textoFormatado = formatador.format(data);
		System.out.println("texto formatado: " + textoFormatado);
		
		String textoFormatado2 = formatador.format(data);
		System.out.println("Outro texto formatado: " + textoFormatado2);
	}
}
