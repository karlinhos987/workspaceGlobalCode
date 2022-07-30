package Aj2Capitulo01;

public class ExemploP55_01 {
	double preco;
	String descricao;
	String marca;
	
	void inicializaValores(double umPreco, String umaDescricao, String umaMarca) {
		alterarPreco(umPreco);
		setDescricao(umaDescricao);
		setMarca(umaMarca);
	}
		
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
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
			System.out.printf("Novo preço = %2.2f",preco);
		}else {
			System.out.println("\naumento deve ser maior do que zero");
		}
	}

	void imprime() {
		System.out.println("\n--------------------");
		System.out.println("Produto: " + descricao);
		System.out.println("Marca: " + marca);
		System.out.printf("Preço: %2.2f",preco);
		System.out.println("\n--------------------");
	}
}