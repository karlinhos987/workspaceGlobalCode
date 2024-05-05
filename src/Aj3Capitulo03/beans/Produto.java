/**
 * 
 */
package Aj3Capitulo03.beans;

import java.util.Objects;

/**
 * @author karlinhos987
 *
 */

//ExemploP139_01
public class Produto {
	private int id;
	private String nome;
	private int preco;
	
	public Produto() { super(); }
	
	public Produto(String nome, int preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(int id, String nome, int preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public int getId() { return id; }

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() { return nome; }

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPreco() { return preco; }

	public void setPreco(int preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return id == other.id && Objects.equals(nome, other.nome) && preco == other.preco;
	}
}