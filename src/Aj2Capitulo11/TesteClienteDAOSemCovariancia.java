/**
 * 
 */
package Aj2Capitulo11;

/**
 * @author karlinhos987
 *
 */

//ExemploP255_01
public class TesteClienteDAOSemCovariancia {
	public static void main(String[] args) {
		ClienteDAOSemCovariancia dao = new ClienteDAOSemCovariancia();
		Cliente c = (Cliente) dao.getByPrimaryKey(new Integer(20));
	}
}
