/**
 * 
 */
package Aj3Capitulo04.generics;

import java.util.Comparator;

/**
 * @author karlinhos987
 *
 */

//ExemploP174_01
public class ComparadorPorPessoaPorDataNascimento implements Comparator<Pessoa>{
	public int compare(Pessoa p1, Pessoa p2) {
		return p1.getDataNascimento().compareTo(p2.getDataNascimento());
	}
}
