/**
 * 
 */
package Aj3Capitulo02.testes;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * @author karlinhos987
 *
 */

//ExemploP112_01
public class TesteNavigableMap {
	public static void main(String[] args) {
		Integer[] chaves = {1,5,3,7,9,2,6,4,8,10};
		NavigableMap elementos = new TreeMap();
		
		for(Integer chave : chaves) {
			elementos.put(chave, "elemento" + chave);
		}
		
		Integer chaveMenor = (Integer) elementos.lowerKey(6);
		System.out.println("Primeira chave menor que 6 => " + chaveMenor);
		
		NavigableMap subConjunto = elementos.subMap(1, true, 5, true);
		System.out.println("Elementos do sub-conjunto");
		
		for(Object chave : subConjunto.keySet()){
			System.out.println("Chave: " + chave + "\tValor: " 
						+ subConjunto.get(chave));
		}
	}
}
