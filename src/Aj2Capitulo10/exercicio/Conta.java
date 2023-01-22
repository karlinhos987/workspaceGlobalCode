package Aj2Capitulo10.exercicio;

public class Conta implements Tributavel {

	private double saldo;
	public String numero;
	public double acumuladoIFN;
	public double taxaIFN = 0.038;
	
	public double getSaldo() {return saldo;}
	public void deposito(double valor) {this.saldo += valor;}
	public void saque(double valor) {
		if(valor < this.saldo) {
			this.saldo -= valor;
		}
	}
	public String getNumero() {return numero;}
	public void setNumero(String numero) {this.numero = numero;}
	public double getAcumuladoIFN() {return acumuladoIFN;}
	private void setAcumuladoIFN(double acumuladoIFN) {this.acumuladoIFN = acumuladoIFN;}
	public double getTaxaIFN() {return taxaIFN;}
	public void setTaxaIFN(double taxaIFN) {this.taxaIFN = taxaIFN;}

	@Override
	public String getDescricaoTributavel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNomeImposto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calcularImposto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
