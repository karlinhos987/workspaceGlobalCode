package Aj2Capitulo10;

//ExemploP210_01
public abstract class FormatadorRecibo2 {
	private String nomeEmpresa;

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public abstract String gerarRecibo(String nomeCliente, double valor,
			String data, String motivo);
}
