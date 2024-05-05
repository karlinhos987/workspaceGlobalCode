/**
 * 
 */
package Aj3Capitulo04.generics;

import java.util.ArrayList;

/**
 * @author karlinhos987
 *
 */

//ExemploP164_01
public class UsoCollectionTradicional {
	public static void main(String[] args) {
		ArrayList colecao = new ArrayList();
		String s = new String();
		colecao.add(s);
		String sr = (String) colecao.get(0);
	}
}
