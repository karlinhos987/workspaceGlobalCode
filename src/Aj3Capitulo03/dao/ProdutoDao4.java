/**
 * 
 */
package Aj3Capitulo03.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Aj3Capitulo03.beans.Produto;
import Aj3Capitulo03.database.ConnectionManager2;
import Aj3Capitulo03.database.ConnectionManager3;

/**
 * @author karlinhos987
 *
 */

//ExemploP154_01
public class ProdutoDao4 {
	public void createTable() {
		Connection conn = ConnectionManager3.getConexao();
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
			ConnectionManager3.close(conn, stmt);
		}
	}
	
	public Produto save(Produto produto) {
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
		Connection conn = ConnectionManager3.getConexao();
		
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
			if (produto.getId() == 0) {
				ResultSet generateKeys = stmt.getGeneratedKeys();
				if(generateKeys.next()) {
					int id = generateKeys.getInt(1);
					produto.setId(id);
				}
			}
			System.out.println("SQL= " + sql);
			
			
		}catch(SQLException e) {
			System.out.println("Erro na execucao da query " + sql);
			e.printStackTrace();
		}finally {
			ConnectionManager3.close(conn, stmt);
		}
		return produto;
	}
	
	public Produto getProduto(int id) {
		String sql = "Select * from Teste.produtos where id = " + id;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Produto produto = null;
		
		try {
			conn = ConnectionManager3.getConexao();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				String nome = rs.getString("nome");
				int preco = rs.getInt("preco");
				produto = new Produto(id, nome, preco);
			}
		}catch(SQLException e) {
			System.out.println(e);
			System.out.println("SQL -> " + sql);
		}finally{
				ConnectionManager3.close(conn, stmt, rs);
		}
		
		return produto;
	}
	
	public List getAllProdutos() {
		String sql = "Select * from Teste.produtos";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List produtos = new ArrayList();
		
		try {
			conn = ConnectionManager3.getConexao();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String nome = rs.getString("nome");
				int preco = rs.getInt("preco");
				int id = rs.getInt("id");
				produtos.add(new Produto (id, nome, preco));
			}
		}catch(SQLException e) {
			System.out.println(e);
			System.out.println("SQL -> " + sql);
		}finally{
				ConnectionManager3.close(conn, stmt, rs);
		}
		
		return produtos;
	}
	
	public int delete(int id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "Delete from produtos where id = ? ";
		int qtdeRemovidos = 0;
		try {
			conn  = ConnectionManager3.getConexao();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			qtdeRemovidos = stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao tentar remover o produto de id = " + id);
		}finally {
			ConnectionManager3.close(conn, stmt);
		}
		
		return qtdeRemovidos;
	}
}
