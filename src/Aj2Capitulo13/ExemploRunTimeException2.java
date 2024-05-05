/**
 * 
 */
package Aj2Capitulo13;

/**
 * @author karlinhos987
 *
 */

//ExemploP318_02
public class ExemploRunTimeException2 {
	public static void main(String[] args) {
		int i = 23;
		int j = 0;
		try {
			double res = i / j;
			//impressao do resultado da divisao
			System.out.println( i + " / " + j + " = " + res);
		} catch (ArithmeticException e) {
			System.out.println("Divisão invalida!");
		}		
	}
}