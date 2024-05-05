/**
 * 
 */
package Aj3Capitulo02.testes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import Aj3Capitulo02.beans.Cliente;

/**
 * @author karlinhos987
 *
 */

//ExemploP91_01
public class TesteComparator {
	public static void main(String[] args) {
		Cliente cl1 = new Cliente(1,"Cliente 01", 205);
		Cliente cl2 = new Cliente(2,"Cliente 02", 403);
		Cliente cl3 = new Cliente(3,"Cliente 03", 89);
		Cliente cl4 = new Cliente(4,"Cliente 04", 20);
		
		ComparadorClientesQtdePedidos comp = 
				new ComparadorClientesQtdePedidos();
		
		Set ts = new TreeSet(comp);
		ts.add(cl1);
		ts.add(cl2);
		ts.add(cl3);
		ts.add(cl4);
		
		Iterator it = ts.iterator();
		
		System.out.println("\nUtilizando ComparadorClientesQtdePedidos");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		ComparadorClientesId compId = new ComparadorClientesId();
		Set ts2 = new TreeSet(compId);
		ts2.addAll(ts);
		
		Iterator it2 = ts2.iterator();
		System.out.println("\nUtilizando ComparadorClientesId");
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}
