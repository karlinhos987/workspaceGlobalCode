/**
 * 
 */
package Aj3Capitulo02.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import Aj3Capitulo02.beans.Cliente;

/**
 * @author karlinhos987
 *
 */

//ExemploP95_01
public class TesteOrdenacao {
	public static void main(String[] args) {
		Integer[] elementos = {1,5,3,7,9,2,6,4,8,10};
		Arrays.sort(elementos);
		
		System.out.println("Array ordenado: ");
		System.out.println(Arrays.toString(elementos));
		
		List clientes = new ArrayList();
		clientes.add(new Cliente(1, "Cliente 01", 205));
		clientes.add(new Cliente(3, "Cliente 03", 2));
		clientes.add(new Cliente(1, "Cliente", 20));
		clientes.add(new Cliente(2, "Cliente 02", 89));
		
		ComparadorClientesId compId = new ComparadorClientesId();
		Collections.sort(clientes, compId);
		
		System.out.println("Lista ordernada: ");
		for (Object object : clientes) {
			System.out.println(object);
		}
		
		System.out.println("Lista ordernada: ");
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i));
		}
	}
}
