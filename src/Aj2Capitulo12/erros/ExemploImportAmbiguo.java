/**
 * 
 */
package Aj2Capitulo12.erros;

//Como a classe Date existe nos dois pacotes, nao eh possivel fazer a importacao da forma abaixo
import java.util.*;
import java.sql.*;
/**
 * @author karlinhos987
 *
 */

//ExemploP274_01
public class ExemploImportAmbiguo {
	public static void main(String[] args) {
		Date data = new Date();
		System.out.println("java.util.Date = "+data);
	}
}
