package Aj2Capitulo10;

//ExemploP235_01
public class Alimento extends AlimentoBase implements Transportavel, Perecivel{
	private int empilhamentoMaximo;
	private int diasDeValidade;
	
	public Alimento(String nome, int temperatura, double volumeVm3, 
			int pesoGramas, int empilhamentoMaximo,	int diasDeValidade) {
		super(nome, temperatura, volumeVm3, pesoGramas);
		this.empilhamentoMaximo = empilhamentoMaximo;
		this.diasDeValidade = diasDeValidade;
	}

	@Override
	public int getTemperaturaDeConservacao() {return super.getTemperatura();}

	@Override
	public double getVolume() {return super.getVolumeVm3();}

	@Override
	public double getPeso() {return getPesoGramas()/1000;}

	public int getEmpilhamentoMaximo() {return empilhamentoMaximo;}
	public void setEmpilhamentoMaximo(int empilhamentoMaximo) {	this.empilhamentoMaximo = empilhamentoMaximo;}
	
	/* *
	 * Todos os métodos numa interface são públicos.
	 * Não é possível restringir a acessibilidade numa sobrescrita de métodos. 
	 * */
	int getDiasDeValidade() {return diasDeValidade;}
	
	public void setDiasDeValidade(int diasDeValidade) {	this.diasDeValidade = diasDeValidade;}
}