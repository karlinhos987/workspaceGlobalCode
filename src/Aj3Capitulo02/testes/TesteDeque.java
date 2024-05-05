/**
 * 
 */
package Aj3Capitulo02.testes;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author karlinhos987
 *
 */

//ExemploP102_01
public class TesteDeque {
	public static void main(String[] args) {
		Deque nomes = new ArrayDeque();
		nomes.add("Joao");
		nomes.add("Carlos");
		nomes.add("Luiza");
		nomes.add("Diego");
		nomes.add("Ana Paula");
		
		while(!nomes.isEmpty()) {
			System.out.println(nomes.pollLast());
		}
	}
}
