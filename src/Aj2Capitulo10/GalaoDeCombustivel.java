package Aj2Capitulo10;

//ExemploP229_01
public class GalaoDeCombustivel implements Inflamavel{
	private String nomeCombustivel;
	private double densidade;
	private int temperaturaDeTransporte;
	
	
	public GalaoDeCombustivel(String nomeCombustivel, double densidade, int temperaturaDeTransporte) {
		this.nomeCombustivel = nomeCombustivel;
		this.densidade = densidade;
		this.temperaturaDeTransporte = temperaturaDeTransporte;
	}

	@Override
	public double getVolume() {return 3785;}

	@Override
	public int getEmpilhamentoMaximo() {return 3;}
	
	@Override
	public int getTemperaturaMaxima() {return (int)(temperaturaDeTransporte * 1.4d);}
	
	@Override
	public double getPeso() {
		double pesoGramas = getVolume() * densidade;
		return pesoGramas / 1000;
	}
	
	public String getNomeCombustivel() {return nomeCombustivel;}
	public void setNomeCombustivel(String nomeCombustivel) {this.nomeCombustivel = nomeCombustivel;}
	public double getDensidade() {return densidade;}
	public void setDensidade(double densidade) {this.densidade = densidade;}
	public int getTemperaturaDeTransporte() {return temperaturaDeTransporte;}
	public void setTemperaturaDeTransporte(int temperaturaDeTransporte) {this.temperaturaDeTransporte = temperaturaDeTransporte;}
		
}
