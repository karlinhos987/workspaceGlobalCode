/**
 * 
 */
package Aj3Capitulo01.wrapper;

/**
 * @author karlinhos987
 *
 */

//ExemploP15_01
public class AutoboxingComExcecao {
	static Integer x;
	
	static void gerarExcecao(int z) {
		int z2 = 5;
		System.out.println(z2 - z);
	}
	
	public static void main(String[] args) {
		gerarExcecao(x);
	}
}
