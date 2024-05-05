/**
 * 
 */
package Aj3Capitulo04.generics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * @author karlinhos987
 *
 */

//ExemploP175_01
public class TesteMapGenerics {
	public static void main(String[] args) throws NumberFormatException, ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Map<String, Pessoa> mapPessoas = new HashMap<String, Pessoa>();
		
		String rg1 = "123456789";
		mapPessoas.put(rg1, new Pessoa("Teste1", Long.parseLong(rg1),formato.parse("27/12/1995")));
		
		String rg2 = "987654321";
		mapPessoas.put(rg2, new Pessoa("Teste2", Long.parseLong(rg2),formato.parse("23/10/1995")));
		
		for (String chave : mapPessoas.keySet()) {
			Pessoa p = mapPessoas.get(chave);
			System.out.println(p.getNome());
		}
	}
}