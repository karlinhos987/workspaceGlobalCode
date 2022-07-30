package Aj2Capitulo08;

public class Pessoa5 {
	protected Endereco5 endereco;
	protected String nome;
	protected String rg;
	
	
	public Pessoa5(Endereco5 endereco2, String nome2, String rg2) {
		this.setEndereco(endereco2);
		this.setNome(nome2);
		this.setRg(rg2);
	}
	public Endereco5 getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco5 endereco) {
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
	
	public String toString() {
		String tmpPessoa = "Nome: " + nome + "\n";
		tmpPessoa += "RG: " + rg + "\n";
		tmpPessoa += "Endereço " + endereco.getRua() + ", " + endereco.getNumero();
		return tmpPessoa;
	}
	
	
}
