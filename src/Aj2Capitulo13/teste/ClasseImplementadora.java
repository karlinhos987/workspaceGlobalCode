/**
 * 
 */
package Aj2Capitulo13.teste;

import java.io.IOException;

/**
 * @author karlinhos987
 *
 */

//ExemploP335_02
public class ClasseImplementadora implements Teste{
	public void metodoA() throws IOException {//nao pode lancar um erro diferente da assinatura do metodo
											//que esta definido na interface
		System.out.println("MetodoA");
	}
}
