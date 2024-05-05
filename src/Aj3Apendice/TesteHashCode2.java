/**
 * 
 */
package Aj3Apendice;

/**
 * @author karlinhos987
 *
 */

//ExemploP185_02
public class TesteHashCode2 {
	public static void main(String[] args) {
		Pessoa2 p1 = new Pessoa2("Teste", 123456789L, "09/05/1964");
		Pessoa2 p2 = new Pessoa2("Teste", 123456789L, "27/04/1999");
		
		System.out.println("codigo hash de p1: " + p1.hashCode());
		System.out.println("codigo hash de p2: " + p2.hashCode());
		System.out.println("p1 equals p2:  " + p1.equals(p2));
	}
}
