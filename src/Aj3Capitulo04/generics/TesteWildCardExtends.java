/**
 * 
 */
package Aj3Capitulo04.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Aj3Capitulo04.generics.util.Cliente;

/**
 * @author karlinhos987
 *
 */

//ExemploP171_01
public class TesteWildCardExtends {
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		List<Integer> b = new ArrayList<Integer>();
		//List<Cliente> c = new ArrayList<Cliente>();
		
		imprimir(a);
		imprimir(b);
		//imprimir(c);//cliente nao tem Serializable implementado
		
	}
	public static void imprimir(Collection<? extends Serializable> colecao) {
		for (Object object : colecao) {
			System.out.println(object);
		}
	}
}
