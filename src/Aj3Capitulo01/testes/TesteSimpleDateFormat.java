/**
 * 
 */
package Aj3Capitulo01.testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author karlinhos987
 *
 */

//ExemploP32_01
public class TesteSimpleDateFormat {
	public static void main(String[] args) {
		Date dataOriginal = new Date();
		System.out.println("Data original: " + dataOriginal);
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		String textoFormatado = formatador.format(dataOriginal);
		System.out.println("Texto formatado: " + textoFormatado);
		
		String textParaConverter = "11/07/2023";
		Date dataConvertida = null;
		
		try {
			dataConvertida = formatador.parse(textParaConverter);
			System.out.println("Data convertida: " + dataConvertida);
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
