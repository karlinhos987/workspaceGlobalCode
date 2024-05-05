/**
 * 
 */
package Aj3Apendice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * @author karlinhos987
 *
 */

//ExemploP182_01
public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private long rg;
	private String dataNascimento;
	
	public Pessoa(String nome, long rg, String dataNascimento) {
		this.nome = nome;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;}
	
	public void setNome(String nome) {
		this.nome = nome;}
	
	public long getRg() {
		return rg;}
	
	public void setRg(long rg) {
		this.rg = rg;}
	
	public String getDataNascimento() {
		return dataNascimento;}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;}
	
	
	@Override
	public int hashCode() {
		return (int)rg + nome.hashCode();
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + getNome() + 
				", rg=" + getRg() + 
				", dataNascimento=" +getDataNascimento() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(nome, other.nome)
				&& rg == other.rg;
	}
	
	@Override
	public int compareTo(Pessoa p) {
		String dadosCompletos = this.nome + this.rg;
		String dadosCompletosOutraPessoa = p.nome + p.rg;
		return dadosCompletos.compareTo(dadosCompletosOutraPessoa);
	}	
}