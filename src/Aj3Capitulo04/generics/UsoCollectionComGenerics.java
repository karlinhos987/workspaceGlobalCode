/**
 * 
 */
package Aj3Capitulo04.generics;

import java.util.ArrayList;

/**
 * @author karlinhos987
 *
 */

//ExemploP164_02
public class UsoCollectionComGenerics {
	public static void main(String[] args) {
		ArrayList<String> colecao = new ArrayList<String>();
		String s = new String();
		colecao.add(s);
		String sr = colecao.get(0);
	}
}
