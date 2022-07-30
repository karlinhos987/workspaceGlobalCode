package Aj2Capitulo08;

public class Pessoa4 {
	protected Endereco4 endereco;
	protected String nome;
	protected String rg;
	
	
	public Pessoa4(Endereco4 endereco2, String nome2, String rg2) {
		this.setEndereco(endereco2);
		this.setNome(nome2);
		this.setRg(rg2);
	}
	public Endereco4 getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco4 endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void imprime() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("RG: " + this.getRg());
		System.out.print("Endereço: " + this.getEndereco().getRua());
		System.out.print(", " + this.getEndereco().getNumero());
	}
	
	
}
