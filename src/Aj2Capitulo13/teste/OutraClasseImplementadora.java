/**
 * 
 */
package Aj2Capitulo13.teste;

import java.io.IOException;

import Aj2Capitulo13.exceptions.GlobalcodeException;

/**
 * @author karlinhos987
 *
 */

//ExemploP336_01
public class OutraClasseImplementadora implements Teste{
	public void metodoA() throws GlobalcodeException {
		//pode lancar um erro diferente da assinatura do metodo
		//que esta definido na interface, pois um dos errs esta na assinatura do metodo
		System.out.println("MetodoA");
	}
}
