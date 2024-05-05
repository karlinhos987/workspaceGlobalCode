/**
 * 
 */
package Aj3Capitulo03.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Aj3Capitulo03.beans.Produto;
import Aj3Capitulo03.database.ConnectionManager2;

/**
 * @author karlinhos987
 *
 */

//ExemploP140_01
public class ProdutoDao {
	public void createTable() {
		Connection conn = ConnectionManager2.getConexao();
		Statement stmt = null;
		String sql = "CREATE TABLE IF NOT EXISTS Teste.produtos (";
		sql += " id int(3) NOT NULL AUTO_INCREMENT PRIMARY KEY, ";
		sql += " nome varchar(50) NOT NULL, ";
		sql += " preco int (10) NOT NULL);";
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Tabela de produtos criada com sucesso");
		}catch(SQLException e) {
			System.out.println("Erro na criacao da tabela produtos");
			System.out.println("SQL=" + sql);
			e.printStackTrace();
		}finally {
			ConnectionManager2.close(conn, stmt);
		}
	}
	
	public void save(Produto produto) {
		Statement stmt = null;
		String sql = null;
		
		//se o id for igual a zero o produto aina nao existe no banco,
		//portandom faremos um INSERT, caso contrario, faremos um UPDATE
		
		if(produto.getId() == 0) {
			sql = "INSERT INTO Teste.produtos (nome, preco) ";
			sql +=" VALUES ('" + produto.getNome() + "', ";
			sql += produto.getPreco() + " )";
		}else {
			sql = "UPDATE Teste.produtos SET nome = '" + produto.getNome() + "',";
			sql += " preco = " + produto.getPreco();
			sql += " WHERE id = " + produto.getId();
		}
		Connection conn = ConnectionManager2.getConexao();
		
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("SQL=" + sql);
		}catch(SQLException e) {
			System.out.println("Erro na execucao da query " + sql);
			e.printStackTrace();
		}finally {
			ConnectionManager2.close(conn, stmt);
		}
	}
}
