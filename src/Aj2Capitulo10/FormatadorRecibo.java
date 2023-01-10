package Aj2Capitulo10;

//ExemploP206_01
public abstract class FormatadorRecibo {
	private String nomeEmpresa;

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public String gerarRecibo(String nomeCliente, double valor,
			String data, String motivo) {
		
		return "Metodo em construcao";
	}
}
