package Aj2Capitulo09;


//ExemploP195_01
public class Cliente2 {
	public enum TipoCliente{PESSOA_FISICA, PESSOA_JURIDICA};
	
	private String nome;
	private String email;
	private TipoCliente tipo;
	
	public Cliente2(String nome, String email, TipoCliente tipo) {
		super();
		this.nome = nome;
		this.email = email;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}
}
