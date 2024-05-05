/**
 * 
 */
package Aj3Capitulo02.beans;

/**
 * @author karlinhos987
 *
 */

//ExemploP68_01
public class Pessoa {
	private String nome;
	private Long rg;
	private String dataNascimento;
	
	public Pessoa(String nome, Long rg, String dataNascimento) {
		this.setNome(nome);
		this.setRg(rg);
		this.setDataNascimento(dataNascimento);
	}
	
	public String getNome() {return nome; }
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getRg() {return rg;	}
	public void setRg(Long rg) {
		this.rg = rg;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}	
}
