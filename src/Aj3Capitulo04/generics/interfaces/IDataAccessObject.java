/**
 * 
 */
package Aj3Capitulo04.generics.interfaces;

import java.util.Collection;

/**
 * @author karlinhos987
 *
 */

//ExemploP167_01
public interface IDataAccessObject<Entidade, PrimaryKey> {
	public void save(Entidade e);
	
	public void delete(Entidade e);
	
	public Collection<Entidade> readAll();
	
	public Collection<Entidade> readByPK(PrimaryKey key);
}
