/**
 * 
 */
package Aj2Capitulo13.exemplos.erros;

import java.io.IOException;

/**
 * @author karlinhos987
 *
 */

//ExemploP333_01
public class ExemploCatchInvalido {
	public static void main(String[] args) {
		try {
			System.out.println("Dentro do bloco try");
		}catch(IOException e ) {
			e.printStackTrace();
		}
	}
}
