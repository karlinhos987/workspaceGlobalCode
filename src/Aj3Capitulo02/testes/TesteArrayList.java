/**
 * 
 */
package Aj3Capitulo02.testes;

import java.util.ArrayList;
import java.util.List;

import Aj3Capitulo02.beans.Pessoa4;

/**
 * @author karlinhos987
 *
 */

//ExemploP76_01
public class TesteArrayList {
	public static void main(String[] args) {
		//instaciando objetos da classe pessoa
		Pessoa4 p1 = new Pessoa4("Teste1", 1223334444L, "01/01/1980");
		Pessoa4 p2 = new Pessoa4("Teste2", 12233344445L, "01/01/1990");
		Pessoa4 p3 = new Pessoa4("Teste3", 122333444456L, "01/01/1980");
		
		//adicionando as pessoas no ArrayList pessoas
		List pessoas = new ArrayList();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		imprimeElementos(pessoas);
		
		//removendo o elemento do indice 1
		System.out.println("\n===Removendo o elemento (1)");
		Pessoa4 pessoaRemovida = (Pessoa4) pessoas.remove(1);
		System.out.println(" Pessoa removida \n\t" + pessoaRemovida);
		
		imprimeElementos(pessoas);
	}
	//metodo auxiliar para impressao dos elementos do ArraylList
	private static void imprimeElementos(List pessoas) {
		System.out.println("\n===Numero de pessoas: " + pessoas.size());
		
		//imprimindo os elementos do array
		System.out.println("===Imprimindo todas as pessoas: ");
		
		for (int i = 0; i < pessoas.size(); i++) {
			System.out.println("(" + i + ") ==> " + pessoas.get(i));
		}
	}
}
