/**
 * 
 */
package Aj2Capitulo13.model;

import Aj2Capitulo13.exceptions.NumeroInvalidoException2;

/**
 * @author karlinhos987
 *
 */

//ExemploP331_02
public class TesteEnderecoTratandoErro {
	public static void main(String[] args){
		try {
			Endereco end = new Endereco("Av. Jabaquara", 0);
		} catch (NumeroInvalidoException2 e) {
			e.printStackTrace();
		}
	}
}
