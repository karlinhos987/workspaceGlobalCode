/**
 * 
 */
package Aj3Capitulo02.testes;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author karlinhos987
 *
 */

//ExemploP93_01
public class TesteSubConjunto {
	public static void main(String[] args) {
		Integer[] elementos = {1,2,3,4,5,6,7,8,9,10};
		NavigableSet colecao = new TreeSet();
		
		for (int i = 0; i < elementos.length; i++) {
			colecao.add(elementos[i]);
		}

		NavigableSet subConjunto1 = colecao.subSet(2, true, 7, true);
		System.out.println("Lista incluindo os extremos");
		for (Object object : subConjunto1) {
			System.out.print(object + " ");
		}
		
		NavigableSet subConjunto2 = colecao.subSet(2, false, 7, false);
		System.out.println("\nLista excluindo os extremos");
		for (Object object : subConjunto2) {
			System.out.print(object + " ");
		}
	}
}
