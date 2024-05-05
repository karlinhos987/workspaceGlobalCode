/**
 * 
 */
package Aj3Capitulo01.testes;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * @author karlinhos987
 *
 */

//ExemploP41_01
public class TesteNumberFormat {
	public static void main(String[] args) {
		//configuracao da localizacao
		String idioma = args[0];
		String pais = args[1];
		Locale localidade = new Locale(idioma, pais);
		
		//criando os formatadores
		NumberFormat formatadorNumerico = NumberFormat
				.getNumberInstance(localidade);
		NumberFormat formatadorMonetario = NumberFormat
				.getCurrencyInstance(localidade);
		NumberFormat formatadorPercentual = NumberFormat
				.getPercentInstance(localidade);
		
		//configurando o numero minimo de casas decimais
		formatadorNumerico.setMinimumFractionDigits(2);
		
		//formatando alguns valores
		System.out.println("numero: " + formatadorNumerico.format(1000));
		System.out.println("moeda: " + formatadorMonetario.format(150.4));
		System.out.println("percentual: " + formatadorPercentual.format(0.53));
		
		//lendo valores
		try {
			Number valor = formatadorNumerico.parse("1000");
			System.out.println("numero lido: " + valor);
		}catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
