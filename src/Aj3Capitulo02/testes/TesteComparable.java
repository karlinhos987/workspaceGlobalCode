/**
 * 
 */
package Aj3Capitulo02.testes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author karlinhos987
 *
 */

//ExemploP86_01
public class TesteComparable {
	public static void main(String[] args) {
		Set nomes = new TreeSet();
		nomes.add("Joao");
		nomes.add("Maria");
		nomes.add("Ana Paula");
		nomes.add("Amanda");
		nomes.add("Joao");
		
		Iterator iterator = nomes.iterator();
		
		int i = 0;
		System.out.println("Lista dos Nomes: \n");
		while (iterator.hasNext()) {
			String nome = (String) iterator.next();
			System.out.println("Nome ["+ i++ +"] " + nome);
		}
	}
}
