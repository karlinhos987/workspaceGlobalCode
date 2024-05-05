/**
 * 
 */
package Aj2Capitulo13.exceptions;

/**
 * @author karlinhos987
 *
 */

//ExemploP332_01
public class GlobalcodeException extends Exception {
	public GlobalcodeException(String mensagem, Exception e) {
		super(mensagem, e);
		e.printStackTrace();
		this.print();
	}
	
	public GlobalcodeException(String mensagem) {
		super(mensagem);
	}
	
	public void print() {
		System.out.println("==========Tratando erro==========");
		System.out.println(getMessage());
		System.out.println("PrintStackTrace: ");
		
		//Obtivemos a excecao causadora do problema passada como parametro
		//no construtor
		System.out.println("==========Fim do tratamento==========");
	}
}
