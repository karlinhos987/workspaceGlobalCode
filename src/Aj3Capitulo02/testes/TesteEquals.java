/**
 * 
 */
package Aj3Capitulo02.testes;

import Aj3Capitulo02.beans.Pessoa;
import Aj3Capitulo02.beans.Pessoa2;

/**
 * @author karlinhos987
 *
 */

//ExemploP67_01
public class TesteEquals {
	public static void main(String[] args) {
		Pessoa2 p1 = new Pessoa2("Teste1", 1223334444L, "01/01/1980");
		Pessoa2 p2 = new Pessoa2("Teste1", 1223334444L, "01/01/1980");
		
		if(p1.equals(p2)) {
			System.out.println("p1 = p2 utilizando comparador equals");
		}else {
			System.out
			.println("p1 eh diferente de p2 utilizando comparador equals");
		}
	}
}
