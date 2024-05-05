/**
 * 
 */
package Aj2Capitulo13;

/**
 * @author karlinhos987
 *
 */

//ExemploP323_01
public class ExemploTryFinally {
	public static void main(String[] args) {
		int i = 23;
		int j = 0;
		try {
			double res = i / j;
			//impressao do resultado da divisao
			System.out.println( i + " / " + j + " = " + res);
		}finally {
			System.out.println("Passou pelo finally");
		}
	}
}