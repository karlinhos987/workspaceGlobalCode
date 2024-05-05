/**
 * 
 */
package Aj2Capitulo13;

/**
 * @author karlinhos987
 *
 */

//ExemploP320_01
public class ExemploMetodoThrowable2 {
	public static void main(String[] args) {
		int i = 23;
		int j = 0;
		try {
			double res = i / j;
			//impressao do resultado da divisao
			System.out.println( i + " / " + j + " = " + res);
		} catch (ArithmeticException e) {
			System.out.println("-----------TRATAMENTO DO ERRO-----------");
			System.out.println("Mensagem de erro para o usuario:");
			System.out.println("Divisão invalida!");
			System.out.println("----------------------------------------");
			System.out.println("\nSTACK TRACE: ");
			e.printStackTrace();
		}
	}
}