/**
 * 
 */
package Aj3Capitulo02.testes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import Aj3Capitulo02.beans.Pessoa5;

/**
 * @author karlinhos987
 *
 */

//ExemploP88_01
public class TestePessoa5 {
	public static void main(String[] args) {
	//criando varias instancias da classe pessoa
		Pessoa5 p1 = new Pessoa5("Joao Silva",123L,"01/01/2020");
		Pessoa5 p2 = new Pessoa5("Joao da Silva",1L,"02/02/2020");
		Pessoa5 p3 = new Pessoa5("Joana Soares",12L,"04/07/2020");
		Pessoa5 p4 = new Pessoa5("Katarina Moura",1237L,"27/03/2020");
		Pessoa5 p5 = new Pessoa5("Joao Silva",1233L,"25/03/2020");
		Pessoa5 p6 = new Pessoa5("Joao Silva",1234L,"09/06/2020");
		
		Set pessoas = new TreeSet();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);
		pessoas.add(p6);
		
		System.out.println("----------PESSOAS----------");
		Iterator pessoasIterator = pessoas.iterator();
		//while (pessoasIterator.hasNext()) {
		//	System.out.println(pessoasIterator.next());
		//}
				
		//for (int i = 0; i < pessoas.size(); i++) {
		//	System.out.println(pessoasIterator.next());
		//}
		
		for (Object object : pessoas) {
			System.out.println(pessoasIterator.next());
		}
	}
}
