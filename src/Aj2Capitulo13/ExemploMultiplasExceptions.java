/**
 * 
 */
package Aj2Capitulo13;

/**
 * @author karlinhos987
 *
 */

//ExemploP325_01
public class ExemploMultiplasExceptions {
	public static void main(String[] args) {
		try {
			String num1 = args[0];
			String num2 = args[1];
			int i = Integer.parseInt(num1);
			int j = Integer.parseInt(num2);

			double res = i / j;
			// impressao do resultado da divisao
			System.out.println(i + " / " + j + " = " + res);
		} catch (ArithmeticException e) {
			System.out.println("-----------TRATAMENTO DO ERRO-----------");
			System.out.println("Mensagem de erro para o usuario:");
			System.out.println("Divisão invalida! " + e.getMessage());
			System.out.println("\nSTACK TRACE: ");
			e.printStackTrace();
			System.out.println("----------------------------------------");
		} catch ( e) {
			System.out.println("-----------TRATAMENTO DO ERRO-----------");
			System.out.println("Mensagem de erro para o usuario:");
			System.out.println("Dados invalidoa! " + e.getMessage());
			System.out.println("\nSTACK TRACE: ");
			e.printStackTrace();
			System.out.println("----------------------------------------");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("-----------TRATAMENTO DO ERRO-----------");
			System.out.println("Mensagem de erro para o usuario:");
			System.out.println("Digite dois parametros no main! " + e.getMessage());
			System.out.println("\nSTACK TRACE: ");
			e.printStackTrace();
			System.out.println("----------------------------------------");
		} finally {
			System.out.println("Passou pelo finally");
		}
	}
}