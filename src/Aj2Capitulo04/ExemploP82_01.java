package Aj2Capitulo04;

public class ExemploP82_01 {
	private double preco;
	private String descricao;
	private String marca;
	
	public void inicializaValores(double umPreco, String umaMarca) {
		this.alterarPreco(umPreco);
		this.setMarca(umaMarca);
	}
	
	public void inicializaValores(double umPreco, String umaDescricao, String umaMarca) {
		this.alterarPreco(umPreco);
		this.setDescricao(umaDescricao);
		this.setMarca(umaMarca);
	}
		
	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	void alterarPreco(double novoPreco) {
		if(novoPreco > 0) {
			this.preco = novoPreco;
		}
	}
	
	void aumentarPreco(double porcentagem) {
		if(porcentagem > 0) {
			System.out.println("aumentando o preço em " + porcentagem + "%");
			porcentagem = 1 - (porcentagem / 100);
			preco *= porcentagem;
			System.out.printf("Novo preço = %2.2f",this.getPreco());
		}else {
			System.out.println("\naumento deve ser maior do que zero");
		}
	}

	void imprime() {
		System.out.println("\n--------------------");
		System.out.println("Produto: " + this.getDescricao());
		System.out.println("Marca: " + this.getMarca());
		System.out.printf("Preço: %2.2f", this.getPreco());
		System.out.println("\n--------------------");
	}
}