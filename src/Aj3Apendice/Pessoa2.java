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

//ExemploP185_01
public class Pessoa2 implements Comparable<Pessoa2>{
	
	private String nome;
	private long rg;
	private String dataNascimento;
	
	public Pessoa2(String nome, long rg, String dataNascimento) {
		this.setNome(nome);
		this.setRg(rg);
		this.setDataNascimento(dataNascimento);
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
		int resultado = 13;
		resultado = 37 * resultado + (int) ( rg ^ rg >>> 32);
		resultado = 37 * resultado + (nome != null ? nome.hashCode() : 0);
		return resultado;
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
		Pessoa2 other = (Pessoa2) obj;
		return Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(nome, other.nome)
				&& rg == other.rg;
	}
	
	@Override
	public int compareTo(Pessoa2 p) {
		String dadosCompletos = this.nome + this.rg;
		String dadosCompletosOutraPessoa = p.nome + p.rg;
		return dadosCompletos.compareTo(dadosCompletosOutraPessoa);
	}	
}