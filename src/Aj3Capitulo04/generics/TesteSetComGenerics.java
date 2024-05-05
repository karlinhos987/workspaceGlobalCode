/**
 * 
 */
package Aj3Capitulo04.generics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author karlinhos987
 *
 */

//ExemploP174_02
public class TesteSetComGenerics {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Set<Pessoa> pessoas = new TreeSet<Pessoa>();
		pessoas.add(new Pessoa("Teste1", 123456789L, formato.parse("23/11/1995")));
		pessoas.add(new Pessoa("Teste2", 987654321L, formato.parse("27/12/1995")));
		
		for (Pessoa p : pessoas) {
			System.out.println(p.toString());
		}
		
		Set<Pessoa> pessoas2 = new TreeSet<Pessoa>(new ComparadorPorPessoaPorDataNascimento());
		pessoas2.add(new Pessoa("Teste1", 123456789L, formato.parse("23/11/1995")));
		pessoas2.add(new Pessoa("Teste2", 987654321L, formato.parse("27/12/1995")));
		
		for (Pessoa p : pessoas2) {
			System.out.println(p.toString());
		}
	}
}
