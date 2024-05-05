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

//ExemploP90_02
public class ComparadorClientesQtdePedidos implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Cliente cl1 = (Cliente) o1;
		Cliente cl2 = (Cliente) o2;
		return cl1.getQtdePedidos() - cl2.getQtdePedidos();
	}
}