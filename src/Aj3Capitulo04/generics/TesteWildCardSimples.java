/**
 * 
 */
package Aj3Capitulo04.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author karlinhos987
 *
 */

//ExemploP170_01
public class TesteWildCardSimples {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Maria");
		lista.add("Carlos");
		
		imprimir(lista);
	}
	public static void imprimir(Collection<?> colecao) {
		for (Object object : colecao) {
			System.out.println(object);
		}
	}
}
