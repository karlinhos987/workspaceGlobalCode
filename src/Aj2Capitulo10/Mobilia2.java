package Aj2Capitulo10;

//ExemploP233_01
public class Mobilia2 implements Transportavel{

	private String tipo;
	private String fabricante;
	private String material;
	private double altura, largura, profundidade;
	private double peso;
	
	public Mobilia2(String tipo, String fabricante, String material, double altura, double largura, double profundidade,
			double peso) {
		super();
		this.tipo = tipo;
		this.fabricante = fabricante;
		this.material = material;
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
		this.peso = peso;
	}
	
	/* * 
	 * Ao implementar a interface Transportavel, obrigatoriamente eu preciso implementar todos os seus metodos.
	 * Se não implementar todos os seus metodos, irá apresentar o erro
	 * The type Mobilia2 must implement the inherited abstract method Transportavel.getVolume()
	 * */
	
	/*
	 * public double getVolume() { double vol = this.altura * this.largura *
	 * this.profundidade; return vol; }
	 */
	public double getPeso() {
		return this.peso;
	}
	public int getEmpilhamentoMaximo() {
		return 2;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}