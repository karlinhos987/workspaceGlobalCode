/**
 * 
 */
package Aj3Capitulo02.testes;

import Aj3Capitulo02.beans.Pessoa;

/**
 * @author karlinhos987
 *
 */

//ExemploP66_01
public class TesteComparacao {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Teste1", 1223334444L, "01/01/1980");
		Pessoa p2 = new Pessoa("Teste1", 1223334444L, "01/01/1980");
		
		if(p1 == p2) {
			System.out.println("p1 = p2 utilizando comparador ==");
		}else {
			System.out
			.println("p1 eh diferente de p2 utilizando comparador ==");
		}
	}
}
