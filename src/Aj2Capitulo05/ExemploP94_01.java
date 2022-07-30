package Aj2Capitulo05;

public class ExemploP94_01 {
	private String nome;
	private String descricao;
	private String codigo;
	private int cargaHoraria;
	
	public ExemploP94_01(String nome, String desc, String cod, int carga) {
		this.setNome(nome);
		this.setCodigo(cod);
		this.setCargaHoraria(carga);
		this.setDescricao(desc);
	}

	public void imprime() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Codigo: " + this.getCodigo());
		System.out.println("Carga Horaria: " + this.getCargaHoraria());
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCargaHoraria() {
		return this.cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
}
