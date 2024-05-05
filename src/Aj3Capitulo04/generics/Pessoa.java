/**
 * 
 */
package Aj3Capitulo04.generics;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * @author karlinhos987
 *
 */

//ExemploP173_01
public class Pessoa implements Comparable<Pessoa>{
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private long rg;
	private Date dataNascimento;
	
	public Pessoa(String nome, long rg, Date dataNascimento) {
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
	
	public Date getDataNascimento() {
		return dataNascimento;}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + getNome() + 
				", rg=" + getRg() + 
				", dataNascimento=" + formato.format(getDataNascimento()) + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dataNascimento, nome, rg);
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