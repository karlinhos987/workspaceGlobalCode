/**
 * 
 */
package Aj3Capitulo04.generics.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import Aj3Capitulo04.generics.database.ConnectionManager3;
import Aj3Capitulo04.generics.interfaces.IDataAccessObject;
import Aj3Capitulo04.generics.util.Cliente;

/**
 * @author karlinhos987
 *
 */

//ExemploP168_01
public class ClienteDAO implements IDataAccessObject<Cliente, Integer>{
	public ClienteDAO() {}
	
	public Collection<Cliente> readByPK(Integer key){
		String sql = "Select * from Teste.cliente where id = " + key;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Cliente cliente = null;
		Collection<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			conn = ConnectionManager3.getConexao();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				String nome = rs.getString("nome");
				int qtdePedidos = rs.getInt("qtdePedidos");
				cliente = new Cliente(key, nome, qtdePedidos);
				clientes.add(cliente);
			}
		}catch(SQLException e) {
			System.out.println(e);
			System.out.println("SQL -> " + sql);
		}finally{
				ConnectionManager3.close(conn, stmt, rs);
		}
		
		return clientes;
	}
	
	public void save(Cliente cliente) {
		Statement stmt = null;
		String sql = null;
		
		//se o id for igual a zero o produto aina nao existe no banco,
		//portandom faremos um INSERT, caso contrario, faremos um UPDATE
		
		if(cliente.getId() == 0) {
			sql = "INSERT INTO Teste.cliente (nome, setQtdePedidos) ";
			sql +=" VALUES ('" + cliente.getNome() + "', ";
			sql += cliente.getQtdePedidos() + " )";
		}else {
			sql = "UPDATE Teste.cliente SET nome = '" + cliente.getNome() + "',";
			sql += " setQtdePedidos = " + cliente.getQtdePedidos();
			sql += " WHERE id = " + cliente.getId();
		}
		Connection conn = ConnectionManager3.getConexao();
		
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
			if (cliente.getId() == 0) {
				ResultSet generateKeys = stmt.getGeneratedKeys();
				if(generateKeys.next()) {
					int id = generateKeys.getInt(1);
					cliente.setId(id);
				}
			}
			System.out.println("SQL= " + sql);
			
			
		}catch(SQLException e) {
			System.out.println("Erro na execucao da query " + sql);
			e.printStackTrace();
		}finally {
			ConnectionManager3.close(conn, stmt);
		}
	}
	
	public Collection<Cliente> readAll(){
		String sql = "Select * from Teste.cliente";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Collection<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			conn = ConnectionManager3.getConexao();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String nome = rs.getString("nome");
				int qtdePedidos = rs.getInt("qtdePedidos");
				int id = rs.getInt("id");
				clientes.add(new Cliente (id, nome, qtdePedidos));
			}
		}catch(SQLException e) {
			System.out.println(e);
			System.out.println("SQL -> " + sql);
		}finally{
				ConnectionManager3.close(conn, stmt, rs);
		}
		
		return clientes;
	}
	
	public void delete(Cliente cliente) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		int id = cliente.getId();
				
		String sql = "Delete from produtos where id = ? ";
		int qtdeRemovidos = 0;
		try {
			conn  = ConnectionManager3.getConexao();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			qtdeRemovidos = stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao tentar remover o pedido de id = " + id);
		}finally {
			ConnectionManager3.close(conn, stmt);
		}
	}
}
