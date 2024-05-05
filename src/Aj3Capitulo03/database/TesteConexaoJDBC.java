/**
 * 
 */
package Aj3Capitulo03.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author karlinhos987
 *
 */

//ExemploP131_01
public class TesteConexaoJDBC {
	private static final String STR_DRIVER = "com.mysql.jdbc.Driver";
	private static final String NOME_BANCO = "Teste";
	private static final String STR_CON = "jdbc:mysql://127.0.0.1:3306/" + NOME_BANCO;
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName(STR_DRIVER);
			conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);
			System.out.println("Conectado!");
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Driver nao encontrado");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("Erro ao obter a conexao");
			e.printStackTrace();
		}
	}
}
