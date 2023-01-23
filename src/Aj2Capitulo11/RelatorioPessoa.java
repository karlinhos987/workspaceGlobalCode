/**
 * 
 */
package Aj2Capitulo11;

import java.util.Iterator;

/**
 * @author karlinhos987
 *
 */

//ExemploP252_01
public class RelatorioPessoa {
	public void imprime(Pessoa p) {
		System.out.println("Nome: "+ p.getNome() + "\tRG: " + p.getRg());
	}
	
	public int imprimeArray(Pessoa[] ps) {
		int qtdeImpressa=0;
		
		for (int i = 0; i < ps.length; i++) {
			if(ps[i] == null) {
				continue;
			}
			imprime(ps[i]);
			qtdeImpressa++;
		}
		
		return qtdeImpressa;
	}
}
