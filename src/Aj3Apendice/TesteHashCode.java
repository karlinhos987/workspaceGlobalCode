/**
 * 
 */
package Aj3Apendice;

/**
 * @author karlinhos987
 *
 */

//ExemploP183_01
public class TesteHashCode {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Teste", 123456789L, "09/05/1964");
		Pessoa p2 = new Pessoa("Teste", 123456789L, "27/04/1999");
		
		System.out.println("codigo hash de p1: " + p1.hashCode());
		System.out.println("codigo hash de p2: " + p2.hashCode());
		System.out.println("p1 equals p2:  " + p1.equals(p2));
	}
}
