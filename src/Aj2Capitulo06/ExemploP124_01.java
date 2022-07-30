package Aj2Capitulo06;

public class ExemploP124_01 {
	private String fabricante;
	private static String placa;
	private int velocidade;
	public static int velocidadeMaximaPermitida = 60;
	
	public ExemploP124_01(String fabricante, String placa, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.placa = placa;
		this.velocidade = velocidade;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void acelerar(int deltaV) {
		this.velocidade += deltaV;
	}
	
	public boolean ultrapassouLimite() {
		return this.velocidade > this.velocidadeMaximaPermitida;
	}

	public static int getVelocidadeMaximaPermitida() {
		return velocidadeMaximaPermitida;
	}

	public static void setVelocidadeMaximaPermitida(int vmax) {
		ExemploP124_01.velocidadeMaximaPermitida = vmax;
		
		if(velocidade > velocidadeMaximaPermitida) {
			setVelocidade(velocidadeMaximaPermitida);
		}
	}
	
	
	
	
}
