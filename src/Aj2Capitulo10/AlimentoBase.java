package Aj2Capitulo10;

//ExemploP225_01
public abstract class AlimentoBase {
	private String nome;
	private int temperatura;
	private double volumeVm3;
	private int pesoGramas;
	
	public AlimentoBase(String nome, int temperatura, double volumeVm3, int pesoGramas) {
		super();
		this.nome = nome;
		this.temperatura = temperatura;
		this.volumeVm3 = volumeVm3;
		this.pesoGramas = pesoGramas;
	}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public int getTemperatura() {return temperatura;}
	public void setTemperatura(int temperatura) {this.temperatura = temperatura;}
	public double getVolumeVm3() {return volumeVm3;}
	public void setVolumeVm3(double volumeVm3) {this.volumeVm3 = volumeVm3;}
	public int getPesoGramas() {return pesoGramas;}
	public void setPesoGramas(int pesoGramas) {this.pesoGramas = pesoGramas;}	
}