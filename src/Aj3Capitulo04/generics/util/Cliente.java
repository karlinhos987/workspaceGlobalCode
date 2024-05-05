/**
 * 
 */
package Aj3Capitulo04.generics.util;


/**
 * @author karlinhos987
 *
 */

//ExemploP168
public class Cliente{
	private String nome = null;
	private int id;
	private int qtdePedidos;
	
	public Cliente(int id, String nome, int numPedidos) {
		this.setId(id);
		this.setNome(nome);
		this.setQtdePedidos(numPedidos);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQtdePedidos() {
		return qtdePedidos;
	}

	public void setQtdePedidos(int qtdePedidos) {
		this.qtdePedidos = qtdePedidos;
	}

	@Override
	public String toString() {
		return "id: " + this.id + "\t" + "Nome: " + this.nome + "\t" 
					+ "Pedidos: " + this.qtdePedidos;
	}
}