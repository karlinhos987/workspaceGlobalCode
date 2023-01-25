/**
 * 
 */
package Aj2Capitulo12.exemplos;

import java.util.Date;
import java.sql.*;
/**
 * @author karlinhos987
 *
 */

//ExemploP276_01
public class ExemploSemImport {
	public static void main(String[] args) {
		
		//O import explicito da classe Date do pacote util
		//O import do pacote inteiro sql, sendo assim o compilador assumi que irei utilizar a 
		//classe Date do pacote util
		Date data = new Date();

		System.out.println("java.util.Date = " + data);
	}
}
