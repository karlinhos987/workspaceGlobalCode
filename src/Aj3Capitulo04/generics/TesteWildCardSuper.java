/**
 * 
 */
package Aj3Capitulo04.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author karlinhos987
 *
 */

//ExemploP172_01
public class TesteWildCardSuper {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		List<Number> b = new ArrayList<Number>();
		List<Object> c = new ArrayList<Object>();
		//List<String> d = new ArrayList<ObStringect>();
		
		imprimir(a);
		imprimir(b);
		imprimir(c);
		//imprimir(d);//cliente nao tem Serializable implementado
		
	}
	public static void imprimir(Collection<? super Integer> colecao) {
		for (Object object : colecao) {
			System.out.println(object);
		}
		
		//aceita add somente do tipo especifico
		colecao.add(Integer.valueOf(10));
	}
}
