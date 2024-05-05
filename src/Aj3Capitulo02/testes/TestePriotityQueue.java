/**
 * 
 */
package Aj3Capitulo02.testes;

import java.util.PriorityQueue;
import java.util.Queue;

import Aj3Capitulo02.beans.Cliente;

/**
 * @author karlinhos987
 *
 */

//ExemploP99_01
public class TestePriotityQueue {
	public static void main(String[] args) {
		ComparadorClientesQtdePedidos comp =
				new ComparadorClientesQtdePedidos();
		
		Queue clientes = new PriorityQueue(11,comp);
		
		clientes.add(new Cliente(1, "Cliente 01", 205));
		clientes.add(new Cliente(3, "Cliente 03", 2));
		clientes.add(new Cliente(1, "Cliente", 20));
		clientes.add(new Cliente(2, "Cliente 02", 89));
		
		while(!clientes.isEmpty()) {
			System.out.println("Processando cliente: ");
			System.out.println(clientes.poll());
		}
	}
}
