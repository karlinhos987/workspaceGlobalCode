/**
 * 
 */
package Aj2Capitulo13.exemplos.erros;

/**
 * @author karlinhos987
 *
 */

//ExemploP334_01
public class ExemploMultiplasException {
	public static void main(String[] args) {
		int i = 23;
		int j = 0;
		try {
			double res = i/j;
			//impressao do resultado da divisao
			System.out.println(i + " / " + j + " = " + res);
		}catch(RuntimeException e) {
			System.out.println("Capturei uma RuntimeException");
		}catch(ArithmeticException e) {
			System.out.println("Divisao invalida! ");
		}
	}
}
