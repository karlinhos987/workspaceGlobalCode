/**
 * 
 */
package Aj3Capitulo04.generics;

import java.util.ArrayList;

/**
 * @author karlinhos987
 *
 */

//ExemploP166_01
public class UsoEnhancedFor {
	public static void main(String[] args) {
		ArrayList<String> colecao = new ArrayList<String>();
		colecao.add(new String("String X"));
		colecao.add(new String("String Y"));
		colecao.add(new String("String Z"));
		
		for(String s : colecao) {
			System.out.println(s);
		}
	}
}
