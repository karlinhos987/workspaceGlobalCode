/**
 * 
 */
package Aj3Capitulo04.generics.dao.teste;

import java.util.Collection;

import Aj3Capitulo04.generics.dao.ClienteDAO;
import Aj3Capitulo04.generics.interfaces.IDataAccessObject;
import Aj3Capitulo04.generics.util.Cliente;

/**
 * @author karlinhos987
 *
 */

//ExemploP168_02
public class TesteClienteDAO {
	public static void main(String[] args) {
		IDataAccessObject<Cliente, Integer> clienteDAO = new ClienteDAO();
		Collection<Cliente> listagem = clienteDAO.readAll();
		
		for (Cliente c : listagem) {
			System.out.println(c);
		}
	}
}
