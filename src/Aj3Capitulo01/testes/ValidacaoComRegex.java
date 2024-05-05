/**
 * 
 */
package Aj3Capitulo01.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author karlinhos987
 *
 */

//ExemploP58_01
public class ValidacaoComRegex {
	public static void main(String[] args) {
		//String param = args[0];
		String param = "karlinhos987@sportsbet.io";
		if(validaEmail(param)) {
			System.out.println(param + " eh um email valido");
		}else {
			System.out.println(param + " nao eh um email valido");
		}
		
		if(validaFormatoCpf(param)) {
			System.out.println(param + " eh um cpf valido");
		}else {
			System.out.println(param + " nao eh um cpf valido");
		}
	}
	
	private static boolean validaEmail(String email) {
		return Pattern.matches("[A-Za-z0-9._-]+@([A-Za-z]+\\.)+[A-Za-z]+"
				, email);
	}
	
	private static boolean validaFormatoCpf(String cpf) {
		Pattern padraoCpf = Pattern
				.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
		Matcher matcher = padraoCpf.matcher(cpf);
		return matcher.matches();
	}
}
