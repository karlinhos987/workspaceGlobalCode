package Aj2Capitulo10;

//ExemploP210_01
public class FormatadorModeloA2 extends FormatadorRecibo2{
	private String simboloMoeda;
	
	public String getSimboloMoeda() {return simboloMoeda;}

	public void setSimboloMoeda(String simboloMoeda) {
		this.simboloMoeda = simboloMoeda;
	}
	
	public String gerarRecibo(String nomeCliente, double valor, String data, String motivo) {
		
		return "Nos da " + super.getNomeEmpresa() + 
				" recebemos de " + nomeCliente + 
				" em " + data + 
				" o valor de " + this.getSimboloMoeda() +" "+ valor +
				" referente a " + motivo;
	}
}
