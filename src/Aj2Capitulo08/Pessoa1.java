package Aj2Capitulo08;

public class Pessoa1 {
	protected Endereco1 endereco;
	protected String nome, rg;
	
	
	public Endereco1 getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco1 endereco) {
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
		System.out.print("Endere�o: " + this.getEndereco().getRua());
		System.out.print(", " + this.getEndereco().getNumero());
	}
	
	
}
