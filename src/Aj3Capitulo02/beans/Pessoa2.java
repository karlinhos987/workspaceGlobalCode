/**
 * 
 */
package Aj3Capitulo02.beans;

import java.util.Objects;

/**
 * @author karlinhos987
 *
 */

//ExemploP68_02
public class Pessoa2 {
	private String nome;
	private long rg;
	private String dataNascimento;
	
	public Pessoa2(String nome, Long rg, String dataNascimento) {
		this.setNome(nome);
		this.setRg(rg);
		this.setDataNascimento(dataNascimento);
	}
	
	public String getNome() {return nome; }
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getRg() {return rg;	}
	public void setRg(long rg) {
		this.rg = rg;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataNascimento, nome, rg);
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Pessoa2 other = (Pessoa2) obj;
//		return Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(nome, other.nome)
//				&& Objects.equals(rg, other.rg);
//padrao eclipse
		
		//se nao for um parametro nulo retornaremos false
		if(obj == null) {return false;}
		
		//se nao for um objeto da classe pessoa retornaremos false
		if(! (this.getClass().equals(obj.getClass()))) {return false;}
	
		//se for um objeto da classe pessoa faremos o cast down
		Pessoa2 outra = (Pessoa2) obj;
		
		//verifica se os rgs sao iguais
		boolean rgsIguais = false;
		rgsIguais = this.getRg() == outra.getRg();
			
		//verifica se os nomes sao iguais
		boolean nomesIguais = false;
		if(this.getNome() != null) {
			nomesIguais = this.getNome().equals(outra.getNome());
		}else {
			nomesIguais = outra.getNome() == null;
		}
		
		//retorna o resulta da comparacao
		return rgsIguais && nomesIguais;
	}
}