package Aj3Capitulo01.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author karlinhos987
 *
 */

//ExemploP56_01
public class BuscaComRegex {
	private static String texto = "O 2º colocado chegou as 11h26m33s";
	
	public static void main(String[] args) {
		//String termoRegex = "\\d";
		//String termoRegex = "\\d\\d";
		//String termoRegex = "\\d\\dh\\d\\dm\\d\\ds";
		//String termoRegex = "..h..m";
		//String termoRegex = "\\d\\d[hms]";
		//String termoRegex = "\\d+\\w";
		String termoRegex = "(\\d+\\w)+";
		//Pattern padrao = Pattern.compile(args[0]);
		Pattern padrao = Pattern.compile(termoRegex);
		Matcher matches = padrao.matcher(texto);
		
		while (matches.find()) {
			System.out.println("Encontrei o valor '" + matches.group()
			+ "' na posicao " + matches.start());
		}
	}
}
