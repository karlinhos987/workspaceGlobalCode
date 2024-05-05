/**
 * 
 */
package Aj3Capitulo02.testes;

import Aj3Capitulo02.beans.Pessoa3;

/**
 * @author karlinhos987
 *
 */

//ExemploP71_01
public class TesteHashCode {
	public static void main(String[] args) {
		Pessoa3 p1 = new Pessoa3("Teste1", 1223334444L, "01/01/1980");
		Pessoa3 p2 = new Pessoa3("Teste2", 12233344445L, "01/01/1990");
		Pessoa3 p3 = new Pessoa3("Teste1", 1223334444L, "01/01/1980");
		
		System.out.println("codigo hash de p1: " + p1.hashCode());
		System.out.println("codigo hash de p2: " + p2.hashCode());
		System.out.println("codigo hash de p3: " + p3.hashCode());
		
		System.out.println("p1 equals p2: " + p1.equals(p2));
		System.out.println("p2 equals p3: " + p2.equals(p3));
		System.out.println("p3 equals p1: " + p3.equals(p1));
	}
}
