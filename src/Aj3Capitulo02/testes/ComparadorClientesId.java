/**
 * 
 */
package Aj3Capitulo02.testes;

import java.util.Comparator;

import Aj3Capitulo02.beans.Cliente;

/**
 * @author karlinhos987
 *
 */

//ExemploP90_01
public class ComparadorClientesId implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Cliente cl1 = (Cliente) o1;
		Cliente cl2 = (Cliente) o2;
		return cl1.getId() - cl2.getId();
	}
}