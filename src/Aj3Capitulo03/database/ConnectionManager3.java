/**
 * 
 */
package Aj3Capitulo03.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author karlinhos987
 *
 */

//ExemploP137_01
public class ConnectionManager3 {
	private static final String STR_DRIVER = "com.mysql.jdbc.Driver";
	private static final String NOME_BANCO = "Teste";
	private static final String STR_CON = "jdbc:mysql://127.0.0.1:3306/" + NOME_BANCO;
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	public static Connection getConexao()  {
		Connection conn = null;
		
		try {
			Class.forName(STR_DRIVER);
			conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);
			System.out.println("Conectado!");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver nao encontrado");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("Erro ao obter a conexao");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, Statement stmt) {
		try {
			if(stmt != null) {
				stmt.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		ConnectionManager3.close(conn);
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		ConnectionManager3.close(conn, stmt);
	}
}
