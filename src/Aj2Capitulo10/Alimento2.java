package Aj2Capitulo10;

//ExemploP226_01
public class Alimento2 extends AlimentoBase implements Transportavel, Perecivel{
	private int empilhamentoMaximo;
	private int diasDeValidade;
	
	public Alimento2(String nome, int temperatura, double volumeVm3, 
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
	public int getDiasDeValidade() {return diasDeValidade;}
	public void setDiasDeValidade(int diasDeValidade) {	this.diasDeValidade = diasDeValidade;}
}