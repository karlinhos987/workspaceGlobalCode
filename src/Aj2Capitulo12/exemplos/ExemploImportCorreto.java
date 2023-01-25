/**
 * 
 */
package Aj2Capitulo12.exemplos;

/**
 * @author karlinhos987
 *
 */

//ExemploP275_01
public class ExemploImportCorreto {
	public static void main(String[] args) {
		java.util.Date data = new java.util.Date();
		//A data do pacte java.sql devera ser construida passando
		//um long referente ao numero de milisegundos desde 01/01/1970
		//obtem-se o numero de milisegundos desde 01/01/1970 chamando
		//o metodo getTime da classe java.util.Date
		long miliSegundos = data.getTime();
		java.sql.Date dataSQL = new java.sql.Date(miliSegundos);
		
		System.out.println("java.util.Date = " + data);
		System.out.println("java.sql.Date = " + dataSQL);
	}
}
