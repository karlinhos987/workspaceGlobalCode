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

//ExemploP92_01
public class TesteElementoMenor {
	public static void main(String[] args) {
		Integer[] elementos = {1,2,3,4,5,6,7,8,9,10};
		NavigableSet colecao = new TreeSet();
		
		for (int i = 0; i < elementos.length; i++) {
			colecao.add(elementos[i]);
		}
		Integer menorQueSeis = (Integer)colecao.lower(6);
		System.out.println(menorQueSeis);
	}
}
